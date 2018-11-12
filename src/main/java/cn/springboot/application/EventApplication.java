package cn.springboot.application;

import cn.event.task.MyEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.DelegatingApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListenerMethodProcessor;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class EventApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EventApplication.class);
        ConfigurableApplicationContext context = application.run(args);
        context.publishEvent(new MyEvent("jyf"));
        context.publishEvent(new MyEvent("jyf"));
        context.publishEvent(new MyEvent("jyf1"));
    }
}
