package day18_Strings;

public class StringMethods3 {

    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool";

        sentence = sentence.replace("Java" , "Python"); //"Python is fun, Python is cool"

        System.out.println(sentence);


        String email = "CybertekSchool@gmail.com";

         email = email.replace("gmail" , "yahoo");

        System.out.println(email);


        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students are awesome";

        essay = essay.replace("20", "21");

        System.out.println(essay);

        String s = "I like to learn C#, C# is very cool";

              s = s.replace("C#", "Java");

        System.out.println(s);

        System.out.println("=============================================");

        String r = "Cat is friendly, Cat is cute";

            r = r.replaceFirst("Cat", "Dog");

        System.out.println(r);

        String t = "I like to learn Java, because Java is cool, Java is powerful";

        t = t.replaceFirst("Java is", "Python is").replaceFirst("Java ", "C# ");
        System.out.println(t);

        // "I like to learn Java, because Python is cool, Java is powerful"
        // I like to learn Java, because Python is cool, C# is powerful

        String a = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";

        //"Yesterday was Sunday, Today is Monday, Tomorrow is gonna be Tuesday";







    }


}
