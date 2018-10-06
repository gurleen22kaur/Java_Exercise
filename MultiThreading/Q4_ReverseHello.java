package com.bootcamp.multi;

/**
 * Created by gurleen on 6/10/18.
 */
class ReverseHello implements Runnable{
    int count;
    ReverseHello(int count){
        this.count = count;
    }

    public void run() {
        try{
            if(count < 10){
                Thread newThread = new Thread(new ReverseHello(count+1));
                newThread.setName("Thread "+ (count + 1));

                newThread.start();
                newThread.join();
            }
            System.out.println("Hello From " +Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Q4_ReverseHello {
    public static void main(String[] args) throws InterruptedException{
        ReverseHello reverseHello = new ReverseHello(1);
        Thread t1 = new Thread(reverseHello);
        t1.setName("Thread 1");
        t1.start();
        t1.join();
    }
}
