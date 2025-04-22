package external;

import com.manoj28.task5.Hospital;

public class Fortis implements Hospital {
    @Override
    public void check() {
        System.out.println("running check in hospital");
    }
}
