package org.stackroute;

import java.util.Scanner;

public class NRepeats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		int n = scan.nextInt();
		String last = "";
		for(int i=input1.length()-n; i<input1.length(); ++i )
			last += input1.charAt(i);
		System.out.print(input1);
		for(int i=0; i<n-1; ++i)
			System.out.print(last);
		scan.close();

	}

}
