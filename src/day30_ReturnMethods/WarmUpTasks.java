package day30_ReturnMethods;

public class WarmUpTasks {


    public static void main(String[] args) {

            positiveNegativeZero(123);
            positiveNegativeZero(0);
            positiveNegativeZero( -10);

        System.out.println("===================================");
            int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};

            for(int i =0; i <= numbers.length-1; i++){
                positiveNegativeZero( numbers[i] );
            }



    }

    //task1:
    public static void positiveNegativeZero(int number){
        String result =  (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero";
        System.out.println(number+" is "+result);
    }

    //task2:


}
/*
1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can calculate the grade of the student

3. create a function that can print out the combination of two integer arrays

4. create a function that can print a string without the duplicated characters

5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");

               	output:
               		"Cybertek School"
 */
