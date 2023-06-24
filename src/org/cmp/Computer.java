package org.cmp;

public class Computer extends Desktop {
	public void computerModel() {
System.out.println("HP");
	}
	public static void main(String[] args) {
		Computer c=new Computer();
		c.computerModel();
		
		c.desktopSize();
	}
	

}
