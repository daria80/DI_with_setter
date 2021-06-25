package spring_introduction_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Mama mama = context.getBean("Mama",Mama.class);

        mama.pourDrink();
    }
}
