package OO.Encapsulation;

public class PeopleTest {
    public static void main(String[] args) {
        People p1 = new People("John","Doe", 30);
        p1.setAge(-30);

        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1.setFullname());

        System.out.println(p1);
    }
}
