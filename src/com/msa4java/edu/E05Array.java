package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        // 길이 3의 int 배열 생성 및 초기화
        int[] arrInt = new int[5];
        arrInt[2] = 50;
        System.out.println(Arrays.toString(arrInt));    // [0, 0, 50, 0, 0]

        // 길이4의 char 배열 생성 및 초기화(요소의 값도 세팅)
        char[] arrChar = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(arrChar));   // [a, b, c, d]
        System.out.println(arrChar);    // abcd

        // 배열의 복사
    //    int[] originArr = {1, 2, 3};
    //    int[] copyArr = originArr;
    //
    //    copyArr[1] = 555;
    //    System.out.println(originArr[1]); // 555

        // for문을 이용한 복사
    //    int[] originArr = {1, 2, 3};
    //    int[] copyArr = new int[originArr.length];
    //    for(int 1 = 0; i < originArr.length; i++) {
    //        copyArr[i] = originArr[i];
    //    }

        // System.arrarycopy() 이용해서 깊은 복사
    //    int[] originArr = {1, 2, 3};
    //    int[] copyArr = new int[originArr.length * 2];
    //    Arrays.arraycopy(originArr, 0, copyArr, 0, originArr.length);
    //    copyArr[1] = 55;
    //    System.out.println(originArr[1]);   // 2

        // Arrays.copyOf() 이용해서 깊은 복사
        int[] originArr = {1, 2, 3};
        int[] copyArr = new int[originArr.length * 2];
        copyArr = Arrays.copyOf(originArr, originArr.length);
        copyArr[1] = 55;
        System.out.println(originArr[1]);   // 2

        // 다차원 배열
        int[][] arrMD = {
                {1, 2, 3}
                ,{4, 5, 6}
                ,{7, 8, 9}
        };
        System.out.println(arrMD[2][2]);    // 9

        // 배열의 API
        int[] arrInt1 = {1, 2, 3};
        int[] arrInt2 = {1, 2, 3};

        System.out.println(arrInt1.length);

        // 일차원 배열이 같은지 비교
        System.out.println(Arrays.equals(arrInt1, arrInt2));    // true

        // 다차원 배열 같은지 비교
        int[][] arrIntDM1 = {{1, 2, 3},{4, 5, 6}};
        int[][] arrIntDM2 = {{1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepEquals(arrIntDM1, arrIntDM2));    // true

        // 배열의 정렬
        int[] arrSort = {5, 2, 76, 89, 1, 2};
        Arrays.sort(arrSort);  // 원본이 정렬됨!
        System.out.println(Arrays.toString(arrSort));
    }
}