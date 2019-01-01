/**
 * Filename: publisher
 * Author: gjl
 * Date : 2019/1/1 18:48
 * Description : 发布者
 */
package com.gjl.observer;/*
 *用户 Administrator
 *编辑时间 2019/1/1
 *
 *
 */


import java.util.List;

public class Publisher implements IPublisher{

    private List<ICustomer> observers;
    private String message;

    public Publisher(List<ICustomer> observers){
        this.observers  = observers;
    }

   public void registerObserver(ICustomer o){
       observers.add(o);
   }

   public void removeObserver(ICustomer o ){
        if(!observers.isEmpty()){
            observers.remove(o);
        }
   }

   public void notifyObserver(){
        for(ICustomer o : this.observers){
           o.receiveMessage(message);
        }
   }

   /*
   *设置了消息立即通知观察者
    */
   public void setInformation(String message){
       this.message = message;
       System.out.println("公众号更新消息如下："+ message);

       //通知观察者
       notifyObserver();
   }




}
