package com.basic.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//https://javarevisited.blogspot.com/2015/07/how-to-use-wait-notify-and-notifyall-in.html
public class ProducerConsumerExample {

	public static void main(String[] args) {

		System.out.println("How to use wait and notify method in Java");
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> buffer = new LinkedList<>();
		int maxsize = 10;
		Producer produce = new Producer(buffer, maxsize);
		Comsumer consume = new Comsumer(buffer, maxsize);
		Thread p = new Thread(produce);
		Thread c = new Thread(consume);
		p.start();
		c.start();
	}
}
class Producer implements Runnable {
	private Queue<Integer> queue;
	private int maxSize;

	public Producer(Queue<Integer> queue, int maxSize) {
		super();
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while(true) {
		synchronized (queue) {
			while (queue.size() == maxSize) {
				try {
					System.out.println("Queue is full, " + "Producer thread waiting for "
							+ "consumer to take something from queue");
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Random random = new Random();
			int i = random.nextInt();
			System.out.println("Producing value : " + i);
			queue.add(i);
			queue.notifyAll();

		}
	}

	}

}

class Comsumer implements Runnable {
	private Queue<Integer> queue;
	private int maxSize;

	public Comsumer(Queue<Integer> queue, int maxSize) {
		super();
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while(true) {
		synchronized (queue) {
			while (queue.isEmpty()) {
				try {
					System.out.println("Queue is empty," + "Consumer thread is waiting"
							+ " for producer thread to put something in queue");
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Consuming value : " + queue.remove());
			queue.notifyAll();
		}
		}
	}

}
