package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Experience in Java, Selenium, Cucumber, JUnit";
        double salary = 123000;
        byte yearsExp = 3; //int yearsExp =3; also work
        boolean hasBenefits = true;

        System.out.println("Job Title: "+title);
        System.out.println("Company: "+company);
        System.out.println("Job Description: "+jobDescription);
        System.out.println("Salary: $"+salary);
        System.out.println("Years of Experience: "+yearsExp);
        System.out.println("Has benefits? - "+hasBenefits);


    }
}
