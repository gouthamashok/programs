package problems;

public class ReversingString {
	public static void main(String arg[]) {
		
		String s="Mahesh";
		char a[]=s.toCharArray();
		String r=" ";
		
		for(int i=a.length-1;i>=0;i--) {
			r=r+a[i];
		}
		
		System.out.println(r);
	}

}
