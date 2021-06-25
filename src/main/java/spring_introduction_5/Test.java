package spring_introduction_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        Child child = new Boy();
        Hospital hospital = new Hospital();
        hospital.setChild(child);
        hospital.giveBirth();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Hospital hospital1 = context.getBean("hospital", Hospital.class);
        hospital1.giveBirth();

        context.close();
    }
}
