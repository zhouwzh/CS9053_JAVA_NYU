package problem1;

public class EllipticalTorus {
    private static int nextid;
    private int id = ++nextid;
    private double majorRadius;
    private double semiMajorAxis;
    private double semiMinorAxis;

    public EllipticalTorus(){

    }

    public EllipticalTorus(double a, double b, double c){
        this.majorRadius = a;
        this.semiMajorAxis = b;
        this.semiMinorAxis = c;
    }

    public double getMajorRadius(){
        return this.majorRadius;
    }

    public void setMajorRadius(double a){
        this.majorRadius = a;
    }

    public double getSemiMajorAxis(){
        return this.semiMajorAxis;
    }

    public void setSemiMajorAvis(double a){
        this.semiMajorAxis = a;
    }

    public double getSemiMinorAxis(){
        return this.semiMinorAxis;
    }

    public void setSemiMinorAxis(double a){
        this.semiMinorAxis = a;
    }

    public double getVolume(){
        return 2 * Math.pow(Math.PI,2) * this.majorRadius * this.semiMajorAxis * this.semiMinorAxis;
    }

    public double getSurfaceArea(){
        return 4 * Math.pow(Math.PI,2) * this.majorRadius * Math.sqrt(Math.pow(this.semiMajorAxis,2)+Math.pow(this.semiMinorAxis,2));
    }

    public int getId(){
        return this.id;
    }
}
