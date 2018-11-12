package cn.springboot.application;

import cn.aop.TestCompement;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.aop")
public class AopApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AopApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context =  application.run(args);
       TestCompement compement = context.getBean(TestCompement.class);
       compement.say();
    }
}
