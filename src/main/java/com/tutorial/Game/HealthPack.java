package com.tutorial.Game;

import java.awt.*;

public class HealthPack extends GameObject {
    private Handler handler;
    public HealthPack(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    public void tick() {
    }


    public void render(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, 16,16);

    }

    public Rectangle getBounds() {
        return new Rectangle(x,y,16,16);
    }
}
