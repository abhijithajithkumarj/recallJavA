package multiThreading.ThreadPool.camparablefture;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(2,3,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());



        CompletableFuture<String> asyncTask1=CompletableFuture.supplyAsync(()->{


            try{
                System.out.println("Thread name :   "  + Thread.currentThread().getName());
                Thread.sleep(5000);
            }catch (Exception ignored){

            }
            return "task complete";
        }, poolExecutor).thenApplyAsync((String val)->{
            System.out.println("Thread name then apply methode:   "  + Thread.currentThread().getName());

            return "and";
        });


    }
}
