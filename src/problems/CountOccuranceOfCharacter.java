package problems;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfCharacter {
	
	public static void main(String arg[]) {
		
		String s="Ashok";
		
		Map<Character,Integer> count=new HashMap<>();
		
		for(Character c:s.toCharArray()) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}
			else {
				count.put(c, 1);
			}
		}
		
		System.out.print(count);
	}

}
