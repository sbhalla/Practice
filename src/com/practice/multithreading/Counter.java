package com.practice.multithreading;

public class Counter extends Thread {

	private Storage storage = new Storage();
	private static int count;

	public void run() {
		while (true) {
			synchronized (storage) {
				if (storage.getCounter() == count) {
					storage.setCounter(count++);
					storage.notify();
				} else {
					try {
						storage.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	public Counter() {
		// TODO Auto-generated constructor stub
		count = 0;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

}
