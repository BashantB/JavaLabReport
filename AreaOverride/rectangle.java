import java.util.Scanner;

public class rectangle {
    Scanner inp = new Scanner(System.in);

    void area() {
        System.out.println("Enter length and breadth:");
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("Area of rectangle is "+(a*b));
}
}
