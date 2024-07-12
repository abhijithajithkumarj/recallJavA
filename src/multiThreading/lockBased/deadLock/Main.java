package multiThreading.lockBased.deadLock;

public class Main {
    public static void main(String[] args) {

        System.out.println("main thread is started");

        SharedResource sharedResource=new SharedResource();

        Thread t1=new Thread(()->{
            System.out.println("Thread one is called producer methode ");
            sharedResource.producer();
        });


        t1.setDaemon(true);
        t1.start();


        System.out.println("finis t1");

//        Thread t2=new Thread(()->{
//            System.out.println("Thread tow is called producer Methode");
//
//            try
//            {
//                Thread.sleep(1000);
//            }catch (Exception ignored){
//
//            }
//            sharedResource.producer();
//        });

//        t1.start();
//        t2.start();
//
//
//
//        try
//        {
//            System.out.println("main thread is waiting thread 1");
//            t1.join();
//        } catch (InterruptedException ignored) {
//
//        }
//
//        System.out.println("main thread us finishing ");



    }
}
