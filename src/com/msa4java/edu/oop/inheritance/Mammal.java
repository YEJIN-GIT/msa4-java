package com.msa4java.edu.oop.inheritance;

// 클래스에 final 붙이면 상속 불가
public class Mammal {
    protected String name;
    protected String residence;

    public Mammal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    // 메소드에 final 붙이면 overloading 불가. 즉, 자식 Whale클래스의 breath()메소드에서 오류 발생.
    public void breath() {
        System.out.println(this.name + "이/가 폐호흡합니다.");
    }
}