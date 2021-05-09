package cola.springTest.demo01DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TextEditor te = (TextEditor) applicationContext.getBean("textEditor");
        te.spellCheck();
    }
}
