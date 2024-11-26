package problems;

public class SwappingTwoStrings {
	public static void main(String arg[]) {
		
		String a="goutham";
		String b="ashok";
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}

}
