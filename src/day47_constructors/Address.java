package day47_constructors;

public class Address {
   private String street;
   private String city;
   private String state;
   private String zipCode;
   private String country = "USA";
    //constructor
    public Address() {
        System.out.println("Address constructor");
        street = "123 Unknown st";
        city = "Unknown";
        state = "Unknown";
        zipCode= "00000";

    }

    //public Address street, city, state, zip
    //second constructor, overloaded constructor -> provides shortcut to initialize variables in same statement.
    // ex: Address ad = new Address("123 Java st", "Boston", "MA", "43212");
    public Address(String street, String city, String state, String zipCode) {
        this.street=street;
        setStreet(street); //reuse the code in the setter method
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
