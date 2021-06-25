package spring_introduction_10;

public class Dollar implements Banknote {

    @Override
    public void isUsed() {
        System.out.println("dollars");
    }
}
