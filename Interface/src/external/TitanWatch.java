package external;

import com.manoj.task1.internal.Titan;

public class TitanWatch implements Titan {
    @Override
    public void displayTime() {
        System.out.println("displayTime running in Titan");
    }

    @Override
    public void changeTime() {
        System.out.println("changeTime running in Titan");
    }

    @Override
    public void lightOn() {
        System.out.println("lightOn running in Titan");
    }

    @Override
    public void stopwatchMode() {
        System.out.println("stopwatchMode running in Titan");
    }

    @Override
    public void alarmSet() {
        System.out.println("alarmSet running in Titan");
    }

    @Override
    public void fitnessTrack() {
        System.out.println("fitnessTrack running in Titan");
    }

    @Override
    public void sleepMonitor() {
        System.out.println("sleepMonitor running in Titan");
    }
}
