package Object;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
public class Player extends JPanel{
	private Image img;
	private int imgWidth = 2;
	private int imgHeight = 2;
	private int positionX = 50;
	private int positionY = 50;
	boolean flag_up = false, flag_down = false, flag_left = false, flag_right;
	int speed = 5;
	public Player(){
		img = Toolkit.getDefaultToolkit().getImage("player.png");
        setFocusable(true);  // ← フォーカスを取得
        requestFocusInWindow();
	}
	public void setImageSize(int width, int height) {
		this.imgWidth = width;
		this.imgHeight = height;
		repaint();
	}
	public void setPositionX(int positionX, int positionY) {
		this.positionX= positionX;
		this.positionY = positionY;
		repaint();
	}
	public int positionX() {
		return this.positionX;
	}
	public int positionY() {
		return this.positionY;
	}
	
	public void KeyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			flag_up = true;
			break;
		case KeyEvent.VK_DOWN:
			flag_down = true;
			break;
		case KeyEvent.VK_LEFT:
			flag_left = true;
			break;
		case KeyEvent.VK_RIGHT:
			flag_right = true;
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			flag_up = false;
			break;
		case KeyEvent.VK_DOWN:
			flag_down = false;
			break;
		case KeyEvent.VK_LEFT:
			flag_left = false;
			break;
		case KeyEvent.VK_RIGHT:
			flag_right = false;
			break;
		}
	}
	public void keyTyped(KeyEvent e) {
		
	}
	public void move() {
		if(flag_up) {
			this.positionY -= speed;
		}
		if(flag_down) {
			this.positionY += speed;
		}
		if(flag_left) {
			this.positionX -= speed;
		}
		if(flag_right) {
			this.positionX += speed;
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, this.positionX, this.positionY, this.imgWidth, this.imgHeight , this);
	}
	
	
}