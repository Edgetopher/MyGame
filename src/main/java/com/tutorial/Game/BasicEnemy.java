package com.tutorial.Game;

import java.awt.*;

public class BasicEnemy extends GameObject {

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);

        velX = 5;
        velY =5;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 16,16);
    }

    public void tick() {
        x += velX;
        y += velY;

        if (y <= 0 || y >= Game.HEIGHT -45) velY *= -1;
        if (x <= 0 || x >= Game.WIDTH -20) velX *= -1;

    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x,y,16,16);

    }
}
