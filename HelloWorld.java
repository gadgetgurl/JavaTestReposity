import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        input.close();

        System.out.println("Hello, " + firstName + "!");

    }

}