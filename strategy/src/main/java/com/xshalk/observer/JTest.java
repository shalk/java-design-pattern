package com.xshalk.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTest {
    JFrame frame;

    public static void main(String[] args) {
        JTest jTest = new JTest();
        jTest.go();
    }

    public void go() {
        frame = new JFrame("NO  title");
        JButton btn = new JButton("click me");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("nice to meet you, clicker");
            }
        });
        btn.addActionListener(
                e -> System.out.println("button event:" + e)
        );
        frame.getContentPane().add(BorderLayout.CENTER, btn);

        frame.setVisible(true);
        //使右上角的关闭按钮生效，如果没有这句，点击右上角的关闭按钮只能关闭窗口，无法结束进程
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
