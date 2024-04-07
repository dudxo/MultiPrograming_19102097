package homework_week5;

import java.util.Scanner;

public class Page208_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String PutDay = in.next();

        Day.valueOf(PutDay.toUpperCase());
        System.out.println(Day.valueOf(PutDay.toUpperCase()) + "은 싫다");
        equalDay(PutDay.toUpperCase());
        System.out.println(equalDay(PutDay));

    }

    public static String equalDay(String PutDay) {
        return switch (PutDay) {
            case "SUNDAY", "SATURDAY" -> "최고";
            case "MONDAY" -> "싫다.";
            case "FRIDAY" -> "좋다.";
            default -> "그저 그렇다.";
        };
    }
}

enum Day {
    SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");

    private String s;

    Day(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}