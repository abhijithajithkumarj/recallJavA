package multiThreading.ThreadPool.camparablefture;

import java.util.concurrent.*;

public class ThenComposeAndAsync {


    public static void main(String[] args) {
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
        }, poolExecutor).thenCompose((String val)->{
            return CompletableFuture.supplyAsync(()-> val +"work");
        }) .thenComposeAsync((String val)->{
            return CompletableFuture.supplyAsync(()-> val +"work testing");
        });
    }

}
