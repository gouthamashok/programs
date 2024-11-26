package problems;

public class ToCheckArmstrongNumber {
	
	public static void main(String arg[]) {
		int num=153;
		int temp1=num;
		int temp2=num;
		int len=0,sum=0;
		
		
		while(num!=0) {
			num=num/10;
			len++;
		}
		
		while(temp1!=0) {
			int digit=temp1%10;
			sum=(int)(sum+Math.pow(digit, len));
			temp1=temp1/10;
		}
		
		if(sum==temp2) {
			System.out.print("Armstrong Number");
		}
		else {
			System.out.print("Not armstrong number");
		}
		
	}

}
