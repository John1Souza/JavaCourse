package fundamentals;

public class ConversionPrimitiveTypesNumeric {
    public static void main(String[] args) {

        double a = 1.1234567888888888;
        System.out.println(a);

        // Explicit conversion, insert "()", and what the type you want to convert the variable
        // in this type of conversion, maybe you lost some information
        float b = (float) 1.1234567888888888; // Explicit (CAST)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);
    }
}
