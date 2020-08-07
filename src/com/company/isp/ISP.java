package com.company.isp;

public class ISP {
    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.work();
        cook.eat();
        cook.work();

        Waiter waiter = new Waiter();
        waiter.work();
    }
}
interface Worker {
    void work();
}
interface Eater {
    void eat();
}
interface IWorker extends Worker, Eater {

}

class Cook implements IWorker {

    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
class Waiter implements Worker {

    @Override
    public void work() {
        System.out.println("work");
    }
}

