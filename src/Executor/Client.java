package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Read more about newCachedThreadPool()
        // ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 100; i++) {
            if (i == 5 || i == 10 || i == 100) {
                System.out.println("Debug");
            }

            PrintNumber printNumber = new PrintNumber(i);
            executor.execute(printNumber);
        }
        executor.shutdown();
    }
}

//Numbers from 1 to 100 will be printed in random order.


