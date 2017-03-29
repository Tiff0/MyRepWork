package TrafficLightDemo;

public class TrafficLightsSimulator implements Runnable {
    private Thread thrd;        // Поток для имитации светофора
    private TrafficLightColor tlc;  // Текущий цвет светофора
    boolean stop = false;      // Для остновки имитации установить в true
    boolean changed = false;     // true, если светофор переключился

    TrafficLightsSimulator (TrafficLightColor init){
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightsSimulator(){
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    @Override
    public void run() {
        while (!stop) {

            try {
                switch (tlc){
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                }
            } catch (InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Переключатель цвета светофора
    synchronized void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify();
    }

    // Ожидание переключения цвета светофора
    synchronized void waitForChanged(){
        try {
            while (!changed)
                wait();
            changed = false;
        } catch (InterruptedException exc){
            System.out.println(exc);
        }
    }

    TrafficLightColor getColor(){
        return tlc;
    }

    void cancel(){
        stop = true;
    }
}


