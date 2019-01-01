/**
 * Filename: ClientTest
 * Author: aa
 * Date : 2019/1/1 19:21
 * Description : ceshi
 */
package com.gjl.observer;/*
 *用户 Administrator
 *编辑时间 2019/1/1
 *
 *
 */

import java.util.ArrayList;
import java.util.List;


public class ClientTest {
    public static void main(String[] args) {

        //消息订阅者
        ICustomer cs1 = new Customer("body01");
        ICustomer cs2 = new Customer("body02");
        ICustomer cs3 = new Customer("body03");

        //消息发布者
        List<ICustomer> observers = new ArrayList<>();
        observers.add(cs1);
        observers.add(cs2);
        observers.add(cs3);

        Publisher subscribe = new Publisher(observers);

        subscribe.setInformation("message01--元旦要快乐");
        System.out.println("cs1取消关注公众号");
        observers.remove(cs1);
        subscribe.setInformation("message2--当然了");

    }
}
