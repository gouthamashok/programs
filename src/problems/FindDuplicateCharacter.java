package problems;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCharacter {
	
	public static void main(String arg[]) {
		
		String s="aabcdabefghijkiiii";
		char c[]=s.toCharArray();
		
		
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
				
					System.out.println(c[j]);
					break;
				}
			}
		}
		
	}

}
