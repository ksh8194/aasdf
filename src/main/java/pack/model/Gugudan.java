package pack.model;

public class Gugudan {
	
	
	public int[] guguCalc(int dan) {
		int [] gu = new int[9];
		for(int i=0;i<9;i++) {
			 gu[i] =  dan * (i+1); 
		}
		return gu;
	}
}
