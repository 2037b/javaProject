package org.zjl_.banyuan.day_03.extends_04;

class Homework06 {
    public static void main(String[] args) {
        System.out.println(new Vehicle(2000, 4));
        System.out.println(new Car(4000, 6, 4));
        System.out.println(new Truck(1000, 8, 3, 10000));
    }
}

class Vehicle {
    double weight;
    int wheels;

    Vehicle(double weight, int wheels) {
        this.weight = weight;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", wheels=" + wheels +
                '}';
    }
}

class Car extends Vehicle {
    int loader;

    Car(double weight, int wheels, int loader) {
        super(weight, wheels);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", wheels=" + wheels +
                ", loader=" + loader +
                '}';
    }
}

class Truck extends Car {
    double payload;

    Truck(double weight, int wheels, int loader, double payload) {
        super(weight, wheels, loader);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", wheels=" + wheels +
                ", loader=" + loader +
                ", payload=" + payload +
                '}';
    }
}