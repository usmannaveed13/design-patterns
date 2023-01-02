package creationalPatterns.singleton.singletonLazyEvaluation;

public class SingletonLazyEvaluation {
    // the private reference to the one and only instance
    private static SingletonLazyEvaluation uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private
     * No client can instantiate a Singleton Object
     */

    private SingletonLazyEvaluation() {}

    public static SingletonLazyEvaluation getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonLazyEvaluation();
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }
    public int getData() {
        return data;
    }
}
