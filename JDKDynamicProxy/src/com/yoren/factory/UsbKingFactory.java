package com.yoren.factory;

import com.yoren.Service.UsbSell;

/**
 * 目标类：金士顿厂家,不接受用户单独购买
 */
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        // 128G的U盘，85元
        // 后期根据amount，可以实现不同的价格，例如10000个的单价80，20000个单价75
        if(amount > 20000){
            amount = 75;
        }else if(amount > 10000){
            amount = 80;
        }else{
            amount = 85;
        }
        return amount;
    }
}
