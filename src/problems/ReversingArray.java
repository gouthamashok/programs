package problems;

import java.util.Arrays;

public class ReversingArray {
	public static void main(String arg[]) {
		int a[]= {1,2,3,4,5,6,7};
		
		int start=0;
		int last=a.length-1;
		int temp;
		while(start<last){
			temp=a[start];
			a[start]=a[last];
			a[last]=temp;
			start++;
			last--;
			
		}
		
		System.out.print(Arrays.toString(a));
		
	}

}
