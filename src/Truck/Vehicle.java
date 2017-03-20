package Truck;

public class Vehicle {
    private int passenger;
    private int fuelcap;
    private int mpg;

    Vehicle (int p, int f, int m) {
        passenger = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){
        return mpg * fuelcap;
    }

    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck (int p, int f, int m, int c){
        super(p, f, m);
        cargocap = c;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}


class A {
    private int x = 1;
    int getX(){
       return x;
    }
}

class B extends A{
    private int q;
}

class C{
    public static void main(String args[]){
        B ex = new B();
        System.out.print(ex.getX());
        //int z = ex.x;
    }
}