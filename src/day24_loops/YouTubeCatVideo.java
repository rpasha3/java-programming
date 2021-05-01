package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        while(seconds <= 117) {
            System.out.println("Watching \uD83D\uDC08 at second: " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching Cat \uD83D\uDC08  video");
        System.out.println("lets start another one");
    }
}
