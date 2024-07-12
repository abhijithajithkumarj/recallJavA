package multiThreading.lockBased.prodectThread;

public class Main {


    public static void main(String[] args) {


        SharedResource sharedResource=new SharedResource();

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {

            }
            sharedResource.addItem();
        });



        Thread counsumerThread=new Thread
                (sharedResource::consumerItem);



        producerThread.start();
        counsumerThread.start();
    }
}
