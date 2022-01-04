class Shape implements Comparable<Shape> {
    private final double area;

    Shape(final double area) {
        this.area = area;
    }

    double getArea() {
        return area;
    }

    @Override public int compareTo(final Shape other) {
        return Double.compare(this.area, other.area);
    }
}

class Square extends Shape {
    Square(final double side) {
        super(side * side);
    }
}

class Rectangle extends Shape {
    Rectangle(final double height, final double width) {
        super(height * width);
    }
}

class Triangle extends Shape {
    Triangle(final double base, final double height) {
        super(height * base / 2.0);
    }
}

class Circle extends Shape {
    Circle(final double radius) {
        super(Math.PI * radius * radius);
    }
}

class CustomShape extends Shape {
    CustomShape(final double area) {
        super(area);
    }
}