package spring_introduction_5;

public class Hospital {

    public Child child;

    public Hospital() {
        System.out.println("Hospital is created");
    }

    public void setChild(Child child) {
        System.out.println("Hospital class: set child");
        this.child = child;
    }

    public void giveBirth() {
        child.born();
        System.out.println("was born to you");
    }
}
