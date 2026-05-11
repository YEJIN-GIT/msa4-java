package com.msa4java.edu.enumeration;

public enum Week {
    // MONDAY       // private Week MONDAY = new Week(); 와 같다
    // ,TUESDAY     // private Week TUESDAY = new Week(); 와 같다
    // ,WEDNESDAY   // private Week WEDNESDAY = new Week(); 와 같다
    // ,THURSDAY    // private Week THURSDAY = new Week(); 와 같다
    // ,FRIDAY      // private Week FRIDAY = new Week(); 와 같다
    // ,SATURDAY    // private Week SATURDAY = new Week(); 와 같다
    // ,SUNDAY      // private Week SUNDAY = new Week(); 와 같다

    // private Week MONDAY = new Week("월요일");
    // private Week MONDAY = new Week("화요일");
    // private Week MONDAY = new Week("수요일");
    // private Week MONDAY = new Week("목요일");
    // private Week MONDAY = new Week("금요일");
    // private Week MONDAY = new Week("토요일");
    // private Week MONDAY = new Week("일요일");
    MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    private final String krDay;

    // 생성자
    private Week(String day) {
        this.krDay = day;
    }

    // getter
    public String getKrDay() {
        return this.krDay;
    }
}
