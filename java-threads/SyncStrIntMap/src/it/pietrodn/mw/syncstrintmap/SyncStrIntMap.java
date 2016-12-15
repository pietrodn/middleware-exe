package it.pietrodn.mw.syncstrintmap;

import java.util.HashMap;
import java.util.Map;

public class SyncStrIntMap {

	private Map<String, Integer> map;

	public SyncStrIntMap(Map<String, Integer> map) {
		// Duplication to avoid escaping and loss of encapsulation.
		this.map = new HashMap<>(map);
	}

	public synchronized Integer get(String k) throws InterruptedException {
		while (!map.containsKey(k)) {
			wait();
		}
		return map.get(k);
	}

	public synchronized void put(String k, Integer v) throws InterruptedException {
		while (map.containsKey(k)) {
			wait();
		}
		map.put(k, v);
		notifyAll();
	}

	public synchronized Integer remove(String k) throws InterruptedException {
		while (!map.containsKey(k)) {
			wait();
		}
		Integer v = map.remove(k);
		notifyAll();
		return v;
	}

	public synchronized boolean containsKey(String k) {
		return map.containsKey(k);
	}

	public synchronized int size() {
		return map.size();
	}
}
