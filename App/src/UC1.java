public class UC1 {
    static class Feet {
        double value;
        Feet(double value){ this.value = value; }

        public boolean equals(Object obj){
            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;
            Feet f = (Feet) obj;
            return Double.compare(value, f.value) == 0;
        }
    }

    public static void main(String[] args){
        System.out.println(new Feet(1).equals(new Feet(1)));
    }
}