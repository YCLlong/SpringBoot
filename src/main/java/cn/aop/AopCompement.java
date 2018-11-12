package cn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopCompement {
    /**
     * 针对演讲的方法，需要在演讲前鞠躬
     */

    @Before("execution(* cn.aop..TestCompement.say(..))")
    public void beforeSay(){
        System.out.println("演讲前鞠躬。。。");
    }

    @After("execution(* cn.aop..TestCompement.say(..))")
    public void afterSay(JoinPoint joinPoint){
        //JoinPoint 对象自动注入，类似方法执行的上下文
        System.out.println("演讲后鼓掌。。。" + joinPoint.getKind());
    }
}
