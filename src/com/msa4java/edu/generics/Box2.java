package com.msa4java.edu.generics;

public class Box2<T> {
    // <T> 외부에서 데이터 타입을 지정
    public T[] arr = (T[]) new Object[10];
    private int nowIdx = 0;

    public void add(T val) {
        this.arr[nowIdx] = val;
        nowIdx++;
    }
}
