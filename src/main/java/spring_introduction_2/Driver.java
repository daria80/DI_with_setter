package spring_introduction_2;

public class Driver {

    private Car car;

    public Driver() {
        System.out.println("Driver bean is created");
    }

    public void setCar(Car car) {
        System.out.println("Class Driver: set car");
        this.car = car;
    }

    public void callCar() {
        System.out.println("My car is ");
        car.sound();
    }
}
