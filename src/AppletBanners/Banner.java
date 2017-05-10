package AppletBanners;
import java.awt.*;
import java.applet.*;

/**
<applet code="Banner" width = 300 height = 50>
</applet>
*/


public class Banner extends Applet implements Runnable {
    String msg = "Java rules the world";
    Thread t;
    boolean stopFlag;

    // Инициализируем переменную t знач null
    public void init(){
        t = null;
    }

    // Запустить поток
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // Точка входа в поток выполняющий анимацию баннера
    public void run(){
        // Перерисовать баннер
        for(;;){
            try {
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    stop();
            } catch (InterruptedException exc){}
        }
    }

    // Приостановить выполнение апплета
    public void stop(){
        stopFlag = true;
        t = null;
    }

    // Отобразить баннер
    public void paint(Graphics g){
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
