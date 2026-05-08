package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArrayList {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> list = new ArrayList<>(10);    // new ArrayList<Integer>(10); 와 같다.

        list.add(1);    // add한 순서대로 0번방부터 들어감
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));    // 4

        // 정렬
        Collections.sort(list); // sort는 List으로 받아야 하므로 List<Integer> list 했음.
        System.out.println(list);   // [1, 2, 4, 5]

        // 향상된 for문
        for(int i : list) { // list를 루프돌면서 i에 담는다
            System.out.println(i);
        }

        list.forEach((i) -> {
            System.out.println(i);
        });

    }
}
