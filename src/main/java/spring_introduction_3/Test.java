package spring_introduction_3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Library library = context.getBean("library", Library.class);
//
//        Book book = new Fairytale();
//        Library library = new Library(book);
//
        library.giveNeedBook();
    }
}
