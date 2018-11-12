package cn.event.task;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandl {
    /**
     *
     * @param event 参数可以是任意的
     */
    @EventListener
    public void event(Object event){
        System.out.println("handle event"+ event.toString());
    }
}
