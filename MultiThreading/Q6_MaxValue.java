package com.bootcamp.multi;
import java.util.*;

/**
 * Created by gurleen on 6/10/18.
 */
public class Q6_MaxValue extends Thread {
    private int low, high;
    private int[] nums;
    private int max = Integer.MIN_VALUE;

    public Q6_MaxValue(int[] n, int low, int high) {
        this.nums = n;
        this.low = low;
        this.high = high;
    }
    @Override
    public void run() {
        for (int i = low; i < high; i++) {
            max = Math.max(max, nums[i]);
        }
    }
    public static int findMax(int[] numbers) throws InterruptedException {
        int length = numbers.length;
        int theMax = numbers[0];
        int n = 4;
        Q6_MaxValue[] threads = new Q6_MaxValue[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new Q6_MaxValue(numbers,(i * length) / n, ((i + 1) * length) / n);
            threads[i].start();
        }
        for (int i = 0; i < n; i++) {
            threads[i].join();
            theMax = Math.max(threads[i].max, theMax);
        }
        return theMax;
    }
    public static int[] populateData() {
        int a[] = {1,2,3,4,5,6,7,8,9};
        return a;
    }
    public static void main(String[] args) {
        try {
            int[] numbers = Q6_MaxValue.populateData();
            int m = Q6_MaxValue.findMax(numbers);
            System.out.println(Arrays.toString(numbers));
            System.out.println("Max value is: " + m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
