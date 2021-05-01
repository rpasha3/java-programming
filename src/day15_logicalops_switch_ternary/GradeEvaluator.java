package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B'|| grade == 'C') {
            System.out.println("Pass. Grade = " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade = " + grade);
        } else if (grade == 'F') {
            System.out.println("Fail. Grade = " + grade);
        } else {
            System.out.println("INVALID GRADE");
        }

        if ((grade == 'A' || grade == 'a') || (grade == 'B' || grade == 'b')
                          || (grade == 'C' || grade == 'c')) {
            System.out.println("Pass. Grade = " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade = " + grade);
        } else if (grade == 'F') {
            System.out.println("Fail. Grade = " + grade);
        } else {
            System.out.println("INVALID GRADE");
        }
    }
}
