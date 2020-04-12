package com.basic.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 ExecutorService es = Executors.newSingleThreadExecutor();
		 System.out.println("submitted callable task to calculate factorial 10");
		 Future<Long> result10 = es.submit(new FactorialCalculator(10));
		 System.out.println("submitted callable task to calculate factorial 15");
		 Future<Long> result15 = es.submit(new FactorialCalculator(15));
		 System.out.println("Calling Get method of future to get result 10");
		 long factorial10 = result10.get();
		 System.out.println("factorial of 10 is : " + factorial10);
		 System.out.println("Calling Get method of future to get result 15");
		 long factorial15 = result15.get();
		 System.out.println("factorial of 10 is : " + factorial15);
	}

}
class FactorialCalculator implements Callable<Long> {
    private int number;
    
    public FactorialCalculator(int number){
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return factorial(number);
    }

    private long factorial(int n) throws InterruptedException {
        long result = 1;
        while (n != 0) {
            result = n * result;
            n = n - 1;
            Thread.sleep(100);
        }

        return result;
    }

}


