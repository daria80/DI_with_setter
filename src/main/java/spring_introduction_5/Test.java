package spring_introduction_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        Child child = new Girl();
//        Hospital hospital = new Hospital(child);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Hospital hospital = context.getBean("hospital", Hospital.class);
        hospital.giveBirth();
    }
}
