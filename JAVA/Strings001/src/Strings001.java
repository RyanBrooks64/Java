
public class Strings001 {

		//toUpperCase - toLowerCase
		//compareTo (alpha compare)
		//indexOf -- pos of char in string
		//endWith - startWith
		//substring -- heavily used
		//equals -- only with strings
		//charAt
		//trim
		//valueOf
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "jiMMy";
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
		name = name.toUpperCase();
		System.out.println(name);
		System.out.println();
		int result;
		String s1 = "apple";
		String s2 = "dile";
		result = s1.compareTo(s2);
		
		if (result<0){
			System.out.println("s1<s2");
		}
		else if (result>0){
		
			System.out.println("s1>s2");
		}
		else{
			System.out.println("s1=s2");
		}
		System.out.println();
		
		String seq1 = "CHs";
		String seq2 = "chS";
		
		if (seq1.equalsIgnoreCase(seq2)){
			System.out.println("they are equal");
		}
		else {
			System.out.println("they are not equal");
		}
		String[] stringArray = new String[5];
		stringArray[0]= "Welcome";
		stringArray[1]= "To";
		stringArray[2]= "My";
		stringArray[3]= "Own";
		stringArray[4]= "Room";
		
		for (int i=0; i<5; i++){
			System.out.print(stringArray[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println();
		String word = "Thursday";
		for (int ii=0; ii < word.length(); ii++){
			System.out.println(ii);
				System.out.println(word.substring(ii,ii+1));
		}
	}

}
