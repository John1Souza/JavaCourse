package Lambdas;

public class Threads {
    public static void main(String[] args) {

        Runnable task1 = new Job1();
        Runnable task2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Task #02");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){

                    }
                }
            }
        };

//        Runnable task3 = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Task #03");
//                try {
//                    Thread.sleep(100);
//                }catch (Exception e){
//                }
//            }
//        };
        Runnable task3 = Threads::job3;

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }

    static void job3(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Task #03");
            try {
                Thread.sleep(100);
            }catch (Exception e){
            }
        }
    }
}
