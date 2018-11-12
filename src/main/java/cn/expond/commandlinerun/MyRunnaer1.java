package cn.expond.commandlinerun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyRunnaer1 implements CommandLineRunner, Ordered {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===========runner1 run==========");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
