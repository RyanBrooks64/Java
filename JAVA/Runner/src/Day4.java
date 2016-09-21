import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		/*String age_string = "";
		String firstName = JOptionPane.showInputDialog("-- PLEASE ENTER YOUR FIRST NAME --");
		JOptionPane.showMessageDialog(null, ("-- YOUR FIRST NAME IS ''"+firstName+"'' --"));
		String lastName = JOptionPane.showInputDialog("-- PLEASE ENTER YOUR LAST NAME --");
		JOptionPane.showMessageDialog(null, ("-- YOUR FULL NAME IS ''"+firstName+" "+lastName+"'' --"));
		age_string = JOptionPane.showInputDialog("-- WHAT IS YOUR AGE --");
		int age = Integer.parseInt(age_string);
		age +=5;
		JOptionPane.showMessageDialog(null, "-- YOU WILL BE ''"+age+"'' IN 5 YEARS --");*/
		
		
		String long_string = "";
		long_string = JOptionPane.showInputDialog("-- HOW LONG IS THE BOX --");
		float long_ = Float.parseFloat(long_string);
		String tall_string = "";
		tall_string = JOptionPane.showInputDialog("-- HOW TALL IS THE BOX --");
		float tall = Float.parseFloat(tall_string);
		String wide_string = "";
		wide_string = JOptionPane.showInputDialog("-- HOW WIDE IS THE BOX --");
		float wide = Float.parseFloat(wide_string);
		float volume = long_*tall*wide;
		JOptionPane.showMessageDialog(null, "-- THE BOX IS ''"+volume+"'' UNITS IN VOLUME --");
		System.exit(0);
	}
		

}
