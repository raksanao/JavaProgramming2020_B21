package day16_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Make the Scanner object

        System.out.println("Enter number one");
        double numberOne = input.nextDouble(); // accepting the first number

        System.out.println("Enter number two");
        double numberTwo = input.nextDouble(); // accepting the second number

        System.out.println("Enter the operator");
        String operator = input.next(); // accepting the operation

        input.close(); // Closing the Scanner because we have all the inputs

        double result = 0;

        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
                result = numberOne % numberTwo;
                break;
            default:
                System.out.println(operator + " is an invalid operator");
        }


    }
}
