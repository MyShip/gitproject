import java.awt.Color;
import java.util.Scanner;

import Screen.Screen;
import Screen.SubScreen_1;
public class GameMain{
	public static void main(String[] args) {
		Screen scr = new SubScreen_1();
		scr.setTitle("ゲームタイトル");
		scr.setButton();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int interval = 0;
		
		while(true) {
			
			switch(number) {
			case 1:
				scr.BackGround(Color.RED);
				break;
			case 2:
				scr.BackGround(Color.BLUE);
				break;
			}
		}
	}
}
