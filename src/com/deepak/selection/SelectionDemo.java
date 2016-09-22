package com.deepak.selection;

/**
 * Created by panded4 on 9/9/2016.
 */
public class SelectionDemo {
    public static void sortSelection() {
        int[] arr = {4, 3, 5, 8, 7, 1, 9, -1};
        int n = arr.length;
        for (int a : arr) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                final int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println();
        System.out.println("SelectionDemo.sortSelection");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        sortSelection();
    }
}

