package com.msa4java.edu.oop;

public class Overloading {
    // 오버로딩
    // 메소드의 시그니처가 다르나, 동일한 이름을 가지는 메소드를 중복하여 정의
    public void print() {
        System.out.println("파라미터 없음");
    }

    public void print(char c) {
        System.out.println("파라미터 캐릭터: " + c);
    }

    public  void print(int a, int b) {
        int sum = a + b;
        System.out.println("두개 더한 값: " + sum);
    }
}
