package com.bootcamp.Event;

import com.bootcamp.Event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent>{
    @Override
    public void onApplicationEvent(CustomEvent event) {

        System.out.println(event.getSource());
    }
}
