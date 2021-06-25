package spring_introduction_10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        Banknote banknote = new Dollar();
        ATM atm = new ATM(banknote);
        atm.cash();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext10.xml");
        ATM atm1 = context.getBean("atm", ATM.class);
        atm1.cash();
    }
}
