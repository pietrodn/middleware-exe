package it.pietrodn.mw.printerspooler;

public class PrintingSimulation {
	
	private static final int numClients = 5;
	private static final int clientIter = 3;
	private static final int printerIter = numClients * clientIter;
	
	public static void main(String[] args) throws InterruptedException {
		Spool spool = new Spool();
		
		// Initialize the printer
		Printer printer = new Printer(spool, printerIter);
		Thread printerThread = new Thread(printer);
		System.out.println("Printer: spawning!");
		printerThread.start();
		
		// Initialize the clients
		PrintClient clients[] = new PrintClient[numClients];
		Thread clientThreads[] = new Thread[numClients];
	
		for(int i=0; i<clients.length; i++) {
			clients[i] = new PrintClient(i, spool, clientIter);
			clientThreads[i] = new Thread(clients[i]);
			System.out.printf("Client %d: spawning!\n", i);
			clientThreads[i].start();
		}
		
		// Joining
		for(int i=0; i<clients.length; i++) {
			clientThreads[i].join();
			System.out.printf("Client %d: joining!\n", i);
		}
		printerThread.join();
		System.out.println("Printer: joining!");

	}

}
