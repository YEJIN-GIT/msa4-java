package com.msa4java.edu.oop.basic;

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

        // 생성자
        ConJava conJava = new ConJava(20);  // 테스트 샐행됨
        ConJava conJava1 = new ConJava(30); // 테스트 샐행됨

        System.out.println(conJava.age);    // 20
        System.out.println(conJava1.age);   // 30

        Marine marine = new Marine(40, 6, 0);
        System.out.println(marine.getHp());
        marine.setHp(1000);
        System.out.println(marine.getHp());  // 1000

        Marine marine2 = new Marine();
        System.out.println(marine2.getHp()); // 40
    }
}