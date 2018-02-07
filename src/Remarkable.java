import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Enter a name to find their sport/hobby:");
	if(name.equals("Matt")) {
		JOptionPane.showMessageDialog(null, "scuba");
	}
	if(name.equals("Sheridan")) {
		JOptionPane.showMessageDialog(null, "archery");
	}
	if(name.equals("Lucas")) {
		JOptionPane.showMessageDialog(null, "basketball");
	}
	if(name.equals("Max")) {
		JOptionPane.showMessageDialog(null, "dodgeball");
	}
}
}
