/**
 * 
 * @author AXEL
 *Invert an array
 */
public class Main {

	public static void main(String[] args) {

		String frase = "this is my array";
		String newFrase = "";
		
		for(int i=frase.length()-1 ; i>=0; i--)
		{
			newFrase += frase.charAt(i);
		}
		System.out.print(newFrase);
	}

}
