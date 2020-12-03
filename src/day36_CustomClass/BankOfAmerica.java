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

        employees[0].setInfo("Angelina Jolie", 'F', "Developer", companyName, 400_000, "0001", LocalDate.of(2018, 04, 15));
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