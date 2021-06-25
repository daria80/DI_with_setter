package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {


//        Pet pet = new Cat();
//        Person person = new Person(pet);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();

        context.close();


    }
}
