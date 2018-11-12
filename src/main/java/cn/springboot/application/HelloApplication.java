package cn.springboot.application;

import cn.compment.Compment1;
import cn.compment.MangerCompment;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@Import(MangerCompment.class)
public class HelloApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(HelloApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
        Compment1 compment1 = (Compment1) context.getBean("com1");
        compment1.show();
        System.out.println("=======================main-end========================");
    }
}
