package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
    // toString:
        int[] numbers = {1,2,3,4,5,6};

        System.out.println( numbers[0] );
        System.out.println( numbers[1] );
        System.out.println( numbers[2] );
        System.out.println( numbers );  //hashcode

        System.out.println(  Arrays.toString(numbers)   );
        String str1 = "Cybertek";
        System.out.println( str1 );

        String[] classMates = {"Adil", "Muhammad", "Yasin", "Necdet", "Daniel"};
        System.out.println(  classMates  );  // hashcode
        System.out.println(  Arrays.toString(classMates)  );



    }

}
