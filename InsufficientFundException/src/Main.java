import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a =6;

        try{
            int b = inp.nextInt();
            int c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println( e.getMessage());

        }
        finally {
            inp.close();
            System.out.println("executed");
        }
    }
}