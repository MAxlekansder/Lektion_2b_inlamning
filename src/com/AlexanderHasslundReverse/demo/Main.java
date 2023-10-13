package com.AlexanderHasslundReverse.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PopArray poparray = new PopArray();

        List<Integer> popList = new ArrayList<>();
        popList.add(-1);
        popList.add(-3);
        popList.add(-4);
        popList.add(4);
        System.out.println(popList);
        poparray.popElement(popList);
        System.out.println(popList);

    }

}