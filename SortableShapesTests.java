
import java.util.*;

public class SortableShapesTests {


    public static void main(String args[]) {

        double area, side, radius, base, height, width;
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        area = 1.1234;
        shapes.add(new CustomShape(area));

        side = 1.1234;
        shapes.add(new Square(side));

        radius = 1.1234;
        shapes.add(new Circle(radius));

        height = 2.;
        base = 5.;
        shapes.add(new Triangle(base, height));

        height = 3.;
        base = 4.;
        shapes.add(new Triangle(base, height));

        width = 4.;
        shapes.add(new Rectangle(width, height));

        area = 16.1;
        shapes.add(new CustomShape(area));


        Collections.sort(shapes);

        for ( Shape element : shapes) {
            System.out.println(element.getArea());
        }

    }

}