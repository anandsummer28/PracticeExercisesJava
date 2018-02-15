package org.stackroute.exercisetwo;


public class PowerOfFour {

	public boolean checkForPowerOfFour(String str) {
		double d = Double.parseDouble(str);
		if(d <= 0)
			return false;			
		if(Math.floor((Math.log(d))/(Math.log(4))) == (Math.log(d))/(Math.log(4)))
			return true;
		else
			return false;
	}
}
