package EnuM;

public enum Transport {
    CAR(60), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;

    Transport (int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

