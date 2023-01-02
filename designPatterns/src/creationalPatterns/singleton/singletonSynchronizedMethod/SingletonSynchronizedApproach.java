package creationalPatterns.singleton.singletonSynchronizedMethod;

import creationalPatterns.singleton.singletonLazyEvaluation.SingletonLazyEvaluation;

public class SingletonSynchronizedApproach {
    // the private reference to the one and only instance
    private static SingletonSynchronizedApproach uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private
     * No client can instantiate a Singleton Object
     */

    private SingletonSynchronizedApproach() {}

    // by adding the synchronized keyword to getInstance(),
    // we forced every thread to wait its turn before it can enter the method
    public static synchronized SingletonSynchronizedApproach getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonSynchronizedApproach();
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }
    public int getData() {
        return data;
    }
}
