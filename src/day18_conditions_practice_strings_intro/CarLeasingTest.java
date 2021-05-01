package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E63AMG";
        double leasePrice = 0;

//        if (make.equals("Mercedes") && model.equals("E63AMG")) {
//            leasePrice = 700;
//        }else if (make.equals("Mercedes") && model.equals("G63AMG")) {
//            leasePrice = 689;
//        }

        if(make.equals("Mercedes")) {
            if(model.equals("E63AMG")) {
                leasePrice = 700;
            }else if(model.equals("G63AMG")) {
                leasePrice = 689;
            }
            if(make.equals("Audi")) {
                if(model.equals("RS7")) {
                    leasePrice = 717;
                }else if(model.equals("SQ5")) {
                    leasePrice = 644;
                } else {
                    System.out.println("Invalid Make");
                    return;
                }
            }
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}

