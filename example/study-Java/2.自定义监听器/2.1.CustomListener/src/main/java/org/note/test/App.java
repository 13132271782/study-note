package org.note.test;

import org.note.listener.EventObject;
import org.note.listener.EventSource;

public class App {

    public static void main(String[] args) {
        EventObject eventObject = new EventObject();
        eventObject.setMsg("我是自定义监听器");
        EventSource eventSource = new EventSource();
        eventSource.addListener(new MyListener());
        eventSource.doBadThing(eventObject);
    }

}
