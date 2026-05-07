package com.msa4java.edu.oop.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale("고래", "태평양");
        whale1.breath();

        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("날다람쥐", "숲");
        flyingSquirrel.breath();
    }
}
