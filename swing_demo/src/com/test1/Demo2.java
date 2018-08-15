//jbutton used to demonstrate the use of borderlayout
package com.test1;
import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame{
	
	JButton jb1, jb2, jb3, jb4, jb5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d2 = new Demo2();
	}
	
	public Demo2() {
		jb1 = new JButton("top");
		jb2 = new JButton("adc");
		jb3 = new JButton("supp");
		jb4 = new JButton("mid");
		jb5 = new JButton("jg");
		
		this.add(jb1, BorderLayout.NORTH);
		//this.add(jb3, BorderLayout.WEST);
		this.add(jb2, BorderLayout.SOUTH);
		this.add(jb4, BorderLayout.CENTER);
		this.add(jb5, BorderLayout.EAST);

		//configure window
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
