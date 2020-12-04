package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch 21");

        Student student1 = new Student();
        student1.setInfo("Aaron", 'M', LocalDate.of(2000,11,2), "A01", 3.5);

        System.out.println( list.toString() );
        System.out.println( str );

        System.out.println( student1.toString() );
        student1.getInfo();


    }

}
