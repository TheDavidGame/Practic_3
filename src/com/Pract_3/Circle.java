package com.Pract_3;

public class Circle {
    private double S = 0;
    private double V = 0;
    private double R = 0;

    public void setR(double r) {
        R = r;
    }

    public void setS(double s) {
        S = s;
    }

    public void setV(double v) {
        V = v;
    }

    public double getS() {
        return S;
    }

    public double getV() {
        return V;
    }

    public double getR() {
        return R;
    }

    public static void Radius(double R ) {

        System.out.println("R: "  + (Math.PI + Math.pow(R,2)));
    }

    public static void V(float PI, float R) {
        System.out.println("V: " + ((4 / 3) * Math.PI * Math.pow(R,3)));
    }

}
