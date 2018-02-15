package org.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class SortDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] num = scan.next().toCharArray();
		Arrays.sort(num);
		int sum =0,temp=0;
		System.out.print("Sorted number in non-increasing order:");
		for(int i=num.length-1; i>=0; --i){
			System.out.printf("%c",num[i]);
			temp = Integer.parseInt(num[i]+"");
			if(temp%2==0){
				sum += temp;
			}
		}
		System.out.printf("\nSum of even digits: %d\n",sum);
		if(sum<=15)
		 System.out.println("False");
		else
			System.out.println("True");
		scan.close();
	}

}
