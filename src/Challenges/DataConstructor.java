package Challenges;

public class DataConstructor {
    int day;
    int month;
    int year;
    DataConstructor(int initialDay, int initialMonth, int initialYear){
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    DataConstructor(){
        day = 01;
        month = 01;
        year  = 1970;
    }
//    String formattedData(int month, int day, int year){
//        return month + "/" + day + "/" + year;
//    }

    String formattedData(){
        return month + "/" + day + "/" + year;
    }
}
