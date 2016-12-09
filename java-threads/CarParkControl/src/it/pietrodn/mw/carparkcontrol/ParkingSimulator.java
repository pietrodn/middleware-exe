package it.pietrodn.mw.carparkcontrol;

public class ParkingSimulator {
	
	private final static int capacity = 10;
	private final static int numCars = 10;
	private final static int numIter = 10;
	
	public static void main(String[] args) throws InterruptedException {
		Parking park = new Parking(capacity);
		CarThread cars[] = new CarThread[numCars];
		Thread threads[] = new Thread[numCars];
		
		int i;
		for(i=0; i<numCars; i++) {
			System.out.printf("%d: spawning!\n", i);
			cars[i] = new CarThread(i, park, numIter);
			threads[i] = new Thread(cars[i]);
			threads[i].start();
		}
		
		for(i=0; i<numCars; i++) {
			threads[i].join();
			System.out.printf("%d: joining!\n", i);
		}
		
	}

}
