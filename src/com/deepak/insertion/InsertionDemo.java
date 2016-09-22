package com.deepak.insertion;

/**
 * Created by panded4 on 9/9/2016.
 */
public class InsertionDemo {
    public static void sortInsertion() {
        int[] arr = {4, 3, 5, 8, 7, 1, 9};
        int n = arr.length;
        int i = 0;
        for (int a : arr) {
            System.out.print(a + " ");
        }
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            for (i = j - 1; i >= 0 && key < arr[i]; i--) {
                arr[i + 1] = arr[i];
            }
            arr[i+1]=key;
        }
        System.out.println();
        System.out.println("InsertionDemo.sortInsertion");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
      sortInsertion();
    }
}