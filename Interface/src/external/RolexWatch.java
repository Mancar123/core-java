package external;

import com.manoj.task1.internal.Rolex;

public class RolexWatch implements Rolex {
    @Override
    public void showTime() {
        System.out.println("showTime running in Rolex");
    }

    @Override
    public void showDate() {
        System.out.println("showDate running in Rolex");
    }

    @Override
    public void adjustStrap() {
        System.out.println("adjustStrap running in Rolex");
    }

    @Override
    public void setAlarm() {
        System.out.println("setAlarm running in Rolex");
    }

    @Override
    public void startStopwatch() {
        System.out.println("startStopwatch running in Rolex");
    }

    @Override
    public void batteryStatus() {
        System.out.println("batteryStatus running in Rolex");
    }

    @Override
    public void waterproofTest() {
        System.out.println("waterproofTest running in Rolex");
    }
}
