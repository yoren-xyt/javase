package com.Test;

import com.Test.Handler.MyServiceHandler;
import com.Test.Service.Inpl.UsbSeriviceimpl;
import com.Test.Service.UsbService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class myApp {
    public static void main(String[] args) {
        // 创建目标对象
        UsbService factory = new UsbSeriviceimpl();
        // 创建InvocationHandler对象
        InvocationHandler handler = new MyServiceHandler(factory);
        // 创建代理对象
        UsbService u = (UsbService) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        String s = u.Hello("金士顿");
        String s1 = u.Hello("闪迪");
        System.out.println(s);
        System.out.println(s1);
    }
}
