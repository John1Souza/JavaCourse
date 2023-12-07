package ClassesAndMethods;

public class EqualsHashscode {
    public static void main(String[] args) {
        Users u1 = new Users();

        u1.name = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com.br";

        Users u2 = new Users();
        u2.name = "Pedro Silva";
        u2.email = "pedro.silva@zemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        //System.out.println(u2.equals(new Date()));
    }
}
