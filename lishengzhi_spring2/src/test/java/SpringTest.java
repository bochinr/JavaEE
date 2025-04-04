import com.lishengzhi_spring2.service.UserServe;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testAdd() {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServe userServe = (UserServe)applicationContext.getBean("userServe");
        userServe.add();
    }
}
