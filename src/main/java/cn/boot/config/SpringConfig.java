package cn.boot.config;

import cn.boot.dao.UserDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration //通过该注解表明是一个Spring的配置类没相当于是一个xml配置文件
@ComponentScan(basePackages = "cn.boot.service") //配置扫描包
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true) //ignoreResourceNotFound为true时，表示找不到资源文件直接忽略，默认是false，找不到资源文件就报错
@ImportResource(value = {"classpath:haha.xml","classpath:xixi.xml"})
public class SpringConfig {
    //在service 层注入了UserDao对象，而UserDao就相当于是Bean
    @Bean //相当于配置文件里的<Bean> 标签
    public UserDao getUserDao(){
        return new UserDao();
    }
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    // @Value标签直接从@PropertySource 指定的资源文件中读取配置的值，然后注入到成员属性
    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.password}")
    private  String password;

    @Value("${jdbc.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    //配置Druid连接池
    @Bean(destroyMethod = "close")
    public DruidDataSource getDruidDataSource(){
        DruidDataSource druid = new DruidDataSource();
        druid.setDriverClassName(driverClassName);
        druid.setUrl(url);
        druid.setUsername(userName);
        druid.setPassword(password);
        druid.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        return druid;
    }
}
