package com.test1;
import java.awt.*;
import javax.swing.*;

//this is flow layout demo
//gridlayout: 
//this.setLayout(new GridLayout(row_num,col_num, optional row_space, optinal col_space));


public class Demo3 extends JFrame{

	JButton jb1, jb2, jb3, jb4, jb5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d3 = new Demo3();
	}
	public Demo3() {
		jb1 = new JButton("top");
		jb2 = new JButton("adc");
		jb3 = new JButton("supp");
		jb4 = new JButton("mid");
		jb5 = new JButton("jg");
		
		this.add(jb1);
		this.add(jb3);
		this.add(jb2);
		this.add(jb4);
		this.add(jb5);
		
		
		this.setLayout(new FlowLayout(FlowLayout.LEADING));

		//configure window
		this.setTitle("HelloWorld");
		this.setSize(200, 200);
		//JFrames are set to invisible in default
		this.setVisible(true);
		//first arg sets horizontal dist from top left
		//second sets vertical dist from top left corner
		this.setLocation(100, 200);

		//stop user from changing the window size
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
