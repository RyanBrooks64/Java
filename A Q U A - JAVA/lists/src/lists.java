import javax.swing.JOptionPane;
public class lists {
	
	public static void main(String[] args) {
		Object[] poss ={"Cheese","Pepperoni","Pinapple","Supreme","Special"};
		String s = (String)JOptionPane.showInputDialog(
                null,
                "Choose Your Pizza Type:\n"
                + "\"Pizza Type\"",
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                poss,
                "Cheese");
		Object[] possd ={"Water","Pepsi","Sprite","Coffee","Tea"};
		String d = (String)JOptionPane.showInputDialog(
                null,
                "Choose Your Drink Type:\n"
                + "\"Drink Type\"",
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possd,
                "Drink");

				//If a string was returned, say so.
				if ((s != null) && (s.length() > 0)) {
					setLabel("Thank You For Ordering "+d+" & "+s);
					return;
				}
				//setLabel("Green eggs and... " + s + "!");

				setLabel("ORDER A PIZZA");
				//If you're here, the return value was null/empty.
				//setLabel("Come on, finish the sentence!");
	}

	private static void setLabel(String setString) {
		JOptionPane.showMessageDialog(null, setString);
		
		// TODO Auto-generated method stub
		
	}
}