package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        int num2 = 45;
        count(num2);
        String word = "wooden spoon";
        count(word.length());

        printAge(1998);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /**
     * method name: printAge
     * @param/input: int year
     * Birth year: 1984. Age: 38
     */
    public static void printAge(int year) {
       int age = 2021 - year;
        System.out.println("Birth year: " + year + ". Age: " + age);
    }
}
