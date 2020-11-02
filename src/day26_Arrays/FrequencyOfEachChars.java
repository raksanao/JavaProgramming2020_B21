package day26_Arrays;

public class FrequencyOfEachChars {

    public static void main(String[] args) {
        String str = "aaabbc";  // "a3b2c1"
  //  Step 1: remove duplicates
        String nonDup = "";   // "abc"
        for(int i = 0; i < str.length(); i++ ){ //i: 0,1,2,3,4,5
            String eachChar = ""+ str.charAt(i); // a, a, a, b, b, c
            if( !nonDup.contains(eachChar) ){
                nonDup += eachChar;
            }
        }

        System.out.println(nonDup);




    }

}

/*
	FrequencyOfEachChars
	1. write a program that can return the frequency of characters from a String
			Ex:
				str = "ababaac";

				output:
					a3b2c1
 */