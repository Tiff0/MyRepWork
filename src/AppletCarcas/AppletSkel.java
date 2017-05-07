package AppletCarcas;

import java.awt.*;
import java.applet.*;

/*
<applet code = "AppletSkel" width = 300 height = 300>
</applet>
 */

public class AppletSkel extends Applet{

    @Override
    // Runs first
    public void init(){
        // initialization
    }

    @Override
    // Runs second. Always starts when reloading applet
    public void start(){
        // Runs or reload applet
    }

    @Override
    // Runs when stopping applet
    public void stop() {
        //Stop
    }

    @Override
    // Destroy applet
    public void destroy(){
        // ends al actions
    }

    @Override
    // Update data in applet
    public void paint(Graphics g) {
        // Rewriting window
    }
}