import java.util.Scanner;

public class Prime {

    // class to check whether number is prime or not
    public static class checkPrime {
        // int flag =0;
        public boolean check(int n) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    // flag = 1;
                    return false;
                }
            }
            return true;
        }
    }

    // class to generate prime number between two range inclusive
    public static class GeneratePrime {

        public void Generate(int num1, int num2) {

            for (int j = num1; j <= num2; j++) {
                boolean flag = true;
                for (int i = 2; i <= j / 2; i++) {
                    if (j % i == 0)
                    {
                            flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(j);
                }

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Bashant Bist 019-322");
        Scanner input = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Check for prime number");
        System.out.println("2. Generate prime number");
        System.out.println("Enter your choice");
        int choice = input.nextInt();

        checkPrime num = new checkPrime();
        GeneratePrime number = new GeneratePrime();

        switch (choice) {
            case 1: {
                System.out.println("Enter number to check");
                int n = input.nextInt();
                boolean output = num.check(n);
                if (output) {
                    System.out.println("It is prime number");

                } else
                    System.out.println("It is not a prime number");

            }

                break;
            case 2:
                System.out.println("Enter lower range");
                int low_range = input.nextInt();
                System.out.println("Enter higher range");
                int high_range = input.nextInt();
                System.out.println("The prime numbers in given range are:");
                number.Generate(low_range, high_range);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
