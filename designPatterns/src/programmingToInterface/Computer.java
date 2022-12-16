package programmingToInterface;

public class Computer {
    displayModule dm;

    public void setDisplayModule(displayModule dm){
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }

    public static void main(String[] args) {
       Computer cm = new Computer();
       displayModule dm = new Monitor();
       displayModule dm1 = new Projector();

       cm.setDisplayModule(dm);
       cm.display();

       cm.setDisplayModule(dm1);
       cm.display();
    }
}
