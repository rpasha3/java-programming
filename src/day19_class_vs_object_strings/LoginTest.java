package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "Cybertek";
        String expPassword = "Abc123";

        String username = "Cybertek";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(username) && expPassword.equals(password)) {
            System.out.println("Successfully logged in");

        }else{
            if(!expUserName.equalsIgnoreCase("Cybertek")) {
                System.out.println("Incorrect username");
            }else{
                System.out.println("Incorrect Password");
            }
        }
    }
}
