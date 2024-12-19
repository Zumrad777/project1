package models;



import java.util.ArrayList;

public class shape {
    private final ArrayList<point> points;

    public shape() {
        points = new ArrayList<>();
    }

    public void addPoint(point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size(); i++) {
            point current = points.get(i);
            point next = points.get((i + 1) % points.size());
            perimeter += current.distance(next);
        }
        return perimeter;
    }

    public double getLongestSide() {
        double longest = 0.0;
        for (int i = 0; i < points.size(); i++) {
            point current = points.get(i);
            point next = points.get((i + 1) % points.size());
            double side = current.distance(next);
            if (side > longest) {
                longest = side;
            }
        }
        return longest;
    }

    public double getAverageSide() {
        if (points.size() < 2) return 0.0;

        double total = calculatePerimeter();
        return total / points.size();
    }
}