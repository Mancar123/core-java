package external;

import com.manoj.task1.internal.Casio;

public class CasioWatch implements Casio {
    @Override
    public void showDigitalTime() {
        System.out.println("showDigitalTime running in Casio");
    }

    @Override
    public void enableWorldClock() {
        System.out.println("enableWorldClock running in Casio");
    }

    @Override
    public void activateSensor() {
        System.out.println("activateSensor running in Casio");
    }

    @Override
    public void setTimer() {
        System.out.println("setTimer running in Casio");
    }

    @Override
    public void syncBluetooth() {
        System.out.println("syncBluetooth running in Casio");
    }

    @Override
    public void showCompass() {
        System.out.println("showCompass running in Casio");
    }

    @Override
    public void casioBacklight() {
        System.out.println("casioBacklight running in Casio");
    }

}
