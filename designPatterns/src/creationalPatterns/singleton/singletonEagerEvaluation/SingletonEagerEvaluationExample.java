package creationalPatterns.singleton.singletonEagerEvaluation;

public class SingletonEagerEvaluationExample {
    public static void main(String [] args) {
        SingletonEagerEvaluation s = SingletonEagerEvaluation.getInstance();
        // set the data value
        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is:" + s.getData());

        // Get another reference to the Singleton.
        // Is it the same object?

        s = null;
        s = SingletonEagerEvaluation.getInstance();

        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
