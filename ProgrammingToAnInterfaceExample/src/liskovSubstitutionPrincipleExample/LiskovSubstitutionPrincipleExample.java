package liskovSubstitutionPrincipleExample;

public class LiskovSubstitutionPrincipleExample {

    public abstract class Vehicle {
        abstract int getSpeed();
        abstract int getCubicCapacity();
    }

    public class Car extends Vehicle {
        int getSpeed() {
            return 1;
        }
        int getCubicCapacity() {
            return 2;
        }
        boolean sHatchBack() {
            return true;
        }
    }

    public class Bus extends Vehicle {
        int getSpeed() {
            return 2;
        }
        int getCubicCapacity() {
            return 3;
        }
        String getEmergencyExitLoc() {
            return "yes";
        }
    }


    public static void main(String[] args) {
        // its implementation of liskov substitution principle
//        Vehicle vehicle = new Bus();
//        vehicle.getSpeed();
//        vehicle = new Car();
//        vehicle.getCubicCapacity();
    }
}
