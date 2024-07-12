package multiThreading.lockBased.SemaPhore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    Semaphore lock=new Semaphore(2);


    boolean isAvailable=false;


    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by :   " + Thread.currentThread().getName());

            isAvailable=true;
            Thread.sleep(6000);
        }catch (Exception ignored){

        }finally {
            lock.release();
            System.out.println("Locke released by   :  "+ Thread.currentThread().getName());
        }
    }


}
