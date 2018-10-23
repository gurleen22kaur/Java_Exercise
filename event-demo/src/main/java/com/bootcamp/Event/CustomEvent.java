package com.bootcamp.Event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
    public CustomEvent(Object source)
    {
        super(source);
        System.out.println("Event published");
    }
}
