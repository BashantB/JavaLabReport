
import java.util.Scanner;

//qn-6&7  Write a java program that raises an exception named InsufficientFundsException whenever a
//        customer of a bank tries to withdraw an amount higher than the available amount in his
//        account
public class Main {
    public static void main(String[] args) {
        int bal = 0;
        int flag=1;
        while (flag==1) {
            Scanner inp = new Scanner(System.in);

            int choice = 0;
            System.out.println("1.Deposit \n 2. WithDraw\n 3.Exit\n Enter your Choice");
            try {
                choice = inp.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (choice == 1) {
                System.out.println("Enter balance to deposit:");
                int x = inp.nextInt();
                bal = bal+x;
                System.out.println("Current Balance is : Rs"+bal);
            }
            else if (choice == 2) {
                System.out.println("Enter balance to withdraw:");
                int x = inp.nextInt();
                try{
                    bal = bal-x;
                    if(bal<0){
                        throw new InsufficientFundsException("Insufficient Balance");
                    }
                    System.out.println("You have withdrawn Rs:"+x+"\n Your current Balance is:"+bal);
                }
                catch (InsufficientFundsException e){
                    System.out.println(e);
                }
            } else if (choice == 3) {
                flag=0;
            }
            else{
                System.out.println("Invalid Choice");
            }


        }
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String str){
        System.out.println(str); // generally constructor used to assign values but in this case print statement is written
    }
}
