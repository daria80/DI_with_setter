package spring_introduction_8;

public class GardenBed {

    private Vegetable vegetable;

    public GardenBed() {
        System.out.println("GardenBed is created");
    }

    public void setVegetable(Vegetable vegetable) {
        System.out.println("GardenBed class: set vegetable");
        this.vegetable = vegetable;
    }

    public void sowedInTheGarden() {
        System.out.println("sow");
        vegetable.sowed();
        System.out.println("in the garden\n");
    }
}
