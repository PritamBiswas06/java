package Inheritance;

public class BoxColor extends Box{
    double color;

    public BoxColor(double l, double h, double w, double color) {
        super(l, h, w);
        this.color = color;
    }
}
