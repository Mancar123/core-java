package external;

import com.manoj.task1.internal.Laptop;

public class Dell implements Laptop {
    @Override
    public void dellBoot() {
        System.out.println("dellBoot running in Dell");
    }

    @Override
    public void dellSleep() {
        System.out.println("dellSleep running in Dell");
    }

    @Override
    public void dellUpdate() {
        System.out.println("dellUpdate running in Dell");
    }

    @Override
    public void dellConnect() {
        System.out.println("dellConnect running in Dell");
    }

    @Override
    public void dellShutdown() {
        System.out.println("dellShutdown running in Dell");
    }

}
