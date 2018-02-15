package org.stackroute;

public class ProgramOne {
	
	String as = "anything";

	public static void main(String[] as) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 11;
		int z = x+y;
		System.out.println("Hello World!" + z);
		System.out.println(sum(x,y));
		//System.out.println(args);
		
	}
	
	public static int sum(int a, int b){
		return a + b;
	}

}


