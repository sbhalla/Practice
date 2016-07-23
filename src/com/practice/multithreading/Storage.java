package com.practice.multithreading;

public class Storage {

	private static int counter;
	private static boolean readFlag;
	
	public Storage() {
		// TODO Auto-generated constructor stub
		readFlag=false;
		counter=0;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		Storage.counter = counter;
	}

}
