package cn.expond.commandlinerun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyRunnaer2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===========runner2 run==========");
    }
}