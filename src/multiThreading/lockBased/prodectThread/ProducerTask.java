package multiThreading.lockBased.prodectThread;


public class ProducerTask implements Runnable {

    SharedResource sharedResource;

    public ProducerTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        System.out.println("producer thread :"+ Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (Exception ignored){

        }
        sharedResource.addItem();

    }
}
