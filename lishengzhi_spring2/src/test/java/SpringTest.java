import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.lishengzhi_spring2.service.UserServe;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class SpringTest {

    @Test
    public void testAdd() {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServe userServe = (UserServe)applicationContext.getBean("userServe");
        userServe.add();
    }
    @Test
    public void testDruid() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        //设置数据源的基本连接数据
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.1.100:3306/db_mybatis");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        //使用数据源获取连接和归还连接资源
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void druidTest3() throws Exception {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = (DruidDataSource) applicationContext.getBean("dataSource");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
