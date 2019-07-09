package com.tutorial.Game;

import java.awt.*;

public class HUD {

    public static int HEALTH = 100;

    public void tick(){
//        HEALTH--;

        HEALTH = Game.clamp(HEALTH, 0, 100);
    }


    public void render(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(Game.WIDTH/2-125,15,300,32);
        g.setColor(Color.GREEN);
        g.fillRect(Game.WIDTH/2-125,15,HEALTH * 3,32);
        g.setColor(Color.WHITE);
        g.drawRect(Game.WIDTH/2-125,15,300,32);
    }
}
