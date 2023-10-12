package com.AlexanderHasslundReverse.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ReverseNumbers {

    List<Integer> numberList = new ArrayList<>();

    public void numberArrayList() {

        for (int i = 0; i <= 10; i++) {
            numberList.add(i);
        }
        System.out.println(numberList);
    }

    public void sortArrayList() {

        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println(numberList);
    }
}
