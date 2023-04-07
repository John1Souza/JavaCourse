package fundamentals;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Hello people!".charAt(1));

        String s = "Good afternoon";
        // s = s.toUpperCase();

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.toLowerCase().startsWith("good"));
        System.out.println(s.toLowerCase().endsWith("afternoon"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("good afternoon"));
        System.out.println(s.equalsIgnoreCase("good afternoon"));

        var name = "Peter";
        var lastName = "Santos";
        var age = 33;
        var wage = 12345.987;

        System.out.println("Name: "
                + name + "\nLast name: "
                + lastName + "\nage: "
                + age + "\nwage: "
                + wage);

        System.out.printf("Name: %S %S", name, lastName);
        System.out.printf("\nThe Sr. %s %s have %d year old, and won $%.2f. dollars/mont",
                name,
                lastName,
                age,
                wage);
        String phrase = String.format("\nThe Sr. %s %s have %d year old, and won $%.2f. dollars/mont",
                name,
                lastName,
                age,
                wage);
        System.out.println(phrase);
    }
}
