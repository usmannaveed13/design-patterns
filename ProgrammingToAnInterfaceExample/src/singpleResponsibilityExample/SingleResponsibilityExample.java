package singpleResponsibilityExample;

import java.util.Date;

public class SingleResponsibilityExample {
    public class Employee {
        private String employeeId;
        private String name;
        private String address;
        private Date dateOfJoining;
  // this violation of single responsibility principle so we should create separate classes
//        public boolean isPromotionDueThisyear() {
//
//        }
//
//        public double calcIncomeTaxForCurrentYear() {
//
//        }


    }

    // by creating separate classes we can achieve single responsibility principle
//    public class HRPromotions {
//        public boolean isPromotionDueThisyear(Employee emp) {
//
//        }
//    }
//
//    public class Finance {
//        public double calcIncomeTaxForCurrentYear(Employee emp) {
//
//        }
//    }



    public static void main(String[] args) {

    }
}
