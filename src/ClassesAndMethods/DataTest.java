package ClassesAndMethods;

public class DataTest {
    public static void main(String[] args) {
        Data firstData = new Data();

        firstData.day = 31;
        firstData.month = 12;
        firstData.year = 2023;

        Data secondData = new Data();

        secondData.day = 01;
        secondData.month = 01;
        secondData.year = 2024;

        System.out.printf("%d / %d / %d ", firstData.month, firstData.day, firstData.year);
        System.out.printf("\n%d / %d / %d ", secondData.month, secondData.day, secondData.year);

    }
}
