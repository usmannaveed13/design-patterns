package creationalPatterns.singleton.singletonSynchronizedMethod;

public class SingletonSynchronizedApproachExample {
    public static void main(String [] args) {
        SingletonSynchronizedApproach s = SingletonSynchronizedApproach.getInstance();
        // set the data value
        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is:" + s.getData());

        // Get another reference to the Singleton.
        // Is it the same object?

        s = null;

        s = SingletonSynchronizedApproach.getInstance();

        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

    }
}
