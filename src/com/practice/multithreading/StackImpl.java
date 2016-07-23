package com.practice.multithreading;

public class StackImpl {

	private static int stack[];
	private static int topOfStack;
	private static int sizeOfStack;

	public StackImpl() {
		// TODO Auto-generated constructor stub
		sizeOfStack = 10;
		stack = new int[sizeOfStack];
		topOfStack = -1;
	}

	 public void push(int element) {
		topOfStack++;

		synchronized (StackImpl.class) {
			stack[topOfStack] = element;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	 public void pop() {
		int element;
		synchronized (StackImpl.class) {
			element = stack[topOfStack];
			topOfStack--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		final StackImpl stk = new StackImpl();

		new Thread("pusher") {
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " PUSH " + topOfStack);
					stk.push(1);
				}
			};
		}.start();
		new Thread("popper") {
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " POP " + topOfStack);
					stk.pop();
				}
			};
		}.start();
	}

}
