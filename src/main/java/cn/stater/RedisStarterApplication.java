package cn.stater;

import cn.aop.TestCompement;
import cn.springboot.application.AopApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableRedis
public class RedisStarterApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AopApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context =  application.run(args);
        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);
    }
}
