package lab10t2;

public class Lab10t2 {
    public static void main(String[] args) {
        final double PI = 3.14159; // Immutable constant
        double radius = 5.0; // Mutable variable

        // Calculations
        double circumference = 2 * PI * radius;
        double areaCircle = PI * radius * radius;
        double volumeSphere = (4.0 / 3.0) * PI * radius * radius * radius;
        double surfaceAreaSphere = 4 * PI * radius * radius;

        // Output results
        System.out.println("Circumference of Circle: " + circumference);
        System.out.println("Area of Circle: " + areaCircle);
        System.out.println("Volume of Sphere: " + volumeSphere);
        System.out.println("Surface Area of Sphere: " + surfaceAreaSphere);
    }
}
