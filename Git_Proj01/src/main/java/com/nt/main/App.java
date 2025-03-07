package com.nt.main;

/**
 * Hello world!
 */
public class App {
	
	public int sum(int x,int y) {
		return x+y;
	}
    public static void main(String[] args) {
       // System.out.println("Hello World!");
        App app= new App();
        System.out.println("Sum:: "+app.sum(10,20));
        System.out.println("Sum amount:: "+app.sum(10,20));
    }
}
