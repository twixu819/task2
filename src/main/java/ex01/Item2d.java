package ex01;

import java.io.Serializable;

public class Item2d implements Serializable {
    private static final long serialVersionUID = 1L;

    public double u;
    public double r;


    public transient String binaryResult;

    public Item2d(double u, double r) {
        this.u = u;
        this.r = r;
    }
}
