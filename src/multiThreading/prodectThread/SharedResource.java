package multiThreading.prodectThread;

public class SharedResource {


    boolean itemAvailable=false;

    public synchronized  void addItem(){
        itemAvailable=true;
        System.out.println("item added by :   "+ Thread.currentThread().getName()+" and invoking");
        notifyAll();
    }



    public synchronized void consumerItem(){
        System.out.println("consume Item methode invoked   "  + Thread.currentThread().getName()+"and invoking");
        while (!itemAvailable){
            try
            {
                System.out.println("thread   " + Thread.currentThread().getName());
                wait();

            }catch (Exception ignored) {

            }
        }
        System.out.println("item consumed by "+ Thread .currentThread().getName());
        itemAvailable=false;
    }
}
