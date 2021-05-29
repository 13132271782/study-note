package org.note.listener;

import java.util.ArrayList;
import java.util.List;

public class EventSource {

    private List<EventListener> listenerList = new ArrayList<EventListener>();

    public void addListener(EventListener listener){
        listenerList.add(listener);
    }

    public void doBadThing(){
        //嫌疑犯所干的事
        EventObject event = new EventObject();
        //让所有的监听者(警察)知道,我干了这件事
        for(EventListener li : listenerList){
            li.listener(event);
        }
    }

    public void doBadThing(EventObject event){
        //让所有的监听者(警察)知道,我干了这件事
        for(EventListener li : listenerList){
            li.listener(event);
        }
    }

}
