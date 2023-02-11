package miniProject;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class AddC extends JFrame {

	protected static final JOptionPane JOptionPane = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddC frame = new AddC();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddC() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 36, 196, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 87, 196, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 129, 196, 31);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//super("AddC");
				JOptionPane.showMessageDialog(AddC.this, "Welcome to Swing!");
				setVisible(false);
			}
		});
		btnNewButton.setBounds(161, 200, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(59, 44, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo.setBounds(37, 93, 95, 14);
		contentPane.add(lblMobileNo);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailId.setBounds(37, 135, 95, 14);
		contentPane.add(lblEmailId);
	}
}
