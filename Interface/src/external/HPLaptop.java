package external;

import com.manoj.task1.internal.HP;

public class HPLaptop implements HP {
    @Override
    public void hpStart() {
        System.out.println("hpStart running in HP");
    }

    @Override
    public void hpHibernate() {
        System.out.println("hpHibernate running in HP");
    }

    @Override
    public void hpInstallDrivers() {
        System.out.println("hpInstallDrivers running in HP");
    }

    @Override
    public void hpWifiSetup() {
        System.out.println("hpWifiSetup running in HP");
    }

    @Override
    public void hpPowerOff() {
        System.out.println("hpPowerOff running in HP");
    }

}
