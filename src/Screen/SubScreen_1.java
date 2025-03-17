package Screen;
import java.awt.Color;
import java.awt.Container;

public class SubScreen_1 extends Screen{
	
	public SubScreen_1(){
		
	}
	@Override
	public void BackGround(Color color) {
        Container contentPane = getContentPane();
        contentPane.setBackground(color);
        repaint(); // 再描画
	}
}