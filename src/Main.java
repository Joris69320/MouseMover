import java.awt.*;
import java.util.Random;

public class Main {

    //Millisecond (1000 = 1 second, 60000 = 60 seconds, ...)
    public static final int DURATION = 60000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot robot = new Robot();
        Random random = new Random();

        while (true){
            System.out.println(".");
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(DURATION);
        }
    }
}