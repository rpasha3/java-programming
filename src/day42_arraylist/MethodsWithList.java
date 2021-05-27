package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {

    public static void main(String[] args) {
        //declare String arrayList and add values
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));


        List<Integer> nums = Arrays.asList(1, 4, 5, 7, 8,88, 56, 98);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }

    /**
     * methodName: printStrList
     * param: List of Strings
     * return: void
     * prints all values separated by space in same line
     */

    public static void printStrList(List<String> stringList) { //"java" , "apple" , "coffee" , "tea"
        for(String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    /**
     * method : sumIntegerList
     * param : List of integers
     * returns : int
     * calculates sum of integers in the list then returns
     */

    public static int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for(int i : integerList) {
            sum += i;

        }
        return sum;
    }
}
