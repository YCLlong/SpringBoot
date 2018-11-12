package cn.expond;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyExpond implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        System.out.println("数量：" + context.getBeanFactory().getBeanDefinitionCount());
    }
}
