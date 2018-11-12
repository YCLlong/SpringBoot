package cn.event.lisenner;

import cn.event.task.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyLisenner implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        if(myEvent.getSource().equals("jyf")){
            System.out.println("love jyf");
        }
    }
}
