package com.algos.threadz;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorSvcs {



    public static void main(String args[]){


        Runnable run0 =  () -> {

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Running run0");
        };

        Runnable run1 =  () -> {

            System.out.println("Running run1");
        };

        List<Runnable> runnables = new ArrayList<>();

        ExecutorService executorService =
                new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>());

        executorService.execute(run0);
        executorService.execute(run1);



    }
}
