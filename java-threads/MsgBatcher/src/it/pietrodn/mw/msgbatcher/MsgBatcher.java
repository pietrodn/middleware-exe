package it.pietrodn.mw.msgbatcher;

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
		notifyAll();
	}

	public void sendAll() {
		synchronized (sender) {
			sender.notify();
		}
	}

	public static void main(String[] args) {
		MsgBatcher mb = new MsgBatcher(3);
		mb.enqueue(new Message(1));
		mb.enqueue(new Message(2));
		mb.enqueue(new Message(3));
		System.out.println("No message sent");
		mb.sendAll();
	}

	class SenderThread implements Runnable {
		public void run() {
			while (true) {
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				synchronized (MsgBatcher.this) {
					while (!queue.isEmpty()) {
						queue.remove().send();
						MsgBatcher.this.notify();
					}
				}
			}
		}
	}
}