package day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.println("Which room would you like to select?");
        System.out.println("\t\tKing Bed == $120");
        System.out.println("\t\tQueen Bed == $100");
        System.out.println("\t\tSingle Bed == 80$");

        String word = scan.nextLine().toLowerCase();

        while( !(word.equals("king bed")||word.equals("queen bed")||word.equals("single bed"))){
            System.out.println("Invalid Entry, Please Re-Enter");
            word = scan.nextLine().toLowerCase();
        } // to make usre user selected either the king bed, or queen bed or single bed





    }

}

/*
            A, King Bed ==> 120$
		    B,  Queen Bed ==> 100$
		    C,  single Bed ==> 80$
 */