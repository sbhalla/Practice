package com.practice.multithreading;

public class CounterRunnable implements Runnable {

	private int counter;

	public CounterRunnable() {
		// TODO Auto-generated constructor stub

		counter = 0;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (counter < 6) {
			System.out.println("Current Thread " + Thread.currentThread().getName()+" Counter: "+getCounter());
			try {
				counter++;
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
