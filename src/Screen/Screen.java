package Screen;
import javax.swing.JFrame;
public class Screen extends JFrame{
	final private int Width = 680;
	final private int height = 480;
	public Screen(String title){
		setTitle(title);
		setVisible(true);
		setSize(this.Width, this.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}