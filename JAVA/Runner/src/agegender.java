import javax.swing.JOptionPane;

public class agegender{
	public static void main(String[] args) {
		String ageInput = "";
		int age = 0;
		String msg = "";
		ageInput = JOptionPane.showInputDialog("WHAT IS YOUR AGE ?");
		age = Integer.parseInt(ageInput);
		
		if (age < 18)
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A MINOR");
		}
		else if (age >= 18)
		{
			JOptionPane.showMessageDialog(null,"YOU ARE AN ADULT");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"THIS IS NOT AN AGE");
		}
		String gInput = "";
		char gen = ' ';
		gInput = JOptionPane.showInputDialog("WHAT IS YOUR GENDER (M/F/O)");
		gInput = gInput.toUpperCase();
		gen = gInput.charAt(0);
		String yis = "";
		String gu ="";
		int yiss = 0;
		yis = JOptionPane.showInputDialog("WHAT GRADE ARE YOU IN (9/10/11/12)");
		yiss = Integer.parseInt(yis);		
		if (yiss == 9)
		{
			gu = "FRESHMAN";
		}
		else if (yiss == 10)
		{
			gu = "SOPHOMORE";
		}
		else if (yiss == 11)
		{
			gu = "JUNIOR";
		}
		else if (yiss == 12)
		{
			gu = "SENIOR";
		}
		/*if (gen == 'R')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A ROBOT");
		}
		else if (gen == 'F')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A FEMALE");
		}
		else if (gen == 'M')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A MALE");
		}
		else if (gen == 'O')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE OTHER");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"YOU ARE AN ATTACK HELICOPTER");
		}*/
		
		
		
		if (age <18 && gen == 'M')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A MINOR MALE AND A "+gu);
		}
		else if (age <18 && gen == 'F')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A MINOR FEMALE AND A "+gu);
		}
		else if (age >=18 && gen == 'F')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A ADULT FEMALE AND A "+gu);
		}
		else if (age >=18 && gen == 'M')
		{
			JOptionPane.showMessageDialog(null,"YOU ARE A ADULT MALE AND A "+gu);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"WHAT ARE YOU SAYING"+gu);
		}
		/*else if (age >=18 && gen == 'R')
		{
			JOptionPane.showMessageDialog(null,"<3");
		}
		else if (age <18 && gen == 'R')
		{
			JOptionPane.showMessageDialog(null,"SON ?");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"WHAT ARE YOU ?");
		}*/
		
	}
}
