package com.bootcamp.Event;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class MultipleEventListeners
{
    @EventListener(ContextStartedEvent.class)
    public void start()
    {
        System.out.println("-------------event started------------");
    }
    @EventListener(ContextStoppedEvent.class)
    public void stop()
    {
        System.out.println("---------------event stopped----------");
    }

}
