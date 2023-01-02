package creationalPatterns.singleton.singletonLazyEvaluation;

public class SingletonLazyEvaluationExample {
    public static void main(String [] args) {
        SingletonLazyEvaluation s = SingletonLazyEvaluation.getInstance();
        // set the data value
        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is:" + s.getData());

        // Get another reference to the Singleton.
        // Is it the same object?

        s = null;
        s = SingletonLazyEvaluation.getInstance();

        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
