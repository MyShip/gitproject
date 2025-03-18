package Screen;
import java.awt.Color;

public class SubScreen_1 extends Screen{
	
	public SubScreen_1(){
		BackGround(Color.BLUE);
	}
	@Override
	public void BackGround(Color color) {
		getContentPane().setBackground(color);
        repaint(); // 再描画
	}
}