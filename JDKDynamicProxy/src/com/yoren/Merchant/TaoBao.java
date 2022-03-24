package com.yoren.Merchant;

import com.yoren.Service.UsbSell;
import com.yoren.factory.UsbKingFactory;

/**
 * 淘宝是一个商家，是代理金士顿U盘的销售
  */

public class TaoBao implements UsbSell {
    /**声明 商家代理的厂家具体是谁*/
    private UsbSell factory = new UsbKingFactory();

    /**
     *
     * @param amount
     * @return
     */
    @Override
    public float sell(int amount) {
        // 向厂家发送订单
        float price = factory.sell(amount);
        // 商家需要加价(增强功能)
        // 代理类在完成目标类方法调用后，增强了功能
        // 在目标类的方法调用后，你做的其他功能，都是增强的意思
        price = price + 25;
        System.out.println("淘宝商家，给你返一个优惠券，或者红包");
        // 增加的价格
        return price;
    }
}
