package com.msa4java.edu;

public class E02Operator {
    public static void main(String[] args) {
        // 산출 연산자
        int num1 = 5;
        int num2 = 4;

        int sum = num1 + num2;
        System.out.println(sum);
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        System.out.println(divide);
        int mod = num1 % num2;
        System.out.println(mod);

        // 산술대입연산자
        num1 += 1;
        num1 -= 1;
        num1 *= 5;
        num1 /= 5;
        num1 %= 2;

        // 증감연산자
        num1++;
        ++num1;
        num1 = 0;
        System.out.println(num1++);
        System.out.println(num1);

        // 비교 연산자
        num1 = 1;
        num2 = 2;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열의 비교
        String str = "자바";
        System.out.println(str.equals("자바"));

        // 논리 연산자
        System.out.println(num1 == num2 && num1 > 3);
        System.out.println(num1 == num2 || num1 > 3);
        System.out.println(!(num1 == num2));

        // 삼항 연산자
        String result = num1 > num2 ? "num1이 큼" : "아아";
        System.out.println(result); // 아아
    }
}
