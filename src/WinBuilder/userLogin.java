package WinBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;

public class userLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userLogin frame = new userLogin();
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
	public userLogin() {
		setTitle("User Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setForeground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSukanBN = new JLabel("SukanBN");
		lblSukanBN.setBounds(140, 68, 150, 69);
		lblSukanBN.setForeground(Color.DARK_GRAY);
		lblSukanBN.setHorizontalAlignment(SwingConstants.CENTER);
		lblSukanBN.setFont(new Font("SUNDAY Personal use", Font.BOLD, 30));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(105, 148, 67, 27);
		btnLogin.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 16));
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(246, 148, 89, 27);
		btnRegister.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 16));
		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		contentPane.add(btnRegister);
		contentPane.add(lblSukanBN);
	}
}
