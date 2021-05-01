package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Raif", "Hotmail");
        buildEmail("Nadir", "FannieMae");
        buildEmail("John Ward III" , "verizon");
    }

    public static void buildEmail(String name, String domain) {
        String emailAddress = name + "@" + domain + ".com";
        System.out.println(emailAddress.toLowerCase().replace(" ", "_"));
    }
}
