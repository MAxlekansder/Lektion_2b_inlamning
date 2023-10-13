package com.AlexanderHasslundReverse.demo;

import java.util.ArrayList;
import java.util.List;

public class PopArray {

    public void popElement(List<Integer> popList) {
        List<Integer> newPopList = new ArrayList<>();


        for (int i : popList) {
            if (i >= 0) {
                newPopList.add(i);
            }
        }
        popList.removeAll(popList);
        System.out.println(newPopList);
    }
}