package com.msa4java.edu.oop.abstractclass;

// abstract : Mammal는 추상클래스가 된다.
public abstract class Mammal {
    protected String name;
    protected String residence;

    public Mammal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public void breath() {
        System.out.println(this.name + " 폐호흡 합니다.");
    }

    // 추상메소드 : 반드시 자식 클래스에서 오버라이드 해서 사용해야한다.
    public abstract void residence();
}
