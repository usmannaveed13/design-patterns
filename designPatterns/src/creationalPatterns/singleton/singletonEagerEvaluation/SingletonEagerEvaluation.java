package creationalPatterns.singleton.singletonEagerEvaluation;

public class SingletonEagerEvaluation {
    // create an instance of singleton in a static initializer,code is guaranteed to be thread safe
    private static SingletonEagerEvaluation uniqueInstance = new SingletonEagerEvaluation();

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private
     * No client can instantiate a Singleton Object
     */

    private SingletonEagerEvaluation() {}

    public static SingletonEagerEvaluation getInstance()
    {
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }
    public int getData() {
        return data;
    }
}
