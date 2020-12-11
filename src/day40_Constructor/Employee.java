package day40_Constructor;

public class Employee {

    public String name, jobTitle, ID;
    public double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }






}

/*
1. class Name: Employee
			instance variables:
					name, jobTitle, ID, salary

			1st constructor: initialize the name of the employee

			2d constructor: initialize the name, jobTitle of the employee
							(MUST apply constructor Call)

			3rd Constructor: initialize the name, jobTitle, ID of the employee
							(MUST apply constructor Call)

			4th Constructor: initialize all the instance of the employee
								(MUST apply constructor Call)

			Instance methods:
				toString()
 */
