package com.tutorial.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private Handler handler;
    private boolean uP = false;
    private boolean dP = false;
    private boolean lP = false;
    private boolean rP = false;

    public KeyInput(Handler handler){
        this.handler = handler;
    }
    public void keyPressed(KeyEvent event) {
        int key = event.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject temp = handler.object.get(i);
            if (temp.getId() == ID.Player) {
                //Key events for player 1
                if (key == KeyEvent.VK_W) {
                    uP = true;
                    temp.setVelY(-5);
                }
                if (key == KeyEvent.VK_S) {
                    dP = true;
                    temp.setVelY(5);
                }
                if (key == KeyEvent.VK_A) {
                    lP = true;
                    temp.setVelX(-5);
                }
                if (key == KeyEvent.VK_D) {
                    rP = true;
                    temp.setVelX(5);
                }
            }


            if (temp.getId() == ID.Player2) {
                //Key events for player 2
                if (key == KeyEvent.VK_UP) temp.setVelY(-5);
                if (key == KeyEvent.VK_LEFT) temp.setVelX(- 5);
                if (key == KeyEvent.VK_RIGHT) temp.setVelX(5);
                if (key == KeyEvent.VK_DOWN) temp.setVelY(5);
            }
//        System.out.println(key);

            if (key == KeyEvent.VK_ESCAPE) System.exit(1);
        }
    }
    public void keyReleased(KeyEvent event) {
        int key = event.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject temp = handler.object.get(i);
            if (temp.getId() == ID.Player) {
                //Key events for player 1
                if (key == KeyEvent.VK_W){
                    uP = false;
                    if (uP){
                        temp.setVelY(-5);
                    } else {
                        temp.setVelY(0);
                    }
                }
                if (key == KeyEvent.VK_S) {
                    dP = false;
                    if (dP){
                        temp.setVelY(5);
                    } else {
                        temp.setVelY(0);
                    }
                }
                if (key == KeyEvent.VK_A){
                    lP = false;
                    if (lP){
                        temp.setVelY(-5);
                    } else {
                        temp.setVelX(0);
                    }
                }
                if (key == KeyEvent.VK_D){
                    rP = false;
                    if (rP){
                        temp.setVelY(5);
                    } else {
                        temp.setVelX(0);
                    }
                }
            }


            if (temp.getId() == ID.Player2) {
                //Key events for player 2
                if (key == KeyEvent.VK_UP) temp.setVelY(0);
                if (key == KeyEvent.VK_LEFT) temp.setVelX(0);
                if (key == KeyEvent.VK_RIGHT) temp.setVelX(0);
                if (key == KeyEvent.VK_DOWN) temp.setVelY(0);
            }

        }
    }
}
