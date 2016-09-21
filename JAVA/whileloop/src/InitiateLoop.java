import  javax.swing.JOptionPane;

public class InitiateLoop {///

	public static void main(String[] args) {////
		/*int ct=10000;
		while (ct > 10){/////
			System.out.print("COUNT = "+ct);
			ct/=5;*/
		char dd = 'Y'; // char continue response
		String jj =""; // raw continue response
		int p = 0; // continue response correct?
		String ui =""; // number
		int rem =0; // remainder
		int uie =0; // number not as string
		do{
			p = 0;
			ui = javax.swing.JOptionPane.showInputDialog("What is your number");
			uie = Integer.parseInt(ui);
			rem = uie % 2;
			if (rem==1){
				javax.swing.JOptionPane.showMessageDialog(null,"Your number is odd");
			}
			else{
				javax.swing.JOptionPane.showMessageDialog(null, "Your number is even");
			}
			while (p== 0){
				jj = javax.swing.JOptionPane.showInputDialog("Continue");
				jj = jj.toUpperCase();
				dd=jj.charAt(0);
				if(dd=='Y'){
					p =1;
				}
				else if (dd =='N'){
					p = 1;
				}
				else{
					p = 0;
				}
					
			}
			
		}while (dd == 'Y');
	}////

}///
