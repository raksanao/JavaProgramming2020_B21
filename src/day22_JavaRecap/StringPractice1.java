package day22_JavaRecap;

public class StringPractice1 {

    public static void main(String[] args) {
        /*
        substring: creates substring from string
            substring(beg, end): creates substring from beginning index till the given ending index (excluded)
            substring(beg): creates the substring from beginning index till end of string
         */

        String sentence = "My name is Cybertek";
        //

        String name1 = sentence.substring(11, sentence.length()   );
        System.out.println(name1);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Thursday is cool, it's a fun day";
        //             012345678

        String day1 = str1.substring(0, 6);
        System.out.println(day1); // Thursd

        String day2 = str1.substring(0,  str1.indexOf(" ") );
        System.out.println(day2);


        String s1 = "https://www.amazon.com";  // .com , .edu ,  .gov,

        String domain = s1.substring( s1.lastIndexOf(".")+1 );
        System.out.println(domain);

        String name = s1.substring( s1.indexOf(".")+1,  s1.lastIndexOf(".")  );

        System.out.println(name);







    }

}
