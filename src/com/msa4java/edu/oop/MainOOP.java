package com.msa4java.edu.oop;

public class MainOOP {
    public static void main(String[] args) {
        // Whale 클래스를 인스턴스 생성
        Whale whale = new Whale();
        System.out.println(whale.name);
        whale.swimming();

        // static 멤버들에게 접근
        System.out.println(Whale.age);
        Whale.breath("테스트");

        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();

        // 오버로딩 테스트
        Overloading overloading = new Overloading();
        overloading.print(1,2);
    }
}