package day44_custom_classes;

/**
 * app class is used as a template for App objects.
 * We are describing app properties and behavior here. Objects will be able to use them.
 */
public class App {
    String name; //null by default
    double version = 0.0; //0.0

    public void open() {
        System.out.println("opening " + name + " app - version = " + version);
    }

}
