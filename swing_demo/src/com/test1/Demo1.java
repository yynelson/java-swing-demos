//demonstrates jframe and jbutton
package com.test1;

import java.awt.*;
import javax.swing.*;
public class Demo1 extends JFrame{
	
	//declare swing components needed
	JButton jb;
	
	//main function
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		
	}
	
	//because this class extends JFrame, we use a constructor to create the 
	//jframe to be run
	public Demo1() {
		//create swing components here
		jb = new JButton("ImaButton");
		
		//add component to jframe
		this.add(jb);
		
		//configure jframe
		this.setTitle("HelloWorld");
		this.setSize(200, 200);
		//JFrames are set to invisible in default
		this.setVisible(true);
		//first arg sets horizontal dist from top left
		//second sets vertical dist from top left corner
		this.setLocation(100, 200);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
