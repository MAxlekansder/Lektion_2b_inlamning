package com.AlexanderHasslund.demo;
import java.util.ArrayList;
import java.util.List;

public class TestLists {

    public void arrayList() {

        List<Integer> testArrayList = new ArrayList<>();

        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);

        System.out.println(testArrayList);

        for (int i = 0; i < testArrayList.size(); i++) {
            if (testArrayList.get(i) == 2) {
                System.out.println("Nu är vi på index 2! " + testArrayList.get(i));
                System.out.println("Vi kan även ändra det här! ");
                testArrayList.set(2,10);
                System.out.println("Nu har vi istället: " + testArrayList.get(2));
            }
        }

        System.out.println(testArrayList);
        testArrayList.remove(3);
        System.out.println(testArrayList);
        testArrayList.remove(1);
        System.out.println(testArrayList);
    }
}
