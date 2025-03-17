package Screen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

abstract public class Screen extends JFrame{
	final private int Width = 680;
	final private int height = 480;
	JButton btn = new JButton("色を変える");
	public Screen(){
		setVisible(true);
		setSize(this.Width, this.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	void setTitel(String title) {
		setTitle(title);
	}
	 public void setButton() {
		JPanel pnl = new JPanel();
		pnl.add(btn);
		Container contentPane = getContentPane();
	    contentPane.add(pnl, BorderLayout.CENTER);
	    btn.doClick();
	}
	abstract public void BackGround(Color color);
}