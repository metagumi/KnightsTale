package knights;

/**
 * Created by sylvesterharvey on 5/2/17.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml"); //minstrel.xml"); //knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
