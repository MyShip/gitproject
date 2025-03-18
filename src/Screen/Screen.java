package Screen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

abstract public class Screen extends JFrame{
	final private int Width = 680;
	final private int Height = 480;
	JButton btn = new JButton("色を変える");
	public Screen(){
		setVisible(true);
		setSize(this.Width, this.Height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setButton();
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
	abstract public void BackGround(Color color);
}