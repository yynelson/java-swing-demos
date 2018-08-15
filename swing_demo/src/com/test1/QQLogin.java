package com.test1;
import java.awt.*;
import javax.swing.*;

public class QQLogin extends JFrame{
	JPanel central_panel, south_panel;
	//southern components
	JButton login_button, cancel_button, guide_button;
	//northern component
	JLabel logo_label;
	//centralshits
	JTabbedPane jtp;
	JPanel left, mid, right;
	JLabel account_label, password_label, forgot_password_label, password_protection_label;
	JTextField account_input;
	JPasswordField password_input;
	JButton clear_input_button;
	JCheckBox remember_user, invisible_login;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQLogin temp = new QQLogin();
	}
	
	public QQLogin() {
		//central components
		account_label = new JLabel("QQ Number", JLabel.CENTER);
		password_label = new JLabel("Password", JLabel.CENTER);
		
		forgot_password_label = new JLabel("Forgot Password", JLabel.CENTER);
		forgot_password_label.setFont(new Font("TimesRoman", Font.PLAIN, 16));
		forgot_password_label.setForeground(Color.BLUE);
		
		password_protection_label = new JLabel("<html><a href='www.qq.com'> Apply for Password Protection</a></html>");
		password_protection_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		password_protection_label.setFont(new Font(password_protection_label.getFont().getName(), Font.PLAIN, 9));
		
		account_input = new JTextField();
		password_input = new JPasswordField();

		clear_input_button = new JButton("Clear Account Field");
		
		remember_user = new JCheckBox("Remember Me");
		invisible_login = new JCheckBox("Invisible Login");
		
		//northern component
		
		logo_label = new JLabel("腾讯QQ");//new ImageIcon("images/Tencent.jpg"));
		logo_label.setFont(new Font(logo_label.getFont().getName(), Font.PLAIN, 40));
		
		//southern components
		south_panel = new JPanel();
		login_button = new JButton("login");//new ImageIcon("images/QQ.jpg"));
		cancel_button = new JButton("cancel");
		guide_button = new JButton("guide");
		
		//central tabs
		jtp = new JTabbedPane();
		left = new JPanel();
		mid = new JPanel();
		right = new JPanel();
		mid.setBackground(Color.RED);
		right.setBackground(Color.BLACK);
		
		left.setLayout(new GridLayout(3,3));
		left.add(account_label);
		left.add(account_input);
		left.add(clear_input_button);
		left.add(password_label);
		left.add(password_input);
		left.add(forgot_password_label);
		left.add(invisible_login);
		left.add(remember_user);
		left.add(password_protection_label);
		
		jtp.add("QQ Number", left);
		jtp.add("Phone Number", mid);
		jtp.add("Email Login", right);
		
		south_panel.add(login_button);
		south_panel.add(cancel_button);
		south_panel.add(guide_button);
		
		this.add(south_panel, BorderLayout.SOUTH);
		this.add(jtp, BorderLayout.CENTER);
		this.add(logo_label, BorderLayout.NORTH);
		
		this.setTitle("Chat With ***");
		this.setSize(450, 220);
		
		//seticonimage does not take an image icon. it must be passed with
		//function getImage() to make the argument passable
		
		
		//JFrames are set to invisible in default
		this.setVisible(true);
		//first arg sets horizontal dist from top left
		//second sets vertical dist from top left corner
		this.setLocation(100, 200);

		//stop user from changing the window size
		this.setResizable(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		
	}
}
