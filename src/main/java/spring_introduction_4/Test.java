package spring_introduction_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        Jar jar = new Milk();
        Mama mama = new Mama();
        mama.setJar(jar);
        mama.pourDrink();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Mama mama1 = context.getBean("Mama",Mama.class);
        mama1.pourDrink();
        context.close();
    }
}
