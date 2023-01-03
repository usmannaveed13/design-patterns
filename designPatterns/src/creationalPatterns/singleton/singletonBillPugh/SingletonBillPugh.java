package creationalPatterns.singleton.singletonBillPugh;

public class SingletonBillPugh {

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private
     * No client can instantiate a Singleton Object
     */

    private SingletonBillPugh() {}

    private static class SingletonHelper {
        // Nested  class is referenced after getInstance() is called
        private static final SingletonBillPugh uniqueInstance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance()
    {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }
    public int getData() {
        return data;
    }
}
