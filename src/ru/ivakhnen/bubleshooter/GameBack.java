package ru.ivakhnen.bubleshooter;

import java.awt.*;

/**
 * Created by vlad on 22.08.15.
 */
public class GameBack {

    private Color color;


    public GameBack(){
        color = Color.BLUE;
    }


    public void update(){

    }


    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
    }


}
