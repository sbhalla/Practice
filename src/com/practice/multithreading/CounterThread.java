package com.practice.multithreading;

public class CounterThread extends Thread {

	private int counter;
	
	public CounterThread(String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
		setCounter(0);
		// this will make the counter thread as daemon thread which will make the main thread at only user thread resulting in termination of execution of this thread once the user thread finished=s the execution
//		setDaemon(true);
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (getCounter() < 10) {
			System.out.println("Current Thread " + Thread.currentThread().getName()+" Counter: "+getCounter());
			try {
				setCounter(getCounter() + 1);
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
