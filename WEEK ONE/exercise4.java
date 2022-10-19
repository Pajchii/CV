import java.util.Scanner;


public class exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("and another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());


        System.out.println("Sum of the numbers is : " + (firstNumber + secondNumber));

    }
}
