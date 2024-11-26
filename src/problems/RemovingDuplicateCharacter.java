package problems;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateCharacter {
	
	public static void main(String arg[]) {
		
		String s="abcdabcdefgefg";
		
		Set<Character>c=new HashSet<>();
		
		for(Character a:s.toCharArray()) {
			c.add(a);
		}
		
		StringBuffer sb=new StringBuffer();
		
		for(Character a:c) {
			sb.append(a);
		}
		
		System.out.print(sb);
	}

}
