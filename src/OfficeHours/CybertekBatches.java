package OfficeHours;

public class CybertekBatches {
    public static void main(String[] args) {
        String batchType = "US"; //EU

        if(batchType.equals("US") || batchType.equals("us")) {

            boolean isMorning = false;

            if (isMorning) {
                System.out.println("Class times are 10-5 EST. M, T, TH, F.");
            } else {
                System.out.println("Class times are 7-10 EST. M, T, W, TH, S, S");
            }


        } else if (batchType.equals("EU") || batchType.equals("eu")) {

            System.out.println("Class times are 10-5 EST. M, T, W, TH, F");

        } else {
            System.out.println("Invalid Batch Type");
        }

    }
}
