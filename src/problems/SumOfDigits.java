package problems;

public class SumOfDigits {
	
	public static void main(String arg[]) {
		
		int n=123456,sum=0;
		
		
		while(n!=0) {
			sum=sum+n%10;
			n=n/10;
		}
		
		System.out.print(sum);
	}

}
