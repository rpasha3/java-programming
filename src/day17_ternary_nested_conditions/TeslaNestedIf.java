package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "long range";

        if (model == 'S') {
            System.out.println("cheap one");
            if (trim.equals("long range")) {
                System.out.println("range = 412\ntop speed = 155mph\n0-60 = 3.1sec");
            }
        }
    }
}
