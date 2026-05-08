package com.msa4java.edu.generics;

public class Box1 {
    public int[] arr = new int[10];
    private int nowIdx = 0;

    public void add(int val) {
        this.arr[nowIdx] = val;
        nowIdx++;
    }
}
