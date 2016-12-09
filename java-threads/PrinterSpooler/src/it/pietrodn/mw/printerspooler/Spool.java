package it.pietrodn.mw.printerspooler;

import java.util.LinkedList;
import java.util.List;

public class Spool {
	// Important: the type of the jobs (Integer) must be immutable, since it's returned.
	private LinkedList<Integer> jobs;
	
	public Spool() {
		jobs = new LinkedList<Integer>();
	}
	
	public synchronized void addJob(Integer j) {
		jobs.add(j);
		notify();
	}
	
	public synchronized Integer getJob() throws InterruptedException {
		while(jobs.isEmpty()) {
			wait();
		}
		return jobs.pop();
	}
	
	public synchronized Boolean removeJob(Integer j) {
		return jobs.remove(j);
	}
	
	public synchronized List<Integer> getJobs() {
		// Clone to avoid reference escaping.
		return new LinkedList<Integer>(jobs);
	}
}
