package EnuM;

public class EnumDemo  {
    public static void main(String[] args) {
        Transport tp, tp1, tp2, tp3;

        tp = Transport.AIRPLANE;

        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("Train in tp");

        switch (tp){
            case CAR:
                System.out.println("Car");
                break;
            case TRUCK:
                System.out.println("Truck");
                break;
            case AIRPLANE:
                System.out.println("Airplane");
                break;
            case TRAIN:
                System.out.println("Train");
                break;
            case BOAT:
                System.out.println("Boat");
                break;
        }
        System.out.println();

        Transport allTransport[] = Transport.values();
        for(Transport t : allTransport)
            System.out.println(t + ": " + t.getSpeed());

        System.out.println();

        for (Transport t : Transport.values())
            System.out.println(t + " " + t.ordinal());

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        if (tp1.compareTo(tp2) < 0)
            System.out.println(tp1 + " runs before " + tp2);

        if (tp1.compareTo(tp2) > 0)
            System.out.println(tp2 + " runs before " + tp1);

        if (tp1.compareTo(tp3) == 0)
            System.out.println(tp1 + " equals " + tp3);

        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);

        System.out.println("Speed of plane " + Transport.AIRPLANE.getSpeed());
    }
}