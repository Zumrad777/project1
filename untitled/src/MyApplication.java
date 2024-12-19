import models.point;
import models.shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source.txt");

        Scanner sc = new Scanner(file);
        shape shape = new shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            point point = new point(x, y);
            shape.addPoint(point);
        }


        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide() );
    }
}