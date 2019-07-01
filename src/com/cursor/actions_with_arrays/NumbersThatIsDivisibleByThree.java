package com.cursor.actions_with_arrays;

import java.util.ArrayList;

public class NumbersThatIsDivisibleByThree {
    public void removeAllNumbersThatIsDivisibleByThree() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %3 == 0){
                list.remove(list.get(i));
                i-=1;
            }
        }
        System.out.println("In this array list I removed all numbers that are divisible by 3  --==>>" + list);
    }

}
