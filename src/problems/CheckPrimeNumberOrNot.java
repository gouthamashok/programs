package problems;

public class CheckPrimeNumberOrNot {
	
	public static void main(String arg[]) {
		int a=5;
		int count=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count=count+1;
			}
		}
		
		if(count==2) {
			System.out.print("It is prime number");
		}
		else {
			System.out.print("It is not prime number");
		}
	}

}
