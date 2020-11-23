package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class TimeFormat {

/*
LocalDate:
    year: yyyy
    month: MM (number), MMM(three letters of month), MMMM(full name)
    days: dd
    name of day: E(three letters) , EEEE (full name)

LocalTime:
    hours: hh
    minutes: mm
    seconds: ss
    am/pm: a

 */
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        LocalDate today = LocalDate.now();  //2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println(  now.format(tf) );

        LocalTime t1 = LocalTime.of(23, 35, 55);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        //

        // Monday, 12:40 PM,  Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.of(2020, 11, 23, 12, 40);

        System.out.println(dt1);
        System.out.println(dt1.format(dtf));


    }


}
