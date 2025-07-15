import java.util.Timer;
import java.util.TimerTask;
public class CountdownTimer {
    public static void main(String[] args) {
        // Java Countdown Timer Program

        Timer timer = new Timer();
        final int[] i = {10};
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (i[0] > 0) {
                    System.out.println(i[0]);
                    i[0]--;

                } else {
                    System.out.println("DING DONGG!!");
                    timer.cancel();
                    }

                }

        };
        timer.scheduleAtFixedRate(task,1000,1000);



    }
}
