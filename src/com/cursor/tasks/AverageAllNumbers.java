package com.cursor.tasks;

public class AverageAllNumbers {
    public void returnAverageAllNumbers(){
        Integer[] array = new Integer[]{41, -41, 414, -414, 4141, 4, -4, -1, 1};
        int sumAllNumbers = 0;
        for (int i = 0; i < array.length; i++)
            sumAllNumbers += array[i];
        System.out.println("Average all numbers is " + Double.valueOf(sumAllNumbers/array.length));
    }
}
