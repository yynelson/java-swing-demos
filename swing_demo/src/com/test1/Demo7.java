package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo7 extends JFrame{
	
	JPanel origin_cities, destination_cities;
	JLabel origin_label, destin_label;
	JComboBox origin_options;
	JList destin_options;
	JScrollPane destin_scroll;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 d7 = new Demo7();
	}
	public Demo7() {
		origin_cities = new JPanel();
		destination_cities = new JPanel();
		
		origin_label = new JLabel("origin_city");
		destin_label = new JLabel("destination");
		
		String []cities = {"Beijing", "Shanghai", "Hongkong", "New York City",
				"Los Angelos", "Ann Arbor", "Tokyo", "Peyongyang"};
		
		origin_options = new JComboBox(cities);
		
		destin_options = new JList(cities);
		destin_options.setVisibleRowCount(3);
		destin_scroll = new JScrollPane(destin_options);
		
		
		origin_cities.add(origin_label);
		origin_cities.add(origin_options);
		
		destination_cities.add(destin_label);
		destination_cities.add(destin_scroll);

		
		
		this.setLayout(new GridLayout(2, 1));
		
		this.add(origin_cities);
		this.add(destination_cities);
		
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
