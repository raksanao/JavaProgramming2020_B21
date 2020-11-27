package Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUniques {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "A", "C", "D", "D"};

        ArrayList<String> uniqueElementsList = new ArrayList<>();

        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(element)) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }

        String[] uniques = new String[uniqueElementsList.size()];
        for(int i = 0; i <= uniques.length-1; i++){
           uniques[i]  = uniqueElementsList.get(i); // each element of the array list need to be assigned to each index of the array
        }


        System.out.println(uniqueElementsList);
        System.out.println(Arrays.toString(uniques));




    }

}
