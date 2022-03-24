package com.Test.Handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyServiceHandler implements InvocationHandler {
    private Object target = null;

    public MyServiceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(target, args);
        if (res != null){
              String brand= (String)res;
              res = brand;
        }
        return res;
    }
}
