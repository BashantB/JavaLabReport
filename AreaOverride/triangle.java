import java.util.Scanner;

public class triangle {
    Scanner inp = new Scanner(System.in);

    void area() {
        System.out.println("Enter 3 sides of triangle:");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        if ((a + b) > c || (a + c) > b || (b + c) > a) {
            double s = (a + b + c) / 2;
            double temp = s * (s + a) * (s + b) * (s + c);
            System.out.println("Area of triangle is" + Math.sqrt(temp));
        }
        else
        System.out.println("Invalid triangle data");
    }
}
