package cn.annotation;

import cn.compment.Compment1;
import cn.compment.MangerCompment;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Import(MangerCompment.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ImportSelectorAnnotation {
    String name() default "ycl";
}
