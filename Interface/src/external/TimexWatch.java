package external;

import com.manoj.task1.internal.Timex;

public class TimexWatch implements Timex {
    @Override
    public void timexTime() {
        System.out.println("timexTime running in Timex");
    }

    @Override
    public void timexBattery() {
        System.out.println("timexBattery running in Timex");
    }

    @Override
    public void timexLight() {
        System.out.println("timexLight running in Timex");
    }

    @Override
    public void timexMode() {
        System.out.println("timexMode running in Timex");
    }

    @Override
    public void timexBeep() {
        System.out.println("timexBeep running in Timex");
    }

    @Override
    public void timexLap() {
        System.out.println("timexLap running in Timex");
    }

    @Override
    public void timexPowerSave() {
        System.out.println("timexPowerSave running in Timex");
    }
}
