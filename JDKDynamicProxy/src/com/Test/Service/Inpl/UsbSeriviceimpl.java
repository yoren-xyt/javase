package com.Test.Service.Inpl;

import com.Test.Service.UsbService;



public class UsbSeriviceimpl implements UsbService {
    @Override
    public String Hello(String name) {
        System.out.println("Hello方法执行了");
        if("金士顿".equals(name)){
            name = name + "有库存";
        }else{
            name = name + "没有库存了";
        }
        return name;
    }
}
