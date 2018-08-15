package com.test1;
import java.awt.*;
import javax.swing.*;

/*
 * uses jcheckbox, jradiobutton and buttongroup
 * 
 */

public class Demo6 extends JFrame{
	
	JPanel interests, gender, buttons;
	JLabel interests_label, gender_label;
	JButton sign_up_button, cancel_signup_button;
	JCheckBox jc1, jc2, jc3;
	JRadioButton jrb1, jrb2;
	ButtonGroup bg;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 d6 = new Demo6();
	}
	
	public Demo6() {
		interests = new JPanel();
		gender = new JPanel();
		buttons =  new JPanel();
		
		interests_label = new JLabel("Please select your interests");
		gender_label = new JLabel("Please select your gender");
		
		sign_up_button = new JButton("Sign Up");
		cancel_signup_button = new JButton("Cancel");
		
		jc1 = new JCheckBox("soccer");
		jc2 = new JCheckBox("basketball");
		jc3 = new JCheckBox("hockey");
		
		jrb1 = new JRadioButton("Male");
		jrb2 = new JRadioButton("Female");
		
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		this.setLayout(new GridLayout(3, 1));
		
		interests.add(interests_label);
		interests.add(jc1);
		interests.add(jc2);
		interests.add(jc3);
		interests.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		gender.add(gender_label);
		gender.add(jrb1);
		gender.add(jrb2);
		gender.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		buttons.add(sign_up_button);
		buttons.add(cancel_signup_button);
		
		
		this.add(interests);
		this.add(gender);
		this.add(buttons);
		
		
		this.setTitle("HelloWorld");
		this.setSize(450, 120);
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
