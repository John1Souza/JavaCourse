package ClassesAndMethods;

public class ValueVsReference {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        DataAtribution d1 = new DataAtribution(01, 06, 2023);
        System.out.println(d1.formattedData());

        DataAtribution d2 = d1; // Atribuição por referência (Objeto)]
        System.out.println(d2.formattedData());

        backToDefaultValue(d1);
        System.out.println(d1.formattedData());

        int c = 5;
        primitiveChange(c);
        System.out.println(c);
    }

    static void backToDefaultValue(DataAtribution d){
        d.day = 1;
        d.month = 1;
        d.year  = 1970;
    }

    static void primitiveChange(int a){
        a++;
    }
}
