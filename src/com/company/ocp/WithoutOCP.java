package com.company.ocp;

public class WithoutOCP {
    public static void main(String[] args) {
        ToyotaTest toyota = new ToyotaTest();
        workInTaxi(toyota);

        CelicaTest celica = new CelicaTest();
        workInTaxi(celica);
    }
        static void workInTaxi(ToyotaTest toyota) {
        if (toyota instanceof ToyotaTest){
            toyota.getPassenger();
        }else {
            toyota.getPassengers();
        }
    }
}
class ToyotaTest {
    void getPassengers() {
        System.out.println("Get passengers");
    }
    void getPassenger() {
        System.out.println("Get one passenger");
    }
}

class CelicaTest extends ToyotaTest {}
