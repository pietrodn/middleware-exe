package it.pietrodn.mw.msgbatcher;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class MsgBatcher {
	private Queue<Message> queue;
	private final int maxMsg;

	private SenderThread sender;
	private Thread senderThread;

	public MsgBatcher(int maxMsg) {
		this.maxMsg = maxMsg;
		this.queue = new LinkedList<Message>();
		this.sender = new SenderThread();
		this.senderThread = new Thread(sender);
		this.senderThread.start();
	}

	public synchronized void enqueue(Message m) {
		while (queue.size() == maxMsg) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		queue.add(m);
		System.out.println(m + " in queue.");
	}

	public synchronized void sendAll() {
		System.out.println("sendAll()");
		sender.addToSendQueue(queue);
		queue.clear();
		notifyAll();
	}

	public static void main(String[] args) {
		MsgBatcher mb = new MsgBatcher(3);

		new Thread() {
			@Override
			public void run() {
				mb.enqueue(new Message(1));
				mb.enqueue(new Message(2));
				mb.sendAll();
				mb.enqueue(new Message(3));
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				mb.enqueue(new Message(4));
				mb.sendAll();
				mb.enqueue(new Message(5));
				mb.enqueue(new Message(6));
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				synchronized (this) {
					try {
						wait(1000);
						mb.sendAll();
						wait(6000);
						mb.sendAll();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

	class SenderThread implements Runnable {

		// Messages to be sent
		private Queue<Message> sendQueue;

		public synchronized void addToSendQueue(Collection<Message> messages) {
			sendQueue.addAll(messages);
			notify();
		}

		@Override
		public void run() {

			sendQueue = new LinkedList<Message>();

			while (true) {
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					while (!sendQueue.isEmpty()) {
						sendQueue.remove().send();
					}
				}
			}
		}
	}
}