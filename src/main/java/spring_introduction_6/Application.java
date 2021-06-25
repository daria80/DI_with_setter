package spring_introduction_6;

public class Application {

    private Message message;

    public Application() {
        System.out.println("Application is created");
    }

    public void setMessage(Message message) {
        System.out.println("Application class: set message");
        this.message = message;
    }

    public void sendMessage() {
        System.out.println("Вы отправили: ");
        message.send();
    }
}
