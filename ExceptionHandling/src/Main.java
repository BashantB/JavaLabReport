// all exception handling code is implemented within this code
// to check other catch block at first remove the cause of arithmatic exception then run execute
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 4 numbers");

        Scanner sc = null;
        try {
            int []arr = new int[5];
            int x = 50 / 0;
            sc = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(arr[10] + " "+x );
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Bound Out of index exception occurs" + e);
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        } finally {
            sc.close();
            System.out.println("Scanner Closed");
        }
    }
}