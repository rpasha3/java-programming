package OfficeHours.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
// this method will take an ArrayList of numbers and remove any duplicates values.
// this method will return an ArrayList of unique elements
// @param nums - the given ArrayList of numbers
// @return - ArrayList of numbers
// Ex: input: {1,3,5,1,4,5,9}
//     output: {3,4,9}

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,1,4,5,9));
        System.out.println(removeDup(list));
    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list) {

        ArrayList<Integer> uniques = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for(int j = 0; j < list.size(); j++) {

                if(list.get(i) == list.get(j)) {
                    count++;
                }
            }

            if(count == 1) {
                uniques.add(list.get(i));
            }
        }
        return uniques;
    }

}
