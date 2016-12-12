package it.pietrodn.mw.executor;

public class Executor {
	
	private Runnable runn;
	private boolean stop;
	
	public Executor(Runnable runn) {
		this.runn = runn;
	}
	
	public void start() {
		new Thread() {
			public void run() {
				while(true) {
					synchronized(Executor.this) {
						if(stop) {
							break;
						} else {
							runn.run();
							try {
								Executor.this.wait(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}
		}.start();
	}
	
	public void stop() {
		stop = true;
	}
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello world!");
			}
		};
		
		Executor e = new Executor(r);
		e.start();
		
		new Thread() {
			public void run() {
				synchronized(this) {
					try {
						this.wait(5000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					e.stop();
				}
			}
		}.start();
	}
	
	
}
