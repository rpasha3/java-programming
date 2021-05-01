package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("java" + 5 + 3);
                          //  "java53" will print
        System.out.println("java" + (5 + 3));
                         // "java8" will print
        System.out.println(5 + 3 + "java");
                        // "8java" will print
        System.out.println(5 + (3 + "java"));
                        // "53java" will print
        System.out.println("hello" + 1+2+3); // hello123
        System.out.println("hello" + (1+2+3));// hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+str2); //hellofriends
        System.out.println(str1 + " " + str2); //hello friends

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2); //15
        System.out.println(num1 + " " + num2);// 7 8
        System.out.println(num1 +""+num2); //78

        char char1 ='a';
        char char2 ='b';
        System.out.println(char1 + char2);
        System.out.println(char1 + "" + char2); //ab



    }
}
