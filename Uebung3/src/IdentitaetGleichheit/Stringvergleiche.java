package IdentitaetGleichheit;

/**
 * Beispiel zeigt den erweiterten Datentyp String und
 * den vergleich mittels == fuer Idenditaet und equals()
 * fuer inhaltliche Uebereinstimung. 
 * @author Marcel
 * @author Yves
 */
public class Stringvergleiche {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
			
		// Welche Bediengung ist und wahr und warum?
		if (str1 == str2){
			System.out.println("== is true");
		} else{
			System.out.println("== is false");
		}
		
		if (str1.equals(str2)){
			System.out.println("equals() is True");
		}
		
		System.out.println("********************");
		
		str2 = "a";
		str2 += "b";
		str2 += "c";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		// Was ist hier anders?
		if (str1 == str2){
			System.out.println("== is true");
		} else{
			System.out.println("== is False");
		}
		
		if (str1.equals(str2)){
			System.out.println("equals() is True");
		}
		
		System.out.println("********************");
		
		str2 = "was anderes";
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		if (str1.equals(str2)){
			System.out.println("equals() is True");
		} else{
			System.out.println("equals() is False");
		}
	}

}
