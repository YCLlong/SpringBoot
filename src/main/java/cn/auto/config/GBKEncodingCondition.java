package cn.auto.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKEncodingCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String fileEncoding = System.getProperty("file.encoding").toLowerCase();
        if(fileEncoding.equals("gbk")){
            return true;
        }
        //return false表示不装裴，true表示装配
        return false;
    }
}
