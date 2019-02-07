package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String testscore =JOptionPane.showInputDialog("What was your test score?");
	double scores = Double.parseDouble(testscore);
	if(scores>(90) && scores<(99)) {
		JOptionPane.showMessageDialog(null, "Good but not good enough");
		}
	else if(scores>(70) && scores<(89)) {
		JOptionPane.showMessageDialog(null, "I mean you passed but...");
	}
	else if(scores>0 && scores<69) {
		JOptionPane.showMessageDialog(null, "");
	}
}
}
