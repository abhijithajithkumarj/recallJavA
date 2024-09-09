package multiThreading.ThreadPool.futureThread;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(2,3,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
        Future<?> futureObj=poolExecutor.submit(()-> System.out.println("something"));



        Future<Integer> futureObj2=poolExecutor.submit(()->{
            System.out.println("do something");
            return 55;
        });







    }
}
