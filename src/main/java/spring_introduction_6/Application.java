package spring_introduction_6;

public class Application {

    private Message message;

    public Application(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        System.out.println("Вы отправили: ");
        message.send();
    }
}
