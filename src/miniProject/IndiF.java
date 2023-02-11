package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class IndiF extends JFrame{

	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndiF frame = new IndiF();
			frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IndiF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		setBounds(100, 100, 450, 300);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Individual Contact");
		lblNewLabel.setFont(new Font("Product Sans", Font.BOLD, 15));
		lblNewLabel.setBounds(142, 11, 197, 14);
		getContentPane().add(lblNewLabel);
	}

}
