package chapter11.innerclass.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 用于控制系统的可复用框架
 */
public class Controller {

    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        while (eventList.size() > 0) {
            // 创建一个副本，这样在选择列表中的元素时就不会改动列表了
            for (Event event : new ArrayList<>(eventList)) {
                if (event.ready()) {
                    System.out.println("event = " + event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
