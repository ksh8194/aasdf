package pack.controller;

import pack.model.Gugudan;

public class MyProcess {
	private String name;    
	private int dan;
	private Gugudan gugudan;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	public void setGugudan(Gugudan gugudan) {
		this.gugudan = gugudan;
	}
	
	 
	public void  print() {
		int[] gu = gugudan.guguCalc(dan);
		System.out.println("작성자 : "+ name);
		for(int i=0;i<9;i++) {
			//System.out.printf("%d*%d=%d\n", dan,i,gu[i]);
			System.out.println(dan+"*"+(i+1)+"="+gu[i]);
		}
	}
}
