package TestExample.src;

import java.util.Scanner;

public class Example_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer");
        int number = input.nextInt();
        System.out.println("You enter : " + number);

        input.close();

    }

}
