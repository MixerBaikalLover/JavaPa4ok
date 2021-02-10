package ru.Mixer.MathUtils;

public class QuadraticEquationRoot {
    private double x1;
    private double x2;
    private int rootCount;

    public QuadraticEquationRoot(double x1, double x2, int rootCount) {
        this.x1 = x1;
        this.x2 = x2;
        this.rootCount = rootCount;
    }

    public QuadraticEquationRoot() {

    }

    @Override
    public String toString() {
        return "QuadraticEquationRoot{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", rootCount=" + rootCount +
                '}';
    }
    public QuadraticEquationRoot(double a,double b,double c){
        double d = b*b - 4* a* c;
        double dSqrt = Math.sqrt(d);
        if(d == 0){
            x1 = -b / 2*a;
            x2 = 0;
            rootCount =1;
        }else if (d > 0){
            x1 = (-b + dSqrt) / 2*a;
            x1 = (-b - dSqrt) / 2*a;
            rootCount = 2;
        } else {
            x1=0;
            x2=0;
            rootCount=0;
        }
    }

    public int getRootCount() {
        return rootCount;
    }

    public void setRootCount(int rootCount) {
        this.rootCount = rootCount;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
}
