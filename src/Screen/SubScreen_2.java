package Screen;
import java.awt.Color;
public class SubScreen_2 extends Screen{
	public SubScreen_2(){
		BackGround(Color.RED);
	}
	@Override
	public void BackGround(Color color) {
		getContentPane().setBackground(color);
        repaint(); // 再描画
	}
}