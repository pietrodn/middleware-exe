package it.pietrodn.mw.msgbatcher;

public class Message {

	private int id;

	public Message(int id) {
		this.id = id;
	}

	public synchronized void send() {
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Message " + this.id + " sent.");
	}

	@Override
	public String toString() {
		return String.format("Message %d", id);
	}
}
