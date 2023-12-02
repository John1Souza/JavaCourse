package Challenges;

public class DataTestConstructor {
    public static void main(String[] args) {
        DataConstructor firstData = new DataConstructor(24, 06,1998);

        // firstData.day = 31;
        // firstData.month = 12;
        // firstData.year = 2023;

        DataConstructor secondData = new DataConstructor();

        System.out.print(firstData.formattedData());
        System.out.print("\n" + secondData.formattedData());

    }
}
