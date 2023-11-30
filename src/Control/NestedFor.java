package Control;

public class NestedFor {
    public static void main(String[] args) {

        //for(int count = 10; count >= 0; count-=2){
        //     System.out.printf("i = %d\n", count);
        //}
        //int i = 0;
        //for(;i < 10; i++){
        //    System.out.println(i);
        //}
        //System.out.println("it went out for loop...");
        //System.out.println(i);

        for(int i = 0; i < 10; i++){
            for(int j = 0; j <= 10; j++){
                System.out.printf("|%d %d", i, j);
            }
            System.out.println();
        }
    }
}
