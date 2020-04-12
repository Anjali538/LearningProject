package com.basic.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameworkExample {

	public static void main(String[] args) {
		
		//ways to instantiate a Thread Pool Executor
		// 1. Indirectly instantiate it using one of its constructor overloads
		ExecutorService service1 = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		// 2. factory methods in the Executors class.
		ExecutorService service = Executors.newFixedThreadPool(10);
		//ExecutorService service1 = Executors.newCachedThreadPool();
		for(int i = 0; i<100;i++) {
			Future task = service.submit(new Task(i));
			try {
				System.out.println(task.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//service.execute(new Task(i));
		}
	}
}

class Task implements Runnable{
	
	private int TaskId;
	public Task(int taskId) {
		super();
		TaskId = taskId;
	}
	@Override
	public void run() {
		System.out.println("Task Id = " + this.TaskId +"Performed by" + Thread.currentThread().getName());
		
	}
	
}


