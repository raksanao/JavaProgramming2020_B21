package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime d1 = LocalDateTime.of(2020,11,24, 13,0);

        System.out.println( d1.format(dtf).replaceFirst("PM", "pm") );

        System.out.println("=====================================================");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd, E");
        LocalDate[]  days  = new LocalDate[5];

        for (int i = 0; i <= days.length-1; i++){
            days[i] = LocalDate.now().plusDays(i+1);
        }

        System.out.println(Arrays.toString(days));


        for(LocalDate each  : days ){
            System.out.println(each.format(df));
        }


        System.out.println("=====================================================");





    }

}

/*
1. use the LocalDate & Time get the date and time in the following format:
			Tue, 01:00 pm, November/24/2020

	2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following format:
				MonthName/Day, Name

				ex:
					November/25, Wednesday

    3. create an array of string and store 5 of your friends' names
       create an array of LocalDate and store their DofB

       find out who is youngest and oldest

 */
