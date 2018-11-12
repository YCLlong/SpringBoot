package cn.springboot.application;

import cn.expond.MyExpond;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class InitApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(InitApplication.class);
       // application.addInitializers(new MyExpond());
        ConfigurableApplicationContext context = application.run(args);
    }
}
