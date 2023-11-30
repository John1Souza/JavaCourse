package ExercisesControlStructures;

import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

public class ControlStructures_02 {

    public static void main(String[] args) {
        // 2. Criar um programa informa se o ano atual é um ano bissexto;

        //Date currentYear = new Date();

        //int year = YearMonth.now().getYear();
        //int month = YearMonth.now().getMonthValue();
        int month = 2;
        int year = 2020;
        YearMonth yearMonth = YearMonth.of(year, month);
        int diasNoMes = yearMonth.lengthOfMonth();
        if(diasNoMes > 28){
            System.out.printf("%d is a leap year ", year);
        }else{
            System.out.printf("%d isn't a leap year ", year);
        }

        //System.out.printf("%d/%d", year, month);
    }

}
