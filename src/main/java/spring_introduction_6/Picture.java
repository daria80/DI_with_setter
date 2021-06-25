package spring_introduction_6;

public class Picture implements Message{

    @Override
    public void send() {
        System.out.println("─╔╗╔══╗╔╗─╔╗╔══╗\n" +
                "─║║║╔╗║║╚╦╝║║╔╗║\n" +
                "╔╣║║╠╣║╚╗║╔╝║╠╣║\n" +
                "╚═╝╚╝╚╝─╚═╝─╚╝╚╝");
    }
}
