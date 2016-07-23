package com.practice.multithreading;

public class MultiThreadingExample {

	public MultiThreadingExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// This example is for thread runnable
		
	/*	CounterRunnable CounterA = new CounterRunnable();
		Thread worker = new Thread(CounterA,"worker");
		
		worker.start();
		
		do{
		System.out.println("Main thread working "+Thread.currentThread().getName()+" Counter: "+CounterA.getCounter());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}while(CounterA.getCounter()<6);*/
		
		// This example is for Thread extende class
		
		CounterThread counterB=new CounterThread("CounterB");
		
		do{
			System.out.println("Main thread working "+Thread.currentThread().getName()+" Counter: "+counterB.getCounter());
			try {
				counterB.setCounter(counterB.getCounter()+1);;
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}while(counterB.getCounter()<6);
	}

}
