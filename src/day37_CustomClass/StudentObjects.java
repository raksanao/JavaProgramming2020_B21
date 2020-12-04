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

        System.out.println( list );
        System.out.println( str );

        System.out.println( student1.toString() );
        System.out.println( student1 );

        System.out.println("=====================================================");
        Student student2 = new Student();
        student2.setInfo("Daniel", 'M', LocalDate.of(1990, 10, 25), "B123", 3.2);

        // student2.getInfo();

        System.out.println( student2 );


    }

}
