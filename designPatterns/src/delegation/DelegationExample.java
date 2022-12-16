package delegation;

class RealPrinter {
    // the delegate
 void print() {
     System.out.println("The Delegate");
 }
}

class Printer {
    // the delegator
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print() {
        p.print();   // delegation
    }
}

public class DelegationExample {
    public static void main(String[] args) {
        // outside world printer is print
       Printer printer = new Printer();
       printer.print();
    }
}
