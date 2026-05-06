package com.msa4java.edu;

public class E03If {
    public static void main(String[] args) {
        int num1 = 5;

        if(num1 == 1) {
            System.out.println("1등");
        } else if(num1 == 2) {
            System.out.println("2등");
        } else if(num1 == 3) {
            System.out.println("3등");
        } else {
            System.out.println("순위 외");
        }

        switch (num1) {
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("기타");
                break;
        }

    }
}