package com.msa4java.edu.oop.abstractclass;

public class Whale extends Mammal implements Swim {
    public Whale(String name) {
        super(name, "바다");
    }

    @Override
    public void residence() {
        String output = String.format("%s에 산다. %s", this.residence, this.name);
        System.out.println(output);
    }

    @Override
    public void breath() {
        System.out.println("고래쪽 오버라이드");
    }

    public void swimming() {
        System.out.println(this.name + " 육중하게 헤엄칩니다.");
    }
}
