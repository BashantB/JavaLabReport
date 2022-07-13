import java.util.Scanner; 

public class StreamClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //loading input stream class

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);
    }
}