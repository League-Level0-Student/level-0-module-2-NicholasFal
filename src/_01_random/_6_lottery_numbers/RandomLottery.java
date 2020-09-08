package _01_random._6_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;
public class RandomLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lotteryFull = "";
		Random rand = new Random();
		for(int times = 0; times < 6; times++) {
		int lottery = rand.nextInt(89) + 10;
		lotteryFull = lotteryFull + " " + lottery;
		}
	JOptionPane.showMessageDialog(null, lotteryFull);
	}

}
