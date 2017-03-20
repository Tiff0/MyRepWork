package com.Pwr;

import static java.lang.System.out;

public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp){
        this.b = base;
        this.e = exp;

        this.val = 1;
        if(exp == 0) return;
        for ( ; exp > 0; exp--) {
            this.val *= base;
        }
    }

    double get_pwr(){
        return this.val;
    }
}

class DemoPwr {
    public static void main (String args[] ){
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        out.println(x.b + " v stepeni " + x.e + " ravno " + x.get_pwr());
        out.println(y.b + " v stepeni " + y.e + " ravno " + y.get_pwr());
        out.println(z.b + " v stepeni " + z.e + " ravno " + z.get_pwr());
    }
}