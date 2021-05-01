package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) throws InterruptedException {
        /** below is infinite loop with for loop like: while(true) {  }
         *  for(;;) {
         *    System.out.println("Java is fun!");
         *  }
         */
        for(int i = 0; i <= 5; i++) {
            System.out.println("Hello World");
        }
        //for loop: 1-10. print the numbers
         // 1)          2)       4)
        for(int n = 1; n <= 10; n++){
            Thread.sleep(1000);
            System.out.print(n+" "); //3)
        }
    }
}
