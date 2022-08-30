package chapter11.innerclass.controller;

import java.time.Duration;
import java.time.Instant;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 用于控制事件的公共方法
 */
public abstract class Event {
    private Instant eventTime;
    protected final Duration delayTime;

    public Event(long millisecondDelay) {
        this.delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }

    // 可以重启
    public void start() {
        eventTime = Instant.now();
    }

    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();
}
