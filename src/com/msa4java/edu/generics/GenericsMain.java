package com.msa4java.edu.generics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.add(2);
        box1.add(5);

        System.out.println(Arrays.toString(box1.arr));

        // Generics : 같은 클래스를 사용하지만 외부에서 데이터 타입을 지정
        Box2<String> box2 = new Box2<String>();
        box2.add("test");

        Box2<Integer> box2Int = new Box2<Integer>();
        box2Int.add(1);

        List<LocalDateTime> list1 = new ArrayList<>(10);
        list1.add(LocalDateTime.now());
        list1.add(LocalDateTime.of(2026, 5, 8, 17, 10, 50));

    }
}
