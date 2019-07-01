package com.cursor.actionsWithArrays;

public class SumAllPositiveValues {
    public void addAllPositiveValues() {
        Integer[] array = new Integer[]{41, -41, 414, -414, 4141, -4141, 4, -4, -1, 1};
        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i]>=0){
                sum+=array[i];
            }
        }System.out.println("Sum all positive values in this array is " + sum);
    }
}
