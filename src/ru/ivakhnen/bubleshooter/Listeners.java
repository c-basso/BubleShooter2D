package ru.ivakhnen.bubleshooter;

import java.awt.event.*;

/**
 * Created by vlad on 22.08.15.
 */
public class Listeners implements KeyListener, MouseListener, MouseMotionListener {


    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_UP){
            Player.up = true;
        }

        if(key == KeyEvent.VK_DOWN){
            Player.down = true;
        }

        if(key == KeyEvent.VK_LEFT){
            Player.left = true;
        }

        if(key == KeyEvent.VK_RIGHT){
            Player.right = true;
        }

        if(key == KeyEvent.VK_SPACE){
            Player.isFiring = true;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_UP){
            Player.up = false;
        }

        if(key == KeyEvent.VK_DOWN){
            Player.down = false;
        }

        if(key == KeyEvent.VK_LEFT){
            Player.left = false;
        }

        if(key == KeyEvent.VK_RIGHT){
            Player.right = false;
        }

        if(key == KeyEvent.VK_SPACE){
            Player.isFiring = false;
        }

        if(key == KeyEvent.VK_ESCAPE){
            GamePanel.state = GamePanel.State.MENU;
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            Player.isFiring = true;
            GamePanel.leftMouse = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            Player.isFiring = false;
            GamePanel.leftMouse = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        GamePanel.mouseX = e.getX();
        GamePanel.mouseY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        GamePanel.mouseX = e.getX();
        GamePanel.mouseY = e.getY();
    }
}
