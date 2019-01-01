package com.gjl.observer;/*
 *用户 Administrator
 *编辑时间 2019/1/1
 *
 *
 */

public interface IPublisher {
    public void registerObserver(ICustomer o);
    public void removeObserver(ICustomer o);
    public void notifyObserver();
}
