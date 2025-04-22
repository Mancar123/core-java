package external;

import com.manoj.task1.internal.Toyota;

public class Corolla implements Toyota {
    public void corolla() {
        System.out.println("corolla running in Toyota");
    }

    @Override
    public void camry() {
        System.out.println("camry running in Toyota");
    }

    @Override
    public void supra() {
        System.out.println("supra running in Toyota");
    }

}
