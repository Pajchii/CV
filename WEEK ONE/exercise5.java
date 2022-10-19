import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number to check: ");

        int integer = Integer.parseInt(reader.nextLine());

        if(integer>0) {

            System.out.println("This number is positive");
        }

        else if(integer<0) {

            System.out.println("This number is negative");
            


        }

    }
}
