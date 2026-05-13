package com.msa4java.edu;

import java.util.Arrays;
import java.util.List;

public class E06MethodReference {
    public static void main(String[] args) {
        // 메소드 참조 (자바8버전 부터)
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // 람다식 이용
        list.forEach(i -> System.out.println(i));

        // 메소드 참조 이용
        list.forEach(System.out::println);

        List<String> strList = Arrays.asList("HONG", "Dul");
        strList.forEach(str -> str.toUpperCase());  // 람다식 이용
        strList.forEach(String::toUpperCase);   // 메소드 참조 이용
    }
}
