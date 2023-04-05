package suvd2;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class swing {
	
	static boolean visibility = true;
	static boolean disable = false;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	
		
		// hamgii ehmii hesegt golloj garah ug
		JLabel lbl = new JLabel("Hello Swing UI");
		lbl.setBounds(150, 20, 100, 40);
		// button
		JButton btnClick = new JButton("Click me");
		btnClick.setBounds(100, 100, 90, 40); 
		btnClick.setBackground(Color.pink);
		JButton btnPress = new JButton("Press me");
		btnPress.setBounds(200, 100, 90, 40);
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(100, 150, 90, 40);
		JButton btnHide = new JButton("hide/show");
		btnHide.setBounds(200, 150, 90, 40);
		JButton btnDisable = new JButton("Disable");
		btnDisable.setBounds(100, 200, 90, 40);
		JButton btnEditable = new JButton("Editable");
		btnEditable.setBounds(200, 200, 90, 40);
		
		// text bichih heseg
		JTextField txt = new JTextField();
		txt.setBounds(96, 55, 200, 30);
		
		
		frame.add(lbl);
		frame.add(btnClick);
		frame.add(btnPress);
		frame.add(btnDelete);
		frame.add(btnHide);
		frame.add(btnDisable);
		frame.add(btnEditable);
		frame.add(txt);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 500); //400 ni urgun, 500 undur haragdah tsonhnii hemjee
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
		
		btnClick.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(btnClick.getText());
			}});
		
		btnPress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(btnPress.getText());
			}});
		
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				txt.setText("");
			}});

		btnHide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// hamgiin deed taliin ugiig alga bolgoj gargaj irne
				if (visibility) {
					visibility = false;
				}
				else {
					visibility = true;
				}
				lbl.setVisible(visibility);
			}});
		
		
		txt.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
					
			}

			@Override
			public void keyPressed(KeyEvent e) {
					
			}

			@Override
			public void keyReleased(KeyEvent e) {
				lbl.setText(txt.getText());
					
			}});
		
		btnDisable.addActionListener(new ActionListener() {
			// ugnii ungu budgerne
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(txt.isEnabled()) {
					txt.setEnabled(false);
				}
				else {
					txt.setEnabled(true); 
				}
			}});
		
		btnEditable.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// text bichigdeh hesgiin ungu uurchludunu
				if(txt.isEditable()) {
					txt.setEditable(false);
				}
				else {
					txt.setEditable(true);
				}
			}});
		
		btnPress.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btnPress.setBackground(Color.decode("#7889b0"));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btnPress.setBackground(Color.decode("#fd9e7b"));
			}});
	}

}
