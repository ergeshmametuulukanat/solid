package com.company.srp;

public class WithoutSRP {
    public static void main(String[] args) {
        EmployeeTest employee = new EmployeeTest();
        employee.cleanFloor();
        employee.cook();
        employee.deliverFood();
    }
}
class EmployeeTest {
    int getSalary() {
    return 10;
    }
    void cook() {}
    void cleanFloor() {}
    void deliverFood() {}
}
