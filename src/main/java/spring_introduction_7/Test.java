package spring_introduction_7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        Room room = new Bath();
        Apartment apartment = new Apartment();
        apartment.setRoom(room);
        apartment.isHad();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Apartment apartment1 = context.getBean("apartment", Apartment.class);
        apartment1.isHad();

        context.close();
    }
}
