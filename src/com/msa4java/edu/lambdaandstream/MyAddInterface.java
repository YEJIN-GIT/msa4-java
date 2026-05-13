package com.msa4java.edu.lambdaandstream;

// 람다식을 사용하기 위해 정의하는 인터페이스이다는  어노테이션
@FunctionalInterface
public interface MyAddInterface {
    int plus(int a, int b);
}
