import java.util.*;

public class UsingHashmap{

	public static void findRepeatedWords(String a){
		HashMap<String, Integer>hm = new HashMap<String, Integer>();// Creating HashMap
	
		
		a = a.replaceAll("\\p{Punct}","");
		a = a.toLowerCase();
		System.out.println(a);

		String[] words = a.split(" ");
		for(int i = 0; i < words.length; i++){
			int k = 1;
			
			if(hm.containsKey(words[i])){
				k = hm.get(words[i]);

				k++;
				
			}
			hm.put(words[i], k);
			}

			System.out.println(hm);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.ot.println("Enter a string to check for the repeated words:");
		String a = scn.nextLine();
			findRepeatedWords(a);
			
			

		
		

	}
}


