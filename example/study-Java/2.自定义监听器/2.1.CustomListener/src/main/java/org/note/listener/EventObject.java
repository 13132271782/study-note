package org.note.listener;

import lombok.Data;

// 事件
@Data
public class EventObject {

    private Object event;
    private String msg;

}
