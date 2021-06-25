package spring_introduction_10;

public class Ruble implements Banknote{

    @Override
    public void isUsed() {
        System.out.println("rubles");
    }
}
