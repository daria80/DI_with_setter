package spring_introduction_8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
        GardenBed gardenBed1 = context.getBean("gardenBed", GardenBed.class);
        gardenBed1.sowedInTheGarden();

    }
}
