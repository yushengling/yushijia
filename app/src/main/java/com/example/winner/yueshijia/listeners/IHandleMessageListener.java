package com.example.winner.yueshijia.listeners;

/**
 * Created by winner on 2016/11/7.
 */

public interface IHandleMessageListener<T> {
    
    void handlerMessage(int action, T t,boolean isFirst);
}
