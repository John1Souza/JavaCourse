package ClassesAndMethods;

public class CircleArea {
    double ray;
    static final double PI = 3.14;

    CircleArea(double initialRay){
        ray = initialRay;
    }

    double area(){
        return  PI * Math.pow(ray, 2);
    }

    static double area(double ray){
        return PI * Math.pow(ray, 2);
    }
}
