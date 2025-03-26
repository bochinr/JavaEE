import com.lishengzhi.entity.User;
import com.lishengzhi.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisTest {
    @Test
    public void addTest() throws IOException {
//        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User对象的数据
        User user = new User();
//        user.setId();
         user.setUsername("李胜志");
//        user.setUsername("张思");
        user.setPassword("123456");
        user.setGender("男");
        user.setEmail("123@qq.com");
//        执行UserMapper里的add方法
        mapper.add(user);
//        提交事件
        sqlSession.commit();
    }

    @Test
    public void deleteByIdTest() throws IOException {
//        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteById(1259);
//        提交事件
        sqlSession.commit();
    }

    @Test
    public void findById() throws IOException {
//        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = mapper.findById(2333);
        System.out.println(u);
//        提交事件
        sqlSession.commit();
    }

    @Test
    public void findAll() throws IOException {
//        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
//        提交事件
        sqlSession.commit();
    }

    @Test
    public void updataById() throws IOException {
//        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setUsername("公生");
        user.setPassword("1234567");
        user.setEmail("shijieqiangongyuanxunyigeqiji@66.com");
        user.setGender("女");
//        提交事件
        sqlSession.commit();
    }

//    条件查询
    @Test
    public void findConditionTest() throws IOException {
    //        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    //        User对象的数据
        User user = new User();
//        user.setId(1);
//        user.setUsername("公生");
        user.setPassword("123456");
        user.setGender("女");
//        user.setEmail("123@qq.com");
        List<User> all = mapper.findCondition(user);
        for (User user1 : all) {
            System.out.println(user1);
        }

    //        提交事件
        sqlSession.commit();
    }
//    @Test
//    public void updateCondition() throws IOException {
//        //        读取mybatis的配置文件
//        String resource = "mybatis-config.xml";
//        InputStream inputsteam = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        //        User对象的数据
//        User user = new User();
//        user.setId(3399);
//        //    user.setUsername("有马公生");
//        //    user.setPassword("123456");
//        //    user.setGender("男");
//        //    user.setEmail("4499@qq.com");
//        List<User> all = mapper.findCondition(user);
//        for (User user1 : all) {
//            System.out.println(user1);
//        }
//
//        //        提交事件
//        sqlSession.commit();
//    }


    @Test
    public void findBySingleConditionTest() throws IOException {
        //        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("李胜志");
        user.setGender("男");
        List<User> all = mapper.findBySingleCondition(user);
        for (User user1 : all) {
            System.out.println(user1);
        }
    //        提交事件
        sqlSession.commit();
    }
    //遍历查询
    @Test
    public void findByIdsTest() throws IOException {
        //        读取mybatis的配置文件
        String resource = "mybatis-config.xml";
        InputStream inputsteam = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputsteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用userMapper对象的方法
        List list = new ArrayList();
        list.add(234);
        list.add(247);
//        list.add(5);
        List userList = mapper.findByIds(list);
        //处理结果
        System.out.println(userList);
        //释放资源
        sqlSession.close();
    }
}

