package com.test1;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/*create a login window
 * 
 */

public class Demo5 extends JFrame{
	JPanel account;
	JPanel password;
	JPanel buttons;
	JLabel acc, pswd, bt;
	JButton login, ccl;
	JTextField account_input;
	JPasswordField pswd_input;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d5 = new Demo5();

	}
	public Demo5() {
		account = new JPanel();
		password = new JPanel();
		buttons = new JPanel();
		
		login = new JButton("Login");
		ccl  = new JButton("cancel");

		acc = new JLabel("account");
		pswd = new JLabel("password");
		
		account_input = new JTextField(15);
		pswd_input = new JPasswordField(15);
		
		this.setLayout(new GridLayout(3, 1));
		account.add(acc);
		account.add(account_input);
		
		password.add(pswd);
		password.add(pswd_input);
		
		buttons.add(login);
		buttons.add(ccl);
		
		this.add(account);
		this.add(password);
		this.add(buttons);
		
		this.setTitle("HelloWorld");
		this.setSize(400, 120);
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
