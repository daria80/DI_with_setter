package spring_introduction_7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Apartment apartment = context.getBean("apartment", Apartment.class);
        apartment.isHad();
    }
}
