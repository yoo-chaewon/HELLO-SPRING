import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

    public static void main(String[] args){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        Student student = applicationContext.getBean("Student", Student.class);
        student.Study();

        applicationContext.close();

    }
}
