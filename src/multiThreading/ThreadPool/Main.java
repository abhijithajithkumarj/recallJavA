package multiThreading.ThreadPool;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());


        for (int i = 1; i <=15; i++) {
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                }catch (Exception ignored){

                }
                System.out.println("task process by "+ Thread.currentThread().getName());
            });

        }

        executor.shutdown();
    }
}


class CustomThreadFactory implements  ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
       Thread th=new Thread(r);
       th.setPriority(Thread.NORM_PRIORITY);
       th.setDaemon(false);
       return th;
    }
}


