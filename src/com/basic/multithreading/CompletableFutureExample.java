package com.basic.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = new CompletableFuture<String>();
		//String res = completableFuture.get();
		boolean l = completableFuture.complete("hello");
		
		System.out.println("----------");
		System.out.println(l);
		
		//
		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
		    @Override
		    public void run() {
		        // Simulate a long-running Job
		        try {
		            TimeUnit.SECONDS.sleep(1);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
		        System.out.println("I'll run in a separate thread than the main thread.");
		    }
		});
		
		future.get();
		System.out.println("Result");
		
		

	}

}
