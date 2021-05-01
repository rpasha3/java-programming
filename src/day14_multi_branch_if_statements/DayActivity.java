package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "rainy";
        if (weather.equals("sunny")) {
            System.out.println(weather + " - Go to park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather +" - stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather +" - build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - get ready for power loss, fly a kite, and code java");
        } else {
            System.out.println("just keep coding java");
        }
    }
}
