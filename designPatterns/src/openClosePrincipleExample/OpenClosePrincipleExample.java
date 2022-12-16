package openClosePrincipleExample;

public class OpenClosePrincipleExample {
    public interface Shape {
        public double calculateArea();
    }

    class Rectangle implements Shape{
        public double length;
        public double width;

        public double calculateArea() {
            return length * width;
        }

    }

    class Circle implements Shape{
        public double radius;
        public double calculateArea() {
            return (22/7) * radius * radius;
        }
    }

    public class AreaCalculator {
//        public double calculateRectangleArea(Rectangle rectangle) {
//            return rectangle.length * rectangle.width;
//        }
//
//        public double calculateCircleArea(Circle circle) {
//          return (22/7) * circle.radius * circle.radius;
//        }

        public double calculateShapeArea(Shape shape){
            return shape.calculateArea();
        }
    }





    public static void main(String[] args) {

    }
}
