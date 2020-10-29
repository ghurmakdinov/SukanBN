package WinBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
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
					Home frame = new Home();
					//frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 419);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlDkShadow);
		panel.setBounds(5, 5, 335, 370);
		contentPane.add(panel);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 16));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUp.setBackground(new Color(241, 57, 83));
		btnSignUp.setForeground(new Color(0, 0, 0));
		btnSignUp.setBounds(377, 348, 289, 27);
		contentPane.add(btnSignUp);
		
		textUserName = new JTextField();
		textUserName.setBounds(377, 89, 289, 31);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 15));
		lblNewLabel.setBounds(377, 64, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 15));
		lblEmail.setBounds(377, 131, 78, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(377, 156, 289, 31);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(377, 198, 132, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(377, 223, 289, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(377, 290, 289, 31);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("REPEAT PASSWORD");
		lblNewLabel_1_1_1.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(377, 265, 132, 14);
		contentPane.add(lblNewLabel_1_1_1);
	}
}
