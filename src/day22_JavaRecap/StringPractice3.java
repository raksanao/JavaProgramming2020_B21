package day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

        sentence = sentence.replace("Canada", "United States");

        System.out.println(sentence);


        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";
            s = s.replaceFirst("Cybertek", "MIT");

        System.out.println(s);

        String r = "cava is cool programming language, I can learn cava at cybertek school";
            r = r.replace("cav", "jav");

        System.out.println(r);

        String p = "I like Java and Java Java Java Java Java Java";
        p = p.replaceFirst("Java", "C#");
        p = p.replaceFirst("Java", "java");
        p = p.replace("Java", "");
      //  p = p.replace("Java" , "").replace("like ", "like java") ;
        System.out.println(p);


    }
}
