package spring_introduction_10;

public class ATM {

    private Banknote banknote;

    public ATM() {
        System.out.println("ATM is created");
    }

    public void setBanknote(Banknote banknote) {
        System.out.println("ATM class: set banknote");
        this.banknote = banknote;
    }

    public void cash() {
        System.out.println("cash disbursement of");
        banknote.isUsed();
        System.out.println("\n");
    }
}
