package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123"); // POSITIVE TEST / SUNNY DAY
        loginVoid("cybertookTeach", "bcd432"); // NEGATIVE TEST / RAINY DAY SCENARIO

        System.out.println(login("cybertekStudent", "abc123"));

        if(login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
        } else {
            System.out.println("login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }


    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if(username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome cybertek Student");
        } else {
            System.out.println("Incorrect username or password");
        }

    }

    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
