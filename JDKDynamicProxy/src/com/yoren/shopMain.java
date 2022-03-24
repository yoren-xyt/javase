package com.yoren;

import com.yoren.Merchant.TaoBao;

public class shopMain {
    public static void main(String[] args) {
        /**
         * 创建代理的商家淘宝对象
         */
        TaoBao taoBao = new TaoBao();
        System.out.println(taoBao.sell(1));
    }
}
