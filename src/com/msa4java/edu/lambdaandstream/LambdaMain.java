package com.msa4java.edu.lambdaandstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {
    public static void main(String[] args) {
        MyAddInterface myAddInterface = (a, b) ->  a + b;

        myAddInterface.plus(1, 2);
        // 자바에서 자주 사용하는 패턴을 표준API로 함수형 인터페이스 만들어 두었음
        // 그래서 인터페이스를 만들 필요는 없다.

        // -----------------
        // 스트림
        // -----------------
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("둘리");
        list.add("도우너");
        list.add("또치");

        // 1. 리스트를 스트림으로 생성
        Stream<String> stream = list.stream();  // 스트림으로 변환
        List<String> newList = stream.map(name -> { // 2. 중간연산자
            return "이름: " + name;
        }).toList();    // 3. 최종연산자

//        list.forEach(String s : list) {
//            newList.add("이름 : " + s);
//        }
    }

    // 일반적인 메소드
    public int add(int a, int b) {
        return a + b;
    }

    // 위 메소드를 람다식으로 표현
    // (a, b) -> {return a + b;}
    // (a, b) -> a + b;
}