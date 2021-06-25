package spring_introduction_8;

public class GardenBed {

    private Vegetable vegetable;

    public GardenBed(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

    public void sowedInTheGarden() {
        System.out.println("sow");
        vegetable.sowed();
        System.out.println("in the garden\n");
    }
}
