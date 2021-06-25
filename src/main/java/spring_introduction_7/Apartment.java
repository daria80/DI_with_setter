package spring_introduction_7;

public class Apartment {

    private Room room;

    public Apartment() {
        System.out.println("Appartment is created");
    }

    public void setRoom(Room room) {
        System.out.println("Apartment class: set room");
        this.room = room;
    }

    public void isHad() {
        System.out.println("There is");
        room.footage();
        System.out.println("in the apartment");
    }
}
