package creationalPatterns.singleton.singletonDoubleCheckedLocking;


public class SingletonDoubleCheckedLocking {
    // the private reference to the one and only instance
    private volatile static SingletonDoubleCheckedLocking uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private
     * No client can instantiate a Singleton Object
     */

    private SingletonDoubleCheckedLocking() {}

    public static  SingletonDoubleCheckedLocking getInstance()
    {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {  // we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }
    public int getData() {
        return data;
    }
}
