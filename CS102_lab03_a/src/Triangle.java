public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle (int sideA, int sideB, int sideC ){


        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getArea() {
        double u = (sideA + sideB + sideC) / 2;

        double area = Math.sqrt(u * (u - sideA) * (u - sideB) * (u - sideC));

        return area;
    }
    public String toString(){
        return ("The shape is triangle, its sides are : " + this.sideA +", " + this.sideB + ", and " + this.sideC + " Is Selected: ");
    }


}
