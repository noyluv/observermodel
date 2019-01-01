/**
 * Filename: Customer
 * Author: gjl
 * Date : 2019/1/1 18:45
 * Description : 观察者
 */
package com.gjl.observer;/*
 *用户 Administrator
 *编辑时间 2019/1/1
 *
 *
 */

import java.util.List;

public class Customer implements ICustomer{
    private String name;
    private String message;

    public Customer(String name){
        this.name = name ;
    }

    public void receiveMessage(String message){
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name + ":收到推送消息："+message);
    }


}
