
import com.lishengzhi_spring3.config.SpringConfiguration;
import com.lishengzhi_spring3.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test2() {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.add();
    }
    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService = (UserService) applicationContext.getBean("userService");
        //userService.add();
    }

}
