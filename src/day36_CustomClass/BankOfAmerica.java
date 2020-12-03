package day36_CustomClass;

import java.time.LocalDate;
import java.util.Scanner;

public class BankOfAmerica { // Bank of America HAS An Employee

    public static void main(String[] args) {
        String companyName = "Bank of America";
        Employee[] employees = {
                new Employee(),  //0
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee()
        };

        employees[0].setInfo("Angelina Jolie", 'F', "Developer", companyName, 400_000, "0001", LocalDate.of(2018, 4, 15));
        employees[1].setInfo("Brad Pitt",'M',"Scrum Master",companyName,140_000,"0003",LocalDate.of(2016, 9,14));
        employees[2].setInfo("Obi-Wan Kenobi", 'M', "SDET", companyName, 164000, "3-CPO", LocalDate.of(2010, 2, 14));
        employees[3].setInfo("Ercan Civi", 'M', "SDET", companyName, 164000.50, "ABC123", LocalDate.of(2000, 2, 14));
        employees[4].setInfo("John Snow",'M',"SDET",companyName,240_000,"0004",LocalDate.of(2006, 2,18));


        employees[0].getInfo();








    }


}

/*
Engine{

}

Car{

    Engine

}

Car Has An Engine

 */