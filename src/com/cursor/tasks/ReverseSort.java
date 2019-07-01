package com.cursor.tasks;

import java.util.Arrays;

public class ReverseSort {
    public void sortArrayByReverse() {
        System.out.println("I sorted all numbers in reverse");
        Integer[] arraySort = {2, 3, 1, 7, 11};
        Arrays.sort(arraySort);
        for (int i = arraySort.length - 1; i < arraySort.length; i--) {
            if (i < 0) {
                break;
            }
            System.out.println(arraySort[i]);
        }
    }
}