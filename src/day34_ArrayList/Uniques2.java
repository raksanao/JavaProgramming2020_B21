package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(  Arrays.asList(1,1,2,3,3,4,5,5,6,6,7,8,8,9,9,10) );

        numbers.removeIf( p -> Collections.frequency(numbers, p) == 1 );

        System.out.println(numbers);

        System.out.println("=====================================");




    }

}
/*
1. write a program that find the unique names from an arraylist of string

						DO NOT USE:
								for loop, for each loop, while loop, do while loop
 */
