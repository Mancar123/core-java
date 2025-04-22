package external;

import com.manoj.task1.internal.Karnataka;

public class Dharwad implements Karnataka {
    @Override
    public void district() {
        System.out.println("district running in karnataka");

    }

    @Override
    public void taluk() {
        System.out.println("taluk running in karnataka");

    }

    @Override
    public void village() {
        System.out.println("village running in Karnataka");

    }
}
