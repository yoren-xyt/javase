package com.DynamicProxy.Handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 *  必须实现InvocationHandler接口来完成代理类做的功能
 *      1.调用目标方法
 *      2，功能增强
 * */
public class MySellHandler implements InvocationHandler {
    private  Object target = null;
    // 动态代理：目标对象是活动的，不是固定的，需要传入进来
    // 传入的是谁，就给谁创建代理
    public MySellHandler(Object target) {
        // 给目标对象赋值
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;

        // float price = factory.sell(amount);
        res = method.invoke(target,args);

        // 功能增强：price = price + 25;
        if(res != null){
            Float price = (Float)res;
            price = price + 25;
            res = price;
        }
        System.out.println("淘宝商家，给你返一个优惠券，或者红包");
        return res;
    }
}
