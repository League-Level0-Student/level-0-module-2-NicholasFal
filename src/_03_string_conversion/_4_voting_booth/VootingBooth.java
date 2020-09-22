package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VootingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String age = JOptionPane.showInputDialog("How old are you in years?");
		int ageAsInt = Integer.parseInt(age);
		JOptionPane.showInputDialog("Who do you think should be the next president?");
		if(ageAsInt < 18) {
			JOptionPane.showMessageDialog(null, "Well since you can't vote nobody cares what you think.");
		}
	}
	

}
