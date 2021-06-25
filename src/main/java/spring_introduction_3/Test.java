package spring_introduction_3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        Book book = new Science();
        Library library = new Library();
        library.setBook(book);
        library.giveNeedBook();


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Library library1 = context.getBean("library", Library.class);
        library1.giveNeedBook();
        context.close();
    }
}
