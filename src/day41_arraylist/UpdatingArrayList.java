package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("lexus");
        myCars.add("audi");
        myCars.add("ford");
        myCars.add("toyota");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"bmw");
        myCars.add(2,"mercedes");

        //jeep, bmw, mercedes, lexus, audi, ford, toyota, tesla
        System.out.println(myCars.toString()); //prints all cars
        String allCarsIn1String = myCars.toString(); //saves all cars in 1 string variable

        System.out.println("allCarsIn1String = " + allCarsIn1String);

        //change index 0 to Lamborghini
        myCars.set(0, "lamborghini");
        System.out.println("after set = " + myCars.toString());

        //change 2 to honda
        myCars.set(2, "honda");
        System.out.println("after set = " + myCars.toString());

        /**
         * How would you do that if mycars was array:
         * mycars[4] = "Honda";
         */
        //find the index number of "ford"
        /**
         * String str = "java";
         * str.indexOf("v") ==> 2
         */
        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int lexusIndex = myCars.indexOf("lexus");
        System.out.println("lexusIndex = " + lexusIndex);

        //change lexus to chevy
        myCars.set(lexusIndex, "chevy");
        System.out.println(myCars);

        //replace chevy with dodge
        myCars.set(2, "dodge");
        System.out.println(myCars);

        if(myCars.contains("chevy")) {
            myCars.indexOf("chevy");
            myCars.set(3, "bugatti");
        } else {
            System.out.println("honda is not found");
        }
        System.out.println("UPDATED: "+myCars);

        for(int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equalsIgnoreCase("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equalsIgnoreCase("dodge")) {
                myCars.set(i, "subaru");
            } else if (myCars.get(i).equalsIgnoreCase("bugatti")) {
                myCars.set(i, "mclaren");
            }
        }
        System.out.println("After loop : " + myCars);
    }
}
