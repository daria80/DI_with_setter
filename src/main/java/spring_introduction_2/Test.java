package spring_introduction_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        Car car = new Zhiguli();
        Driver driver = new Driver();
        driver.setCar(car);
        driver.callCar();


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Driver driver1 = context.getBean("meDriver", Driver.class);

        driver1.callCar();

        context.close();

    }
}
