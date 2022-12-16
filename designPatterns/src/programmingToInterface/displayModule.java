package programmingToInterface;

public interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    public void display() {
          System.out.println("display through Monitor");
    }
}
class Projector implements displayModule {
    public void display() {
        System.out.println("display through projector");
    }
}
