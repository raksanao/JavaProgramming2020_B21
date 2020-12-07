package day38_Statics;

public class CybertekStudent {

    public String name;
    public int age,  groupNumber;
    public char gender;

    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;


    public void study(){
        System.out.println(name +" is studying Java");
    }

    public static void getSchoolInfo(){
        System.out.println("School is: "+schoolName);
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", isOnline: "+isOnlineStudent+
                '}';
    }
}

/*
CybertekStudent
		instance: name, age, groupNumber, gender
		static:		 schoolName

 */