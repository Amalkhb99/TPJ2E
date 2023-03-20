package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;
public class PresentationSpring {
    public static void main(String [] args) {
            //Todo Auto-generated method stub

        ApplicationContext context = new ClassPathXmlApplicationContext("dao","metier");
        IMetier m = (IMetier) context.getBean("metier");
        System.out.println(m.calcul());
    }

}
