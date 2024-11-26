package problems;

public class CountCapitilizedWords {
	public static void main(String arg[]) {
		String s="Goutham PatiL";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count++;
			}
		}
		
		System.out.print(count);
	}

}
