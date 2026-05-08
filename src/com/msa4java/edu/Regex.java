package com.msa4java.edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // String 객체 이용
        String str = "yejin2";
        String pattern1 = "[a-zA-Z]+";
        String pattern2 = "[0-9]+";
        String pattern3 = "[a-z0-9]{6,20}";

        System.out.println(str.matches(pattern1));  // false
        System.out.println(str.matches(pattern2));  // false
        System.out.println(str.matches(pattern3));  // true

        // Pattern 객체 이용
        Pattern pattern4 = Pattern.compile("[a-zA-Z]+"); // 1. 미리 패턴을 만들어 두고 사용

        Matcher matcher4 = pattern4.matcher(str);              // 2. 검증하여 Matcher로 반환

        System.out.println(matcher4.matches());                // 3. matches메소드가 일치여부를 true/false 반환
    }
}
