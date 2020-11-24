package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer>  scores =  new ArrayList<>();   // size:1

        scores.add(100);  // autoboxing   0
        scores.add(200);    //  1
        scores.add(300);    // 3

        scores.add(2, 400);  // 2

        System.out.println( scores );



    }

}
