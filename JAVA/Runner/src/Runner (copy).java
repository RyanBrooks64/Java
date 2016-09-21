import javax.swing.JOptionPane;

public class age{
	public static void main(String[] args) {
		String ageInput = "";
		int age = 0;
		String msg = "";
		ageInput = JOptionPane.showInputDialog("WHAT IS YOUR AGE");
		age = Interger.parseInt(ageInput);
		
		if (age < 18)
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A MINOR")
		}
		else if (age >= 18)
		{
			JOptionPane.showMessageDialog(null,"YOU ARE AN ADULT")
		}
		else
		{
			JOptionPane.showMessageDialog(null,"YOU ARE AN IDIOT")
		}
	}
}
