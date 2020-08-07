package com.company.srp;

public class SRP {
    public static void main(String[] args) {
     // A class should have only one reason to change
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.cook();
        employeeFacade.cleanFloor();

    }
}

interface Employee {
    int getSalary();
}
class Cook implements Employee {
    void cook() {}

    @Override
    public int getSalary() {
        return 0;
    }
}


class Janitor implements Employee {
    void cleanFloor() {}

    @Override
    public int getSalary() {
        return 0;
    }
}

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();
    void cook() {
        cook.cook();
    }
    void cleanFloor() {
        janitor.cleanFloor();
    }
}

