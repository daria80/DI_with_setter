package spring_introduction_7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        Room room = new Bath();
        Apartment apartment1 = new Apartment(room);
        apartment1.isHad();
        System.out.println("");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Apartment apartment = context.getBean("apartment", Apartment.class);
        apartment.isHad();
    }
}
