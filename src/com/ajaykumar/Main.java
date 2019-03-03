package com.ajaykumar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of No's. :");
        int i = sc.nextInt();
        int[] seqNo = new int[i];
        Map<Integer, Integer> bucket = new HashMap<>();
        for (int j = 0; j < i; j++) {
            seqNo[j] = sc.nextInt();
        }
        int value;

        for (int j = 0; j < i; j++) {
            bucket.put(seqNo[j], 0);
        }
        for (int j = 0; j < i; j++) {
            value = bucket.get(seqNo[j]);
            value++;
            bucket.put(seqNo[j], value);

        }


        for (Integer key : bucket.keySet()) {

            System.out.println("key: " + key + " value: " + bucket.get(key));
        }
//        Integer keyIndex = null;
        Map.Entry<Integer, Integer> entry = bucket.entrySet().iterator().next();
        int largeValue = entry.getValue();
        int keyValue = entry.getKey();

        for (Map.Entry<Integer, Integer> iterate : bucket.entrySet()) {
            if (iterate.getValue() > largeValue) {
                largeValue = iterate.getValue();
                keyValue = iterate.getKey();
            }

        }
        System.out.println("Value:" + largeValue);
        System.out.println("Key :" + keyValue);


    }
}
