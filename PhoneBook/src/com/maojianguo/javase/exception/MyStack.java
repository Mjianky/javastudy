package com.maojianguo.javase.exception;

public class MyStack {
    private Object[] elements;
    private int index;

    public MyStack() {
        index = 0;
        elements = new Object[10];
    }

    public MyStack(int i) {
        this.elements =new Object[i];
        index = 0;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void push(Object obj) throws MyStackOperationException{
        if (index >= elements.length) {
            throw new MyStackOperationException("栈已满，压栈失败");
        }
        elements[index++] = obj;
        System.out.println("压栈" + obj + "成功，栈帧指向" + index);
    }

    public void pop() throws MyStackOperationException {
        if (index == 0) {
            throw new MyStackOperationException("栈已空，弹栈失败");
        }
        System.out.println("弹栈" + elements[--index] + "成功，栈帧指向" + index);
        elements[index] = null;
    }
}
