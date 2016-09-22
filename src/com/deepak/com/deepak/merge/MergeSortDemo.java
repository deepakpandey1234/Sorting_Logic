package com.deepak.com.deepak.merge;

import java.util.Arrays;

/**
 * Created by panded4 on 9/9/2016.
 */
public class MergeSortDemo {
    static void sortMerge(int[] arr) {
        if (arr.length > 1) {
            int q = arr.length / 2;

            int[] leftArray = Arrays.copyOfRange(arr, 0, q);
            int[] rightArray = Arrays.copyOfRange(arr, q, arr.length);

            sortMerge(leftArray);
            sortMerge(rightArray);

            merge(arr, leftArray, rightArray);
        }
    }

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        int i, li, ri;
        i = li = ri = 0;
        while (i < totElem) {
            if ((li < l.length) && (ri < r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                } else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            } else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 8, 7, 1, 9};
        for (int a : arr) {
            System.out.print(a + " ");
        }
        sortMerge(arr);
        System.out.println();
        System.out.println("MergeSortDemo.sortMerge");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
