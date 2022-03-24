package com.yoren_Method.Service.inpl;

import com.yoren_Method.Service.HelloService;

public class HelloServiceimpl implements HelloService {

    @Override
    public void sayHello(String s){
        System.out.println("你好" + s);
    }
}
