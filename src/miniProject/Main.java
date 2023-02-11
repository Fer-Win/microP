package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(62, 62, 62));
		frame.setForeground(new Color(62, 62, 62));
		frame.setBackground(new Color(62, 62, 62));
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 73, 335, 377);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contacts :");
		lblNewLabel.setBounds(136, 11, 100, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Show");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndiF f3 = new IndiF();
				f3.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(129, 343, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(355, 11, 269, 137);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
	
		JLabel lblNewLabel_1 = new JLabel("User Profile :");
		lblNewLabel_1.setBounds(89, 11, 145, 14);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(62, 62, 62));
		panel_3.setBounds(10, 11, 335, 51);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("My Contacts Application");
		lblNewLabel_2.setBounds(61, 11, 212, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel_3.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddC f2 = new AddC();
				f2.setVisible(true);
			}
		});
		btnNewButton.setBounds(445, 237, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
