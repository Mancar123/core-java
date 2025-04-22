package external;

import com.manoj.task1.internal.Asus;

public class AsusLaptop implements Asus {
    public void asusPowerOn() {
        System.out.println("asusPowerOn running in Asus");
    }

    @Override
    public void asusSleepMode() {
        System.out.println("asusSleepMode running in Asus");
    }

    @Override
    public void asusDriverScan() {
        System.out.println("asusDriverScan running in Asus");
    }

    @Override
    public void asusUsbConnect() {
        System.out.println("asusUsbConnect running in Asus");
    }

    @Override
    public void asusPowerDown() {
        System.out.println("asusPowerDown running in Asus");
    }
}
