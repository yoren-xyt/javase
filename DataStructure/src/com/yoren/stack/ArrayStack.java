package com.yoren.stack;

import java.util.ArrayList;

public class ArrayStack {
    /**
     * 栈的大小
     */
    private int maxStack ;

    /**
     * 数组用来模拟栈
     */
    private int[] stack;

    /**
     * 表示栈顶所在的位置，默认为-1
     */
    private int top = -1;
    public ArrayStack(int maxStack){
        this.maxStack = maxStack;
    }

    public ArrayStack() {}

    /**
     * 判断是否栈空
     */
    public boolean isFull(){
        return this.top == -1;
    }

    /**
     * 判断是否栈满
     */
    public boolean isEmpty(){
        return this.top == this.maxStack-1;
    }

    /**
     * 压栈
     */
    public void push(int val){
        if(isFull()){
            throw new RuntimeException("栈已满");
        }
        top++;
        stack[top] = val;
    }

    /**
     * 弹栈
     */
    public int pop(){
    if(isEmpty()){
        throw new RuntimeException("栈已空，未找到数据");
    }
    int val = stack[top];
    top--;
    return val;
    }

    /**
     * 查看栈中所有元素
     */
    public void list(){
        if(isEmpty()){
            throw new RuntimeException("栈已空，未找到数据");
        }
        for(int s: stack){
            System.out.println(s);
        }
    }

}
