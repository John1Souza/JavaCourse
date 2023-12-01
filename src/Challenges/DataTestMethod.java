package Challenges;

public class DataTestMethod {
    public static void main(String[] args) {
        DataMethod firstData = new DataMethod();

        firstData.day = 31;
        firstData.month = 12;
        firstData.year = 2023;

        DataMethod secondData = new DataMethod();

        secondData.day = 01;
        secondData.month = 01;
        secondData.year = 2024;

        System.out.print(firstData.formattedData(31, 12, 2023));
        System.out.print("\n" + secondData.formattedData(01, 02, 2024));

    }
}
