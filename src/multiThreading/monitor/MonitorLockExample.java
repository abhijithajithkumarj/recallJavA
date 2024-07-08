package multiThreading.monitor;

public class MonitorLockExample {


    public synchronized void task1(){
        try{
            System.out.println("inside the task 1");
            Thread.sleep(1000);
            System.out.println("task 1 complete");
        }catch (Exception ignored){

        }


    }


    public void task2(){
        System.out.println("before task 2 synchronized");
        synchronized (this){

            System.out.println("task 2 inside synchronized");


        }
    }

    public void  task3(){
        System.out.println("task 3 ");

    }
}
