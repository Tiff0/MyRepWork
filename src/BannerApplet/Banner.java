package BannerApplet;

import java.awt.*;
import java.applet.*;


/**
<applet code = "Banner" width = 300 height = 50>
 </applet>
 */

public class Banner extends Applet implements Runnable {
    String msg = "Java Java1 Java2";
    Thread t;
    boolean stopFlag;

    //Инициировать перемнную t значением null
    public void init(){
        t = null;
    }

    // Запустить поток
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // Точка входа в поток, выполняющую анимацию баннера
    public void run(){
        // Перерисовать баннер
        for (;;){
            try{
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
            } catch (InterruptedException exc) {}
        }
    }

    // Приостановить выполнение аплета
    public void stop(){
        stopFlag = true;
        t = null;
    }

    // Отобразить баннер
    public void paint (Graphics graphics){
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        graphics.drawString(msg, 50, 30);
    }
}