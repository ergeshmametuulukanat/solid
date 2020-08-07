package com.company.dip;

public class WithoutDIP {
    public static void main(String[] args) {

    }
}
class DataAccessTest {
    void execute() {
        System.out.println("execute");
    }
}

class ClientTest {
    DataAccessTest dataAccess = new DataAccessTest();
    void doJob() {
        dataAccess.execute();
    }
}