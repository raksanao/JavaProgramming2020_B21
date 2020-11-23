package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class TimeFormat {

/*
LocalDate:
    year: yyyy
    month: MM (number), MMM(three letters of month), MMMM(full name)
    days: dd

    name of day: E(three letters) , EEEE (full name)

    Month/ Day / Year
 */
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        LocalDate today = LocalDate.now();  //2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));


    }


}
