package cn.stater;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RediesAutoConfigure.class)
public @interface EnableRedis {
}
