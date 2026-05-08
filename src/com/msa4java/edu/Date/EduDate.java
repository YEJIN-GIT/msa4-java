package com.msa4java.edu.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class EduDate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();    // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026, 5, 1, 23, 10, 59);
        LocalDateTime parsed = LocalDateTime.parse("2026-05-01T23:10:20.123456789"); // ISO표기 방식

        LocalDateTime addOneDayByNow = now.plusDays(1); // (자바 16버전 부터) plusDays
        System.out.println(now.plusDays(1));    // (plusDay(1) 하루 뒤) 2026-05-09T11:15:03.859758
        System.out.println(now);                // (원본은 바뀌지 않는다) 2026-05-08T11:15:03.859758

        // 상대적인 날짜 이동 (TemporalAdjusters)
        // 그달의 첫째날
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        // 그달의 마지막날
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        // 다음주 월요일날
        LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMonday);

        // 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2024, 9, 12);
        System.out.println(d1.isBefore(d2)); // false
        System.out.println(d1.isAfter(d2)); // true
        System.out.println(d1.isEqual(d2)); // false

        // Period 객체
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears()));    // (-1년 차이 Math.abs 절대값) 1
        System.out.println(Math.abs(p1.getMonths()));   // 7
        System.out.println(Math.abs(p1.getDays()));     // 26
        // 1년 7개월 26일

        // 단위별 차이
        Long untilDays  = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));  // 603

        // 데이트 포멧 (DateTimeFormatter)
        // 날짜 객체 -> 문자열로 포멧
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");   // (참고)대문자 HH 24시
        String strNow = now.format(format1);
        System.out.println(strNow); // 2026년 05월 08일 12시 21분 05초

        // 문자열 -> 날짜 객체
        String createdAt = "2025-06-20 14:33:20";
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(createdAt, format2);
        System.out.println(ldt);    // 2025-06-20T14:33:20

        // LocalDateTime -> LocalDate 추출
        LocalDate ldtToldt = ldt.toLocalDate();
        System.out.println(ldtToldt);   // 2025-06-20

    }
}
