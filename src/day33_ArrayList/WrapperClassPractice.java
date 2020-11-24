package day33_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {
        String str = "a1b2c3d4";  // 1: 49,  2: 50, 3: 51
        int sum = 0 ;

        for(char each : str.toCharArray() ){
            if(Character.isDigit(each)){
                sum += Integer.parseInt( ""+each );  // each digits need to be converted to integer and added to the sum
            }
        }


        System.out.println("sum = " + sum);


    }

}

/*
3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
 */
