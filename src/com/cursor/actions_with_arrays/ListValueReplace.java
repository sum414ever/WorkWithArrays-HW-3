package com.cursor.actions_with_arrays;

import java.util.ArrayList;

public class ListValueReplace {
    public void changeValueInArray(){
        ArrayList <String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        list.add("Four");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == "Tree"){
                list.set(i,"Three");
            }
        }System.out.println("If you see at this line Thre istead Three, I am a bad programmer --==>> " + list);
    }
}
