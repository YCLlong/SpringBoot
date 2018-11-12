package cn.springboot.application;

import cn.expond.commandlinerun.MyRunnaer1;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="cn.expond")
public class CommandLineRunApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CommandLineRunApplication.class);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(MyRunnaer1.class));
    }
}
