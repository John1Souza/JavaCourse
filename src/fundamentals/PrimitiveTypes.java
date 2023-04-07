package fundamentals;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Employers information

        // Integer numeric type
        byte companyYears = 23;
        short flightsNumber = 542;
        int id = 56789;
        long accumulatedPoints = 3_134_845_223L;

        // real numeric types
        float wage = 11_445.44F;
        double cumulativeSales = 2_991_797_103.01;


        // Boolean type
        boolean isOnVacation = true; // false


        // character type
        char status = 'A'; // Active

        // Company days
        System.out.println(companyYears * 365);

        // Number of trips
        System.out.println(flightsNumber / 2);

        // points per real
        System.out.println(accumulatedPoints / cumulativeSales );

        System.out.println(id + ": receives -> " + wage);
        System.out.println("Vacation? " + isOnVacation);
        System.out.println("Status: " + status);

    }
}
