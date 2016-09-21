import javax.swing.JOptionPane;
public class cipher {

	public static void main(String[] args) {
		String quest = JOptionPane.showInputDialog("Code, Crack Or Decode");
		quest = quest.toLowerCase();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String codedtext ="";
		if(quest.equals("decode")){
			String precodedtext = JOptionPane.showInputDialog("What Text Do You Wish To Decode");
			String key = JOptionPane.showInputDialog("What Is Your Key");
			int keyint = Integer.parseInt(key);
			String keyabc = abc.substring(keyint,26) + abc.substring(0,keyint);
			System.out.println(keyabc);
			for (int i=0; i<=(precodedtext.length())-1; i++){
				char x = precodedtext.charAt(i);
				switch (x){	
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					int indexlet = keyabc.indexOf(precodedtext.charAt(i));
					String add = Character.toString(abc.charAt(indexlet));
					codedtext += add;
					break;
				default:
					String fadd = Character.toString(precodedtext.charAt(i));
					codedtext += fadd;
			}
			
		}JOptionPane.showMessageDialog(null, codedtext);}
		else if(quest.equals("crack")){
			String precracked = JOptionPane.showInputDialog("What Text Do You Wish To Crack");
			for (int keys=0; keys < 26; keys++){
				String keyabc = abc.substring(keys,26) + abc.substring(0,keys);
				System.out.println(keyabc);
				for (int i=0; i<=(precracked.length())-1; i++){
					char x = precracked.charAt(i);
					switch (x){	
					case 'a':
					case 'b':
					case 'c':
					case 'd':
					case 'e':
					case 'f':
					case 'g':
					case 'h':
					case 'i':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'o':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'u':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						int indexlet = keyabc.indexOf(precracked.charAt(i));
						String add = Character.toString(abc.charAt(indexlet));
						codedtext += add;
						break;
					default:
						String fadd = Character.toString(precracked.charAt(i));
						codedtext += fadd;
				}
			}
			codedtext+="\n";
			
			
		}JOptionPane.showMessageDialog(null, codedtext);}
		else if (quest.equals("code")){
			String rawtext = JOptionPane.showInputDialog("What Text Do You Wish To Code");
			String key = JOptionPane.showInputDialog("What Is Your Key");
			int keyint = Integer.parseInt(key);
			String keyabc = abc.substring(keyint,26) + abc.substring(0,keyint);
			System.out.println(keyabc);
			rawtext = rawtext.toLowerCase();
			for (int i=0; i<=(rawtext.length())-1; i++){
				char x = rawtext.charAt(i);
				switch (x){	
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					int indexlet = abc.indexOf(rawtext.charAt(i));
					String add = Character.toString(keyabc.charAt(indexlet));
					codedtext += add;
					break;
				default:
					String fadd = Character.toString(rawtext.charAt(i));
					codedtext += fadd;
				}
			}
			JOptionPane.showMessageDialog(null, codedtext);
		}
		
	}

}