package BoundedMeta;

public class BoundedWildcard {
    static void ShowXY (Coords<?> c){
        System.out.println("X & Y coords: ");
        for (int i = 0; i < c.coords.length; i++ )
            System.out.println(c.coords[i].x + " " +
                c.coords[i].y);
        System.out.println();
    }

    static void showXYZ (Coords<? extends ThreeD> c){
        System.out.println("X & Y & Z coords: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " "
                    + c.coords[i].y + " "
                    + c.coords[i].z);
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c){
        System.out.println("X Y Z D coordin: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " "
                    + c.coords[i].y + " " + c.coords[i].z +
                    " " + c.coords[i].d);
        System.out.println();
    }

    public static void main(String[] args) {
        Dots td[] = {
                new Dots(0,0),
                new Dots(7,9),
                new Dots(18,4),
                new Dots(-1,-23)
        };

        Coords <Dots> tdlocs = new Coords<>(td);

        System.out.println("Dots consiss of ");
        ShowXY(tdlocs);
//        showXYZ(tdlocs);
//        showAll(tdlocs);

        FourD fd[] = {
                new FourD(1,2,3,4),
                new FourD(6,8,14,8),
                new FourD(22,9,4,9),
                new FourD(3,-2,-23,17)
        };

        Coords <FourD> fdlocs = new Coords<>(fd);

        System.out.println("fdlocs consist of ");
        ShowXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
