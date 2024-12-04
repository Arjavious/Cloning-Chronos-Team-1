package frc.robot.Commands.Indexer;
import java.util.Timer;
import java.util.TimerTask;

public class TimerClass {

    //method
    public static void start () {
    //Timer duration
    int seconds = 3;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        int count = seconds;

        @Override
        public void run () {
            if (count > 0) {
                System.out.println(count);
                count--;
            } else {
                System.out.println();
                timer.cancel();
            }
        }
    };

    timer.schedule(task, 2000);
    }
}
