package BoundedMeta;

public class Dots {
    int x, y;

    public Dots(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends Dots {
    int z;

    ThreeD (int x, int y, int z){
        super(x,y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int d;

    public FourD(int x, int y, int z, int d) {
        super(x, y, z);
        this.d = d;
    }
}

class Coords <T extends Dots>{
    T[] coords;

    Coords(T[] coords)   { this.coords = coords; }
}
