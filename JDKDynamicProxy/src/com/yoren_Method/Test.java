package com.yoren_Method;

import com.yoren_Method.Service.inpl.HelloServiceimpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        HelloServiceimpl target = new HelloServiceimpl();
        Method sayHello = HelloServiceimpl.class.getDeclaredMethod("sayHello", String.class);
        /**public Object invoke(Object obj, Object... args){}
         * Object obj 表示对象，要执行这个对象的方法
         * Object... args   方法执行时的参数值
         */
        sayHello.invoke(target,"yoren");

    }
}
