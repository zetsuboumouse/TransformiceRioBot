/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



/**
 *
 * @author Sam
 */
public class RioBot {
    private Robot bot;
    private boolean running = false;
    private int[] keys = {KeyEvent.VK_A, KeyEvent.VK_D};

    public RioBot() {
        try {
            bot = new Robot();
        } catch (AWTException ex) {}
    }

    public void pressKeys() {
        while (running) {
            for (int key : keys) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {}
                bot.keyPress(key);
                bot.keyRelease(key);
            }
        }
    }

    public void on() {
        running = true;
    }

    public void off() {
        running = false;
    }
}

