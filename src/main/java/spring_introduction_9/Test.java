package spring_introduction_9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext9.xml");
        Translator translator1 = context.getBean("translator",Translator.class);
        translator1.translate();

        context.close();
    }
}
