package structuralPatterns.composite.example2;

interface Employee2 {
    public void showEmployeeDetails();
}

class Developer implements Employee2 {
    private String name;
    private long empId;
    private String position;

    public Developer(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name+ " " + position);
    }
}

//class Manager implements Employee2 {
//    private String name;
//    private long empId;
//    private String position;
//
//    public Manager(String name, long empId, String position) {
//        this.name = name;
//        this.empId = empId;
//        this.position = position;
//    }
//
//    @Override
//    public void showEmployeeDetails() {
//        System.out.println(empId+" " +name+ " " + position);
//    }
//}
