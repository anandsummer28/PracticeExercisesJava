package org.stackroute;

public class Students {
	
	public static void main(String[] args) {
		Students mark = new Students();
		String[] marks = {"12","13","14","11","10"};
		
		System.out.println(mark.average(marks));
		System.out.println(mark.minimum(marks));
		System.out.println(mark.maximum(marks));
		System.out.println(mark.isInteger("abcd"));
	}
	
	
	public boolean isInteger(String str) {
		try{
			  @SuppressWarnings("unused")
			int num = Integer.parseInt(str);
			  // is an integer!
		} 
		catch (NumberFormatException e) {
			  // not an integer!
			return false;
		}
		return true;
	}
	
	public int average(String[] grades) {
		int[] marks = new int[grades.length];
		int sum = 0;
		for(int i = 0; i< grades.length; ++i) {
			marks[i] = Integer.parseInt(grades[i]);
			sum += marks[i];
		}
		return sum/marks.length;
	}
	
	public int minimum(String[] grades) {
		int[] marks = new int[grades.length];
		int minGrade = Integer.parseInt(grades[0]);
		
		for(int i = 1; i< grades.length; ++i) {
			marks[i] = Integer.parseInt(grades[i]);
			minGrade = (minGrade <= marks[i])?minGrade:marks[i];
		}
		return minGrade;
	}
	
	public int maximum(String[] grades) {
		int[] marks = new int[grades.length];
		int maxGrade = Integer.parseInt(grades[0]);
		
		for(int i = 1; i< grades.length; ++i) {
			marks[i] = Integer.parseInt(grades[i]);
			maxGrade = (maxGrade >= marks[i])? maxGrade:marks[i];
		}
		return maxGrade;
	}
}
