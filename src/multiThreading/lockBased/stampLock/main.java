package multiThreading.lockBased.stampLock;

public class main {
    public static void main(String[] args) {

        SharedResource sharedResource=new SharedResource();
        Thread t1=new Thread(()->{
            sharedResource.producer();
        });

        Thread t2=new Thread(()->{
            sharedResource.consumer();
        });

        t1.start();
        t2.start();

    }
}
