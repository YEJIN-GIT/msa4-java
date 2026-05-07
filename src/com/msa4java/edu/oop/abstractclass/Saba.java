package com.msa4java.edu.oop.abstractclass;

public class Saba implements Swim {
    private String name;
    private String residence;

    public Saba(String name ){
        this.name = name;
        this.residence = "바다";
    }

    public void breath() {
        System.out.println(this.name + "아가미 호흡 합니다.");
    }

    public void swimming() {
        System.out.println(this.name + "헤업칩니다.");
    }
}
