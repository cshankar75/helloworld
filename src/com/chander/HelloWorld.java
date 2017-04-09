/**This is a helloworld Application
 * 
 */
package com.chander;

import java.util.Scanner;

/**
 * @author chandershankar
 *
 */
public class HelloWorld {

	
	private String name ="";
	
	public String getName(){
		return name;
	}
	
	public String getMessage(){
		
		if(name ==""){
			return "Hello!";
		} else{
			return "Hello "+ name + "!";
		}
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public HelloWorld(String name){
		this.name=name;
	}

public static void main(String []args){
		
		HelloWorld h = new HelloWorld();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.nextLine();
		h.setName(name);
		System.out.println(h.getMessage());
		s.close();
		System.exit(0);
	}

}
