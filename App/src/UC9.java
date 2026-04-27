enum WeightUnit {
    KG(1), GRAM(0.001), POUND(0.453592);
    double f; WeightUnit(double f){this.f=f;}
    double toBase(double v){return v*f;}
}

class Weight {
    double v; WeightUnit u;
    Weight(double v, WeightUnit u){this.v=v; this.u=u;}

    public boolean equals(Object o){
        Weight w=(Weight)o;
        return Double.compare(u.toBase(v), w.u.toBase(w.v))==0;
    }
}

public class UC9 {
    public static void main(String[] args){
        System.out.println(new Weight(1,WeightUnit.KG)
                .equals(new Weight(1000,WeightUnit.GRAM)));
    }
}