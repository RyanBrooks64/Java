import javax.swing.JOptionPane;
public class GRADEcheck {

	public static void main(String[] args) {
		/*String trueGrade = JOptionPane.showInputDialog("WHAT IS THE GRADE ?");
		int rawGrade = 0;
		rawGrade = Integer.parseInt(trueGrade);
		
		switch (rawGrade){
		
		case 
		}*/
		
		grading('A');
		System.out.println();
		grading('B');
		System.out.println();
		grading('C');
		System.out.println();
		grading('D');
		System.out.println();
		grading('F');
		System.out.println();
		grading('q');
		
	} // E MAIN
	
	
			
		} // E switch 1
		
		prediction(sP);
		
	}	// E Grading
	
	public static void prediction (int sF){
		switch (sF){
		
		case 5:
			System.out.println("YOU WILL SUCCEED .");
			break;
		case 4:
			System.out.println("YOU WILL LEARN A LOT .");
			break;
		case 3:
			System.out.println("YOU WILL UNDERSTAND SOME THINGS .");
			break;
		case 2:
			System.out.println("YOU WILL MISS A LOT OF INFORMATION .");
			break;
		case 1:
			System.out.println("YOU WILL NOT SUCCEED .");
			break;
		case 0:
			System.out.println("ERROR IN GRADING .");
			break;
		default:
			System.out.println("ERROR IN PREDICTION .");
		
		} // E switch 1
		
	}	// E Prediction
	
} // E GRADEcheck
