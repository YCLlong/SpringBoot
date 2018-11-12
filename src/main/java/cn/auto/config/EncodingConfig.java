package cn.auto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EncodingConfig {

    @Bean
    @Conditional(GBKEncodingCondition.class)
    public IEncodingConvert getGbkConvert(){
        return new GBKConvert();
    }

    @Bean
    @Conditional(UTFEncodingCondition.class)
    public IEncodingConvert getUtfConvert(){
        return new UTFEncodingConvert();
    }
}
