package org.java;

public class For {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i%1==0) {
				continue;	
				
			}
			
			System.out.println(i);
		}
	}

}
