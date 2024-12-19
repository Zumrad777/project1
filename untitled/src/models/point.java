package models;

public class point {
    private  double x;
    private double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(point dest) {
        return Math.sqrt(Math.pow(this.x - dest.x, 2) + Math.pow(this.y - dest.y, 2)); //formula
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}