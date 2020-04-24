package day_1;

import java.time.LocalDate;

public class AllGood {
    public static void main(String[] args) {
        HappyBirthDay(2000, 10, 30);


    }


    public static void HappyBirthDay(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
        }
        System.out.println("Today is not your birthday");
    }
    }

