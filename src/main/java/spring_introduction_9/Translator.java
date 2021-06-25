package spring_introduction_9;

public class Translator {

    private Language language;

    public Translator(Language language) {
        this.language = language;
    }

    public void translate() {
        System.out.println("Перевод на:");
        language.isUsed();
        System.out.println("\n");
    }
}
