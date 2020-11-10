import java.util.*;

public class UsingHashmap{

	public static void findRepeatedWords(String array){
		HashMap<String, Integer>hm = new HashMap<String, Integer>();// Creating HashMap
	
		
		array = array.replaceAll("\\p{Punct}","");
		array = array.toLowerCase();
		System.out.println(array);

		String[] words = array.split(" ");
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


	public static int[] twoNumberSum(int[] array, int targetSum) {
  
  	Set<Integer> hsh = new HashSet<>();
		for(int i : array){
			int y = targetSum - i;
			if(hsh.contains(y))
				return new int[] {y, i};
			else hsh.add(i);
   
 	 }
		return new int[0];
	}


}


