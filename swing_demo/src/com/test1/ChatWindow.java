package com.test1;
import java.awt.*;
import javax.swing.*;

public class ChatWindow extends JFrame{

	JTextArea chat_hist = null;
	JScrollPane chat_hist_scroller;
	JPanel jp1 = null;
	JComboBox jcb = null;
	JTextField mess_in = null;
	JButton send_mess = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatWindow chat = new ChatWindow();
	}
	
	public ChatWindow() {
		chat_hist = new JTextArea();
		jp1 = new JPanel();
		chat_hist_scroller = new JScrollPane(chat_hist);
		
		String []chatter = {"Alice", "Bob"};
		jcb = new JComboBox(chatter);
		mess_in = new JTextField(10);
		send_mess = new JButton("send");
		
		jp1.add(jcb);
		jp1.add(mess_in);
		jp1.add(send_mess);
		
		this.add(chat_hist_scroller);
		this.add(jp1, BorderLayout.SOUTH);
		
		this.setTitle("Chat With ***");
		this.setSize(450, 520);
		
		//seticonimage does not take an image icon. it must be passed with
		//function getImage() to make the argument passable
		this.setIconImage(new ImageIcon("images/chat_icon.jpeg").getImage());
		
		
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
