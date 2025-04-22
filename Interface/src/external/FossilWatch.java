package external;

import com.manoj.task1.internal.Fossil;

public class FossilWatch implements Fossil {
    @Override
    public void fossilTime() {
        System.out.println("fossilTime running in Fossil");
    }

    @Override
    public void fossilDate() {
        System.out.println("fossilDate running in Fossil");
    }

    @Override
    public void fossilAlarm() {
        System.out.println("fossilAlarm running in Fossil");
    }

    @Override
    public void fossilSteps() {
        System.out.println("fossilSteps running in Fossil");
    }

    @Override
    public void fossilHeartRate() {
        System.out.println("fossilHeartRate running in Fossil");
    }

    @Override
    public void fossilCharging() {
        System.out.println("fossilCharging running in Fossil");
    }

    @Override
    public void fossilReset() {
        System.out.println("fossilReset running in Fossil");
    }

}
