package Exception;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        try {
            generateError01();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }

        try {
            generateError02();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End :)");
    }

    // not checked exception
    static void generateError01(){
        throw new RuntimeException("An error ocurred #01!");
    }

    //checked exception
    static void generateError02() throws Exception{
        throw new Exception("An error ocurred #02!");
    }
}
