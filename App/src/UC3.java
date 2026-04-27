enum Unit { FEET(1), INCHES(1.0/12);
    double f; Unit(double f){this.f=f;}
    double toBase(double v){ return v*f;}
}

class Quantity {
    double v; Unit u;
    Quantity(double v, Unit u){this.v=v; this.u=u;}

    public boolean equals(Object o){
        Quantity q=(Quantity)o;
        return Double.compare(u.toBase(v), q.u.toBase(q.v))==0;
    }
}

public class UC3 {
    public static void main(String[] args){
        System.out.println(new Quantity(1,Unit.FEET)
                .equals(new Quantity(12,Unit.INCHES)));
    }
}