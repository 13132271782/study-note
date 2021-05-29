package org.note.test;

import org.note.listener.EventListener;
import org.note.listener.EventObject;

// 监听着的实现类
public class MyListener implements EventListener {
    public void listener(EventObject object) {
        System.out.println(object);
    }
}
