/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brickbreakergame;

import javax.swing.JFrame;

/**
 *
 * @author Kabeer
 */
public class BrickBreakerGame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePlay gameplay = new GamePlay();
        frame.setBounds(10,10,700,600);
        frame.setTitle("BrickBreaker");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
    }
}
