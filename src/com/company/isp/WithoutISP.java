package com.company.isp;

public class WithoutISP {
    public static void main(String[] args) {
        IWorkerTest cook = new CookTest();
        cook.work();
        cook.eat();
        cook.work();
    }
}
interface IWorkerTest {
    void work();
    void eat();
}

class CookTest implements IWorkerTest {

    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
class WaiterTest implements IWorkerTest{

    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void eat() {

    }
}