package com.xshalk.servlet;

public class BeanModel {
    private int bmp = 90;

    public void initialize() {
        System.out.println("设置定序器");
        System.out.println("节拍器");
    }

    public void on() {
        setBmp(90);
    }

    public void off() {
        setBmp(0);
    }

    public int getBmp() {
        return bmp;
    }

    public void setBmp(int bmp) {
        this.bmp = bmp;
    }
}
