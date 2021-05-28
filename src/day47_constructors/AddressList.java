package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address(); //calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("Virginia");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress);
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("Address after update: " + cybertekAddress);
        System.out.println("Street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address papaJohn = new Address("8501 Tyco RD Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John pizza = " + papaJohn.toString());


    }
}
