package cn.event.task;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}
