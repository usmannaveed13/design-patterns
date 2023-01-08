package structuralPatterns.composite.example2;


public class Company2 {
    public static void main(String[] args) {
        Employee2 dev1 = new Developer("Usman",100,"Senior Dev");
        Employee2 dev2 = new Developer("Abeera",101, "Junior Dev");

        Manager engManager = new Manager("mike" , 25000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee2 dev3 = new Developer("Tom", 102, "Developer");

        Manager generalManager = new Manager("Mark", 50000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();

    }
}
