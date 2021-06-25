package spring_introduction_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        Message message = new Text();
        Application application = new Application();
        application.setMessage(message);
        application.sendMessage();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Application application1 = context.getBean("application", Application.class);
        application1.sendMessage();

        context.close();
    }

}
