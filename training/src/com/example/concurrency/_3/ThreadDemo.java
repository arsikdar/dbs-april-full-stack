package com.example.concurrency._3;

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
			
		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();

		// Thread workerA = new Thread(taskA);
		// Thread workerB = new Thread(taskB);

		Thread workerA = new Thread(taskA, "WrokerA");
		Thread workerB = new Thread(taskB, "WorkerB");
		
		//workerA.setPriority(1);
		//workerB.setPriority(10);
	
		workerA.setPriority(Thread.MIN_PRIORITY);
		workerB.setPriority(Thread.MAX_PRIORITY);
		
		// workerA.setName("Worker-A");
		// workerB.setName("Worker-B");

		System.out.println(workerA.getName());
		System.out.println(workerA.getPriority());
		
		System.out.println(workerB.getName());
		System.out.println(workerB.getPriority());
			

		workerA.start();
		workerB.start();

	}

}

class TaskA implements Runnable {

	public void run() {

		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %s done by %s%n", i, Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class TaskB implements Runnable {

	public void run() {

		for (int j = 1; j <= 20; j++) {
			System.out.printf("J : %s done by %s%n", j, Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}