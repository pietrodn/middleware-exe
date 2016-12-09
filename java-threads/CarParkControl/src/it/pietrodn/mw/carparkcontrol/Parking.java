package it.pietrodn.mw.carparkcontrol;

public class Parking {
	private int capacity;
	private int cars = 0;
	
	public Parking(int capacity) {
		super();
		this.capacity = capacity;
	}

	public synchronized int getCars() {
		return cars;
	}

	public synchronized void arrive() throws InterruptedException {
		while(cars >= capacity) {
			wait();
		}
		cars++;
		printCapacity();
		notifyAll();
	}
	
	public synchronized void leave() throws InterruptedException {
		while(cars<=0) {
			wait();
		}
		cars--;
		printCapacity();
		notifyAll();
	}
	
	private void printCapacity() {
		System.out.printf("Parking: capacity %d\n", capacity-cars);
	}
}
