package spring_introduction_4;

public class Mama {

    private Jar jar;

    public Mama(Jar jar) {
        this.jar = jar;
    }

    public void pourDrink() {
        System.out.println("mom pours");
        jar.pour();
    }
}
