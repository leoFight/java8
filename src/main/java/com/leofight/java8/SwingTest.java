package com.leofight.java8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My Button");

        /*jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed!");
            }
        });*/

        //上述注释代码可替换为如下代码
        jButton.addActionListener(e -> System.out.println("Button Pressed!"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
