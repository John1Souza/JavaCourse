package ClassesAndMethods;

public class DataAtribution {
    int day;
    int month;
    int year;
    DataAtribution(int initialDay, int initialMonth, int initialYear){
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }
    String formattedData (){

        return month + "/" + day + "/" + year;
    }
}
