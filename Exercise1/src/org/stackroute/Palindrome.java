package org.stackroute;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String pa = scan.next();
		scan.close();
		
		StringBuilder sb = new StringBuilder(pa);
		StringBuilder p = new StringBuilder(sb);
		p.reverse();
		//System.out.println(p);
		//System.out.println(sb);
		//long val = Long.parseLong(sb.toString());
		//long temp1 = val; 
		if(sb.toString().equals(p.toString())){
			//Integer[] val = Integer.parseInt(sb.toString().split(""));//Arrays.stream(sb.toString().substring(0, sb.toString().length()-1).split("")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			int[] val = new int[sb.toString().length()];
			for(int i=0; i<sb.toString().length(); ++i){
				val[i] = Integer.parseInt(sb.toString().substring(i, i+1));
			}
			
			int len = val.length, sum=0;
			String si;
			for(int i=0; i<len; ++i)
			{
				if(val[i]%2==0)
					sum+=val[i];
			}
			if(sum<=25)
				si = "less";
			else
				si = "greater";
			System.out.printf("%s is palidrome and the sum of even numbers is %s than 25",sb.toString(),si);
		}
		else{
			System.out.printf("%s is not palidrome",sb.toString());
		}
		

	}

}
