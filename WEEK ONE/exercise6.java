import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number : ");

        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the second number");

        int secondNumber = Integer.parseInt(reader.nextLine());


        if (firstNumber > secondNumber) {

            System.out.println("Greater number : " + firstNumber);
        }

        else if (firstNumber < secondNumber) {
            System.out.println("Greater number : " + secondNumber);
        }

        else {
            System.out.println("They are equal, try again!");
        }


    }
    
}
