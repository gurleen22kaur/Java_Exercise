package com.bootcamp.multi;

class OddEvenPrint {

    boolean odd;
    int count = 1;
    int MAX = 20;

    public void printOdd() throws InterruptedException {
        synchronized (this) {
            while (count < MAX) {
                while (!odd) {
                    wait();
                }
                System.out.println("Odd  :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven() throws InterruptedException {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {


                while (odd) {
                    wait();
                }
                System.out.println("Even :" + count);
                count++;
                odd = true;
                notify();

            }
        }
    }
}


    public class Q1_OddEven {
        public static void main(String[] args) {


            OddEvenPrint oep = new OddEvenPrint();
            oep.odd = true;
            Thread t1 = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        oep.printEven();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
            Thread t2 = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        oep.printOdd();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

            t1.start();
            t2.start();
        }


    }



