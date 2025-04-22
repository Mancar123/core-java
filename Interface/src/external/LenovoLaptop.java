package external;

import com.manoj.task1.internal.Lenovo;

public class LenovoLaptop implements Lenovo {
    @Override
    public void lenovoLaunch() {
        System.out.println("lenovoLaunch running in Lenovo");
    }

    @Override
    public void lenovoRestMode() {
        System.out.println("lenovoRestMode running in Lenovo");
    }

    @Override
    public void lenovoSync() {
        System.out.println("lenovoSync running in Lenovo");
    }

    @Override
    public void lenovoPairBluetooth() {
        System.out.println("lenovoPairBluetooth running in Lenovo");
    }

    @Override
    public void lenovoShutdown() {
        System.out.println("lenovoShutdown running in Lenovo");
    }
}
