import javax.swing.JOptionPane;
public class MULTITABLEFINAL {

	public static void main(String[] args) {
		String nbr = JOptionPane.showInputDialog("WHAT MULTIPLICATION TABLE DO YOU WANT?");
		int nr = 0;
		nr = Integer.parseInt(nbr);
		for (int mu = 1-; mu <= nr; mu++){
			int sub = nr*mu;
			System.out.println(mu+"* "+nbr+" ="+sub);
		}
	}

}


