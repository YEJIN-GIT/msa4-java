package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **
        // 2 X 1 = 2
        // 2 X 2 = 4
        // ...
        // ** 3단 **
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 9 X 8 = 72
        // 9 X 9 = 81
        int dan = 2;

        for(int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
            for(int z = 1; z <= 9; z++) {
                String strMulti = String.format("%d  X %d = %d", i, z, i * z);
                System.out.println(strMulti);
            }
        }
    }
}
