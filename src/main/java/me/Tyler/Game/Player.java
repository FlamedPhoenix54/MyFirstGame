package me.Tyler.Game;

import java.awt.*;

public class Player extends GameObject{
    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        if (id == ID.Player) g.setColor(Color.WHITE);
        else if (id == ID.Player2) g.setColor(Color.BLUE);
        g.fillRect(x, y, 32, 32);
    }
}
