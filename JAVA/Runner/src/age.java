import javax.swing.JOptionPane;
public class age {

	public static void main(String[] args) {
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String codedtext ="";
		String rawtext = JOptionPane.showInputDialog("What Text Do You Wish To Code");
		String key = JOptionPane.showInputDialog("What Is Your Key");
		int keyint = Integer.parseInt(key);
		String keyabc = abc.substring(keyint,26) + abc.substring(0,keyint);
		System.out.println(keyabc);
		rawtext = rawtext.toLowerCase();
		for (int i=0; i<=(rawtext.length())-1; i++){
			char x = rawtext.charAt(i);
				if (x.toString().equals("a").equals("b")){
					int indexlet = abc.indexOf(rawtext.charAt(i));
					String add = Character.toString(keyabc.charAt(indexlet));
					codedtext += add;
				}
				else{
					String fadd = Character.toString(rawtext.charAt(i));
					codedtext += fadd;
				}
			}
			
		}
		JOptionPane.showMessageDialog(null, codedtext);
	}

}
