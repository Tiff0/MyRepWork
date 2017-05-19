package ZapisVFail;

import java.io.Serializable;

public class User implements Serializable {
    private int lifecycle;

    public int getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(int lifecycle) {
        this.lifecycle = lifecycle;
    }
}
