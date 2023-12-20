package StreamAPI;

public class TestMean {
    public static void main(String[] args) {
        Mean01 m1 = new Mean01()
                .toAdd(8.3)
                .toAdd(8.7);
        Mean01 m2 = new Mean01()
                .toAdd(7.9)
                .toAdd(6.6);

        System.out.println(m1.getValue());
        System.out.println(m2.getValue());

        System.out.println(Mean01.toCombine(m1, m2).getValue());
    }
}
