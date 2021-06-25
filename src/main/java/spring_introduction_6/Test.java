package spring_introduction_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//
//        Message message = new Picture();
//        Application application = new Application(message);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Application application = context.getBean("application", Application.class);

        application.sendMessage();
    }

}
