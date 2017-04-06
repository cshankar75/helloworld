/**
 * 
 */
package com.chander;

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

	

}
