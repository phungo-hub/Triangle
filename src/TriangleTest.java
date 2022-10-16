import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Input side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Input side3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle("blue", true,side1, side2, side3);
        System.out.println(triangle);
    }

}
