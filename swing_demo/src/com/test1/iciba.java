package com.test1;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class iciba extends JFrame{
	
	JSplitPane spliter;
	JList word_list;
	JLabel logo;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iciba diction = new iciba();
	}

	public iciba() {
		String []words = {"abandon", "abnormal"};
		word_list = new JList(words);
		logo = new JLabel(new ImageIcon("images/iciba.com.jpg"));
		
		spliter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, word_list, logo);
		//expandable feature
		spliter.setOneTouchExpandable(true);
		this.add(spliter);
		
		
		this.setTitle("HelloWorld");
		this.setSize(450, 520);
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
