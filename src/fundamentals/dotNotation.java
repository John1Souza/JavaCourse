package fundamentals;

public class dotNotation {
    public static void main(String[] args) {

        String s = "Good day! X";
        s = s.replace("X", "Sr");
        s = s.toUpperCase();
        s = s.concat("!!!");



        System.out.println(s);
        System.out.println("John".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "John")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Primitive types doesn't have "." operator
        int a = 3;

    }
}
