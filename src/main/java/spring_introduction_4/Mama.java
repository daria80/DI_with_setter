package spring_introduction_4;

public class Mama {

    private Jar jar;

    public Mama() {
        System.out.println("Mama bean is created");
    }

    public void setJar(Jar jar) {
        System.out.println("Mama class: set jar");
        this.jar = jar;
    }

    public void pourDrink() {
        System.out.println("mom pours");
        jar.pour();
    }
}
