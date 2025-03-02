package exer70;

public class Rectangle {
public double width;
public double height;

public double getArea() {
    return width * height;
}

public double getPerimeter() {
    return 2 * (width + height);
}

public double getDiagonal() {
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
}

public String toString() {
    return "Area: " + String.format("%.2f", getArea()) + "\n" +
            "Perimeter: " + String.format("%.2f", getPerimeter()) + "\n" +
            "Diagonal: " + String.format("%.2f", getDiagonal());
}
}
