package com.yoren.Service;

/**
 * 表示功能的，厂家，商家都要完成的功能
 */
public interface UsbSell {
    /**
     * 定义方法
     * @param表示一次购买的数量
     * @return表示一个U盘的价格
     */
    float sell(int amount);

}
