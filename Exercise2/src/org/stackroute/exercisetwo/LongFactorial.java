package org.stackroute.exercisetwo;

public class LongFactorial {
	
	
	public String factorial(String str) {
		double num, number;
		try{
			num = Double.parseDouble(str);
			  // is an integer!
		} 
		catch (NumberFormatException e) {
			  // not an integer!
			return "Invalid Input:Enter Numbers Only";
		}
		
		number = Math.floor(num);
		long multiply;
		if(num != number)
			return "Invalid Input:No Fractions Allowed";
		else {
			long n = (long) number; 
			multiply = 1;
			for(int i=1; i<=n; ++i) {
				multiply *= i;
				if(multiply < 0)
					return "Out of Range";
			}
		return String.valueOf(multiply);
		}
	}

}
