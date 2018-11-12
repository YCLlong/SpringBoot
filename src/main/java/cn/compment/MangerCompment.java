package cn.compment;

import cn.annotation.ImportSelectorAnnotation;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.scheduling.annotation.Async;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
public class MangerCompment implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //1，创建要注入的对象
        BeanDefinitionBuilder db = BeanDefinitionBuilder.rootBeanDefinition(Compment1.class);
        // 2,通过 BeanDefinitionRegistry 对象可以直接往Spring容器中注入类
        beanDefinitionRegistry.registerBeanDefinition("com1",db.getBeanDefinition());
    }
}
