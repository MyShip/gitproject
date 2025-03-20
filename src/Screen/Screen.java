package Screen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import Object.Player;
abstract public class Screen extends JFrame{
	final private int Width = 680;
	final private int Height = 480;
	JButton btn = new JButton("色を変える");
	Player player = new Player();
	public Screen(){
		setVisible(true);
		setSize(this.Width, this.Height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setButton();
		player.setImageSize(150, 150);
		add(player, BorderLayout.CENTER);
		addKeyListener(new KeyAdapter() {
			@Override
            public void keyPressed(KeyEvent e) {
                player.KeyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.keyReleased(e);
            }
		});
	    btn.addActionListener(new ActionListener() {
	        private boolean isRed = false; // 背景色を切り替えるフラグ
	        @Override
	         public void actionPerformed(ActionEvent e) {
	            if (isRed) {
	                BackGround(Color.BLUE);
	            } else {
	                BackGround(Color.RED);
	            }
	                isRed = !isRed; // フラグを切り替える
	         }
	    });
	    Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.move();
                player.repaint();
            }
        });
        timer.start();

	    
	}
	void setTitel(String title) {
		setTitle(title);
	}
	 public void setButton() {
		JPanel pnl = new JPanel();
		pnl.add(btn);
		Container contentPane = getContentPane();
	    contentPane.add(pnl, BorderLayout.SOUTH);
	}
	 public void move() {
		 
	 }
	abstract public void BackGround(Color color);
}