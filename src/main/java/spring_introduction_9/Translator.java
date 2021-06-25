package spring_introduction_9;

public class Translator {

    private Language language;

    public Translator() {
        System.out.println("Translator is created");
    }

    public void setLanguage(Language language) {
        System.out.println("Translator class: set language");
        this.language = language;
    }

    public void translate() {
        System.out.println("Перевод на:");
        language.isUsed();
        System.out.println("\n");
    }
}
