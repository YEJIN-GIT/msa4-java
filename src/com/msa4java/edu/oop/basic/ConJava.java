package com.msa4java.edu.oop.basic;

public class ConJava {
    public int age;

    // 생성자 (Construct)
    // 클래스를 인스턴스화 할때, 딱 한번만 실행되는 메소드
    //    public ConJava() {} // 디폴트 생성자 (아무것도 정의하지 안은 경우)
    public ConJava(int age) {   // 직접 정의한 생성자 (정의만 생성자만 사용)
        this.age = age;
        this.test();
    }

    private void test() {
        System.out.println("테스트 샐행됨");
    }
}