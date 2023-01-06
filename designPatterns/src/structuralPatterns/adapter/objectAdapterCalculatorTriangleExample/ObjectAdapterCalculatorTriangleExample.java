package structuralPatterns.adapter.objectAdapterCalculatorTriangleExample;

public class ObjectAdapterCalculatorTriangleExample {
    public static void main(String [] args) {
        System.out.println("***Adapter Pattern Demo***");

        Triangle t = new Triangle(20,10);


        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        CalculatorInterface calculatorInterface = new Calculator();

        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle is:" + calculatorInterface.getArea(new Rectangle()));

        System.out.println("Area of Triangle is:" + calculatorAdapter.getArea(null));
    }
}
