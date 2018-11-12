package cn.stater;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@ConditionalOnClass(Jedis.class)
@EnableConfigurationProperties(RediesProperties.class)
public class RediesAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    public Jedis getJedis(RediesProperties properties){
        return new Jedis(properties.getIp(),properties.getPort());
    }
}
