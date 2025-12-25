package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calender {
    static void main(String[] args) {
       
       Calendar myCalender = Calendar.getInstance(); // java.util패키지의 Calender 클래스
       System.out.println(myCalender.getTime()); //  Tue Dec 23 09:41:07 KST 2025 출력
       System.out.println(myCalender.get(Calendar.YEAR)); // 2025 출력
       System.out.println(myCalender.get(Calendar.MONTH)+1); // 12 출력
       System.out.println(myCalender.get(Calendar.DAY_OF_WEEK)); // 3 출력
       System.out.println(myCalender.get(Calendar.DAY_OF_MONTH));  // 23 출력
       System.out.println(myCalender.get(Calendar.HOUR)); // HOUR(시) 출력
       System.out.println(myCalender.get(Calendar.MINUTE)); // MINUTE(분) 출력
       System.out.println(myCalender.get(Calendar.SECOND)); // SECOND(초) 출력

       // java.time 패키지의 LocalDateTime, LocalDate, LocalTime 클래스

       LocalDate myLocalDate = LocalDate.now();
       System.out.println(myLocalDate);
       System.out.println(myLocalDate.getMonth());
       System.out.println(myLocalDate.getYear());
       System.out.println(myLocalDate.getMonth());
       System.out.println(myLocalDate.getDayOfMonth());
       System.out.println(myLocalDate.getMonthValue());

       LocalTime myLocalTime = LocalTime.now();
       System.out.println(myLocalTime.getHour());
       System.out.println(myLocalTime.getMinute());
       System.out.println(myLocalTime.getSecond());

        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println(myLocalDateTime.getYear());
        System.out.println(myLocalDateTime.getHour());

        // ChronoField 매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(myLocalDateTime.get(ChronoField.YEAR));
        System.out.println(myLocalDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(myLocalDateTime.get(ChronoField.AMPM_OF_DAY)); // 0: 오전 1: 오후
        System.out.println(myLocalDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시 체계

        // .of : 임의로 특정시간정보객체를 만들어내고싶을때 사용
        LocalDate birthDay = LocalDate.of(2000, 11,12);
        System.out.println(birthDay);

        LocalDateTime birthDayTime = LocalDateTime.of(2000, 11,12,15,14,10);
        System.out.println(birthDayTime);

    }
}



