package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day);    // System.out.println 사용시 객제를  day.toString() 메소드가 자동 실행되므로 문자열 MONDAY 로 반환됨
        System.out.println(day.name()); // enum에는 name() 메서드가 기본으로 존재하는데 MONDAY을 반환됨
        System.out.println(day.getKrDay()); // 월요일
    }
}
