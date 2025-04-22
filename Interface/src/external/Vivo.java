package external;

import com.manoj.task1.internal.Mobile;

public class Vivo implements Mobile {
    @Override
    public void storage() {
        System.out.println("storage running in mobile");

    }

    @Override
    public void charger() {
        System.out.println("charger running in mobile ");
    }

    @Override
    public void desk() {
        System.out.println("desk running in mobile");
    }

    @Override
    public void memory() {
        System.out.println("memory running in mobile");
    }

    @Override
    public void ram() {
        System.out.println("ram running in mobile");
    }
}
