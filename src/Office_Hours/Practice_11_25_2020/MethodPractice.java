package Office_Hours.Practice_11_25_2020;

public class MethodPractice {

    public static void main(String[] args) {
        divisibleBy3Between1To100();
        System.out.println("Hello");

        divisibleBy3Between1To100();
        System.out.println("How are you");

        divisibleBy3(50, 50);

        System.out.println("Test");

    }

    public static void divisibleBy3Between1To100(){

        for(int i =1; i<=100; i++){
            if(i%3 != 0){  // if the number is not divisible by3
                continue; // then skip
            }
            System.out.print(i+" ");
        }

        System.out.println();
    }

    public static void divisibleBy3(int start, int end){
        if(end <= start){
            System.out.println("Invalid Numbers");
           // System.exit(0);  //
            return;  // exits the current method
        }

        for(int i = start ; i<=end; i++){
            if(i%3 != 0){  // if the number is not divisible by3
                continue; // then skip
            }
            System.out.print(i+" ");
        }

        System.out.println();

    }




}
