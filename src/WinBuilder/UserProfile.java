package WinBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class UserProfile {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile window = new UserProfile();
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
	public UserProfile() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 704, 41);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome. ");
		lblWelcome.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblWelcome.setBounds(10, 0, 100, 41);
		panel.add(lblWelcome);
		
		//placeholder for  name
		String name = null;
		JLabel lblUserName = new JLabel();
		lblUserName.setName(name);
		lblUserName.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblUserName.setBounds(74, 0, 106, 41);
		panel.add(lblUserName);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 12));
		btnNewButton.setBounds(623, 9, 71, 23);
		panel.add(btnNewButton);
		
		JLabel lblBgPhoto_1 = new JLabel("");
		lblBgPhoto_1.setBounds(-162, -208, 651, 449);
		panel.add(lblBgPhoto_1);
		
		JPanel dashboardPanel = new JPanel();
		dashboardPanel.setBounds(0, 29, 704, 340);
		frame.getContentPane().add(dashboardPanel);
		dashboardPanel.setLayout(null);
		
		JPanel bookingDetailsPanel = new JPanel();
		bookingDetailsPanel.setBounds(10, 62, 684, 148);
		dashboardPanel.add(bookingDetailsPanel);
		bookingDetailsPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(674, 144, -670, -137);
		bookingDetailsPanel.add(scrollPane);
		
		JButton btnBook = new JButton("Book Slot");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Slot slot = new Slot();
				slot.slotPage();
			}
		});
		btnBook.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		btnBook.setBounds(78, 253, 171, 44);
		dashboardPanel.add(btnBook);
		
		JButton btnCancel = new JButton("Cancel Booking");
		btnCancel.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		btnCancel.setBounds(480, 253, 171, 44);
		dashboardPanel.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("Reservation Status:");
		lblNewLabel.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 37, 119, 14);
		dashboardPanel.add(lblNewLabel);
		
		JLabel lblBgPhoto = new JLabel("");
		lblBgPhoto.setBounds(242, -38, 651, 449);
		dashboardPanel.add(lblBgPhoto);
		lblBgPhoto.setIcon(new ImageIcon(UserProfile.class.getResource("/resources/Asset 1.png")));
	}
}
