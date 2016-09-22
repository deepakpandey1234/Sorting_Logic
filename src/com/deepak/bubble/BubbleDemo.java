package com.deepak.bubble;

/**
 * Created by panded4 on 9/9/2016.
 */
public class BubbleDemo {
    public static void sortBubble() {
        int[] arr = {4, 3, 5, 8, 7, 1, 9};
        for (int a : arr) {
            System.out.print(a + " ");
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("BubbleDemo.sortBubble");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        sortBubble();
    }
}
