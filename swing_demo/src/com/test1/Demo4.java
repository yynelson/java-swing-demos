package com.test1;
import java.awt.*;
import javax.swing.*;
import java.util.*;
/*demo for jpanel
 * 
 */


public class Demo4 extends JFrame {
	ArrayList<JButton> jbs;
	JPanel jp1, jp2, jp3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d4 = new Demo4();
	}
	public Demo4() {
		jbs = new ArrayList<JButton>(9);
		jp1 = new JPanel();
		jp2 = new JPanel();
		for (int i = 0; i < 9; i++) {
			jbs.add(new JButton(String.valueOf(i)));
		}
		System.out.print(jbs.size());
		jp1.add(jbs.get(0));
		jp1.add(jbs.get(1));
		jp2.add(jbs.get(2));
		jp2.add(jbs.get(3));
		
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2, BorderLayout.SOUTH);
		this.add(jbs.get(4));
		
		
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
