package cn.springboot.application;

import cn.jdbc.Online;
import cn.jdbc.OnlineDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
@ComponentScan("cn.jdbc")
@EnableTransactionManagement
public class JdbcApplication {
    public static void main(String[] args) throws SQLException {
        SpringApplication application = new SpringApplication(JdbcApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
        DataSource dataSource = context.getBean(DruidDataSource.class);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库失败");
        }
        System.out.println(connection.getClass());
        System.out.println(context.getBean(JdbcTemplate.class));
        OnlineDao onlineDao = context.getBean(OnlineDao.class);
        List<Online> list = onlineDao.getAll();
     //   onlineDao.addOnline(new Online("192.168.0.1","251121753"));
        onlineDao.deleteOnline(new Online("192.168.0.1","251121753"));
    }
}
