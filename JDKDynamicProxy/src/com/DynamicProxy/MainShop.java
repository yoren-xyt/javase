package com.DynamicProxy;

import com.DynamicProxy.Factory.UsbKingFactory;
import com.DynamicProxy.Handler.MySellHandler;
import com.DynamicProxy.Service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args)throws Exception {
        // 创建代理对象，使用Proxy
        // 1.创建目标对象
        UsbSell factory = new UsbKingFactory();
        // 2.创建InvocationHandler对象
        InvocationHandler mySellHandler = new MySellHandler(factory);
        // 3.创建代理对象
        // Proxy.newProxyInstance(Class.forName("com.DynamicProxy.Factory.UsbKingFactory").getClassLoader())
        /*UsbSell proxy = (UsbSell)Proxy.newProxyInstance(Class.forName("com.DynamicProxy.Factory.UsbKingFactory").getClassLoader(),
                Class.forName("com.DynamicProxy.Factory.UsbKingFactory").getInterfaces(),
                mySellHandler);*/
        UsbSell proxy = (UsbSell)Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                                                        factory.getClass().getInterfaces(),
                                                        mySellHandler);
        // proxy --->com.sun.proxy.$Proxy0:这是jdk动态代理创建的对象类型，proxy是“$Proxy”类型的
        // 就像Student stu = new Student();中stu是Student类型的对象一样
        System.out.println("proxy --->" + proxy.getClass().getName());
        // 4.同构代理可以执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用发方法：" + price );
    }
}
