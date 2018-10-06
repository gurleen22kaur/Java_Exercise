package com.bootcamp.multi;
import java.util.*;

/**
 * Created by gurleen on 6/10/18.
 */
public class Q5_SumOfElemetsOfArray extends Thread{
    private int low, high;
    private int[] nums;
    private int sum = 0;

    public Q5_SumOfElemetsOfArray(int[] n, int low, int high) {
        this.nums = n;
        this.low = low;
        this.high = high;
    }
    @Override
    public void run() {
        for (int i = low; i < high; i++) {
            sum = Math.addExact(sum, nums[i]);
        }
    }
    public static void main(String[] args) {
        try {
            int[] numbers = Q5_SumOfElemetsOfArray.populateData();
            int m = Q5_SumOfElemetsOfArray.findSum(numbers);
            System.out.println(Arrays.toString(numbers));
            System.out.println("Sum is: " + m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int findSum(int[] numbers) throws InterruptedException {
        int length = numbers.length;
        int sum = 0;
        int n = 4;
        Q5_SumOfElemetsOfArray[] threads = new Q5_SumOfElemetsOfArray[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new Q5_SumOfElemetsOfArray(numbers,(i * length) / n, ((i + 1) * length) / n);
            threads[i].start();
        }
        for (int i = 0; i < n; i++) {
            threads[i].join();
            sum = Math.addExact(threads[i].sum, sum);
        }
        return sum;
    }

    public static int[] populateData() {
        int a[] = {1,1,1,1,1,1,1,1,1};
        return a;
    }
}
