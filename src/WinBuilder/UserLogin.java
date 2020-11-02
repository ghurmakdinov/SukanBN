package WinBuilder;

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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPasswordField;

public class UserLogin {

	private JFrame frame;
	private int xx;
	private int xy;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void loginPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
					window.frame.setUndecorated(true);
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
	public UserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 706, 382);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserLogin.class.getResource("/resources/Asset 1.png")));
		lblNewLabel.setBounds(-43, -18, 465, 503);
		mainPanel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblUsername.setBounds(417, 103, 85, 13);
		mainPanel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(417, 126, 279, 33);
		mainPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(417, 197, 279, 33);
		mainPanel.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblPassword.setBounds(417, 174, 85, 13);
		mainPanel.add(lblPassword);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("SUNDAY Personal use", Font.PLAIN,16));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUp.setBackground(new Color(241, 57, 83));
		btnSignUp.setForeground(new Color(0,0,0));
		btnSignUp.setBounds(417, 297, 99, 27);
		mainPanel.add(btnSignUp);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserProfile profile = new UserProfile();
				profile.userProfile();
			}
		});
		btnLogIn.setForeground(Color.BLACK);
		btnLogIn.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 16));
		btnLogIn.setBackground(new Color(0, 255, 12));
		btnLogIn.setBounds(597, 297, 99, 27);
		mainPanel.add(btnLogIn);
		mainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e2) {
				
				xx = e2.getX();
				xy = e2.getY();
				
			}
		});
		mainPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg1) {
				
				int x = arg1.getXOnScreen();
				int y = arg1.getYOnScreen();
				//UserLogin.this.setLocation(x - xx, y - xy);
			}
		});
	}
}
