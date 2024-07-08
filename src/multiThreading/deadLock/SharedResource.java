package multiThreading.deadLock;

public class SharedResource {


    boolean isAvailable=false;

    public synchronized void  producer(){

        System.out.println("lock acquired");
        isAvailable=true;


        try
        {
            Thread.sleep(8000);
        }catch (Exception ignored){

        }

        System.out.println("lock release");
    }
}
