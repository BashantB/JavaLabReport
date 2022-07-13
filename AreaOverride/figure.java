import java.util.Scanner;

public class figure {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bashant Bist 019-322");
        System.out.println("Choose figure");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("Enter choice");
        int choice = inp.nextInt();
        
        
        switch (choice) {
            case 1:
                triangle tr = new triangle();
                tr.area();
                break;
            case 2:
                rectangle rt = new rectangle();
                rt.area();
                break;
            default:
                System.out.println("invalid choice");
                break;

        }
    }
}
