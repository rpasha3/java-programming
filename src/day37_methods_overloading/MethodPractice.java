package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 3 , '|'));
    }
    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";
        for(int i = 1; i <= times; i++) {
            //take care of last delimiter:
            if(i == times) {
                retValue += word; //add only word by itself
            } else {
                retValue += word + delimiter; //add with delimiter
            }
            retValue += word+delimiter;
        }
        return retValue;
    }
}
