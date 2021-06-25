package spring_introduction_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//
//     Car car = new Ferarri();
//
//     Driver driver = new Driver(car);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Driver driver = context.getBean("meDriver", Driver.class);

        driver.callCar();

        context.close();

    }
}
