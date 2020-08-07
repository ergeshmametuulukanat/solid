package com.company.ocp;

public class OCP {
    public static void main(String[] args) {
        // OCP should be open for extension but closed for modification

        Toyota toyota = new Toyota();
        workInTaxi(toyota);

        Celica celica = new Celica();
        workInTaxi(celica);
    }


    static void workInTaxi(ICar car) {
        car.workInTaxi();
    }
}


interface ICar {
    void workInTaxi();
}

class Toyota implements ICar {

    @Override
    public void workInTaxi() {
        getPassengers();
    }

    private void getPassengers() {
        System.out.println("Get passengers");
    }
}

class Celica implements ICar {

    @Override
    public void workInTaxi() {
        getPassenger();
    }

    private void getPassenger() {
        System.out.println("Get one passenger");
    }
}
