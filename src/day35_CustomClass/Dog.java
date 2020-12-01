package day35_CustomClass;

import java.time.LocalDate;

public class Dog {

    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DOB;

    public void setInfo(String dogNickName, String dogBreed, String dogSize, char dogGender, String dogColor, LocalDate dogDOB){
        nickName = dogNickName;
        breed = dogBreed;
        size = dogSize;
        gender = dogGender;
        color = dogColor;
        DOB = dogDOB;
    }


}
