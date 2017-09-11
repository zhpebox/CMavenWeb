package com.thrift.test;

import org.apache.thrift.TException;

public class HelloWorldImpl implements HelloWorldService.Iface{
    @Override
    public String sayHello(User user) throws TException {
        System.out.println(" this is Server , now is precessing user:"+user.toString());
        return "Hi,My name is " + user.username + " and My age is " + user.age;
    }

}
