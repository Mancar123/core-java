package external;

import com.manoj.task1.internal.Mercedes;

public class dialmer implements Mercedes {
    @Override
    public void cClass() {
        System.out.println("cClass running in Mercedes");
    }

    @Override
    public void eClass() {
        System.out.println("eClass running in Mercedes");
    }

    @Override
    public void gWagon() {
        System.out.println("gWagon running in Mercedes");
    }
}
