package external;

import com.manoj.task1.internal.Bmw;

public class Bmwimpl implements Bmw {
    public void series3() {
        System.out.println("series3 running in BMW");
    }

    @Override
    public void series5() {
        System.out.println("series5 running in BMW");
    }

    @Override
    public void x5() {
        System.out.println("x5 running in BMW");
    }
}
