package spring_introduction_5;

public class Hospital {

    public Child child;

    public Hospital(Child child) {
        this.child = child;
    }

    public void giveBirth() {
        child.born();
        System.out.println("was born to you");
    }
}
