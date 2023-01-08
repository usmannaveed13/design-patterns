package structuralPatterns.composite.example1;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Usman",100,"Senior Dev");
        Employee dev2 = new Developer("Abeera",101, "Junior Dev");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Rizwan", 200, "SEO Manager");
        Employee man2 = new Manager("Ali", 201,"Project Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
