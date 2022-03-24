package com.DynamicProxy.Factory;

import com.DynamicProxy.Service.UsbSell;
// 目标类
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中，执行了sell方法");
        return 85.0f;
    }
}
