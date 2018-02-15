package org.stackroute;

import java.util.Scanner;

public class UnspecifiedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String num;
		int sum=0, temp = 0, flag=1;
		num = scan.nextLine();
		String[] str = num.split(" ");
		for(int i=0; i<str.length; ++i){			
			//if(Pattern.compile("-?[0-9]+").matches(num))
			try{
				temp = Integer.parseInt(str[i]);
				//System.out.println(temp);
			}
			catch (NumberFormatException e){
				flag =0;
			}
			sum += temp;
		}
				
		if(flag == 1){
			System.out.println(sum);
		}
		else{
			System.out.println("Invalid input!");
		}
		scan.close();
	}

}
