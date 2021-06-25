package spring_introduction_10;

public class ATM {

    private Banknote banknote;

    public ATM(Banknote banknote) {
        this.banknote = banknote;
    }

    public void cash() {
        System.out.println("cash disbursement of");
        banknote.isUsed();
        System.out.println("\n");
    }
}
