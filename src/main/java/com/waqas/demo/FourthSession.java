package com.waqas.demo;

// POJO: Plain Old Java Object
public class FourthSession {
    public FourthSession() {
        Employee e = new Employee();
        e.age1 = 20;
        System.out.println(e.age1);
        e.age1 = -4;
        System.out.println(e.age1);

        e.setAge(50);
        System.out.println(e.getAge());
        e.setAge(1); //Set the value less than 1 here to throw exception
        System.out.println(e.getAge());

        //Without @Accessors lombok property
        EmployeeDetails ed = new EmployeeDetails();
        ed.setFirstName("Waqas");
        ed.setLastName("Shahid");
        ed.setAge(30);
        ed.setSalary(25000);

        System.out.printf(ed.getFirstName() + " " + ed.getLastName() + " " + ed.getAge() + " " + ed.getSalary() + "\n");
        System.out.println(ed.getFirstName() + " " + ed.getLastName() + " " + ed.getAge() + " " + ed.getSalary());

        //With @Accessors(chain = true) lombok property
        EmployeeDetails employee = new EmployeeDetails();
        employee.setFirstName("Waqas2")
                .setLastName("Shahid2")
                .setAge(31)
                .setSalary(26000);
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getAge() + " " + employee.getSalary());

        //With multiple arguments constructor property of Lombok @AllArgsConstructor
        EmployeeDetails employee2 = new EmployeeDetails("Waqas3", "Shahid3", 32, 27000F);
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getAge() + " " + employee2.getSalary());

    }

    public static void main(String[] args) {
        new FourthSession();
    }
}
