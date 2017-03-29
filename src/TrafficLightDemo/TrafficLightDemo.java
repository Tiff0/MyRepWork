package TrafficLightDemo;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightsSimulator t1 =
                new TrafficLightsSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChanged();
        }

        t1.cancel();
    }
}
