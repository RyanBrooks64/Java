import javax.swing.JOptionPane;
public class StringsProject {

	public static void main(String[] args) {
		String wordraw = JOptionPane.showInputDialog("What Is Your Word?");
		String fin = "";
		for (int i=(wordraw.length())-1; i>=0; i--){
			String let = Character.toString(wordraw.charAt(i));
			fin += let;
		}
		JOptionPane.showMessageDialog(null, fin);
				

	}

}
