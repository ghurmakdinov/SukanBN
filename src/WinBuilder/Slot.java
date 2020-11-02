package WinBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;

public class Slot {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void slotPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slot window = new Slot();
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
	public Slot() {
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
		
		JLabel lblClose = new JLabel("X");
		lblClose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.RED);
		lblClose.setBounds(668, 3, 46, 14);
		frame.getContentPane().add(lblClose);
		
		JPanel facilityPanel = new JPanel();
		facilityPanel.setBounds(10, 11, 663, 56);
		frame.getContentPane().add(facilityPanel);
		facilityPanel.setLayout(null);
		
		JLabel lblSelectFacility = new JLabel("Select Facility:");
		lblSelectFacility.setBounds(10, 11, 101, 34);
		lblSelectFacility.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		facilityPanel.add(lblSelectFacility);
		
		JComboBox facilitySelection = new JComboBox();
		facilitySelection.setBackground(Color.LIGHT_GRAY);
		facilitySelection.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		facilitySelection.setBounds(102, 11, 551, 34);
		facilityPanel.add(facilitySelection);
		
		JPanel datePanel = new JPanel();
		datePanel.setBounds(10, 78, 663, 56);
		frame.getContentPane().add(datePanel);
		datePanel.setLayout(null);
		
		JLabel lblSelectDate = new JLabel("Select Date:");
		lblSelectDate.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblSelectDate.setBounds(10, 11, 101, 34);
		datePanel.add(lblSelectDate);
		
		JPanel sessionPanel = new JPanel();
		sessionPanel.setBounds(10, 145, 663, 56);
		frame.getContentPane().add(sessionPanel);
		sessionPanel.setLayout(null);
		
		JLabel lblSelectSession = new JLabel("Select Session:");
		lblSelectSession.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblSelectSession.setBounds(10, 11, 101, 34);
		sessionPanel.add(lblSelectSession);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Morning");
		rdbtnmntmNewRadioItem.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		rdbtnmntmNewRadioItem.setBounds(106, 17, 133, 26);
		sessionPanel.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Afternoon");
		rdbtnmntmNewRadioItem_1.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		rdbtnmntmNewRadioItem_1.setBounds(249, 17, 133, 26);
		sessionPanel.add(rdbtnmntmNewRadioItem_1);
		
		JPanel slotPanel = new JPanel();
		slotPanel.setBounds(10, 212, 663, 56);
		frame.getContentPane().add(slotPanel);
		slotPanel.setLayout(null);
		
		JLabel lblSelectSlot = new JLabel("Select Slot:");
		lblSelectSlot.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 14));
		lblSelectSlot.setBounds(10, 11, 101, 34);
		slotPanel.add(lblSelectSlot);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(105, 11, 548, 34);
		slotPanel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setRowHeaderView(list);
		
		JPanel submitPanel = new JPanel();
		submitPanel.setBounds(10, 279, 663, 90);
		frame.getContentPane().add(submitPanel);
		submitPanel.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("SUNDAY Personal use", Font.PLAIN, 13));
		btnSubmit.setBounds(291, 37, 89, 23);
		submitPanel.add(btnSubmit);
		
		JLabel lblBgPhoto_1 = new JLabel("");
		lblBgPhoto_1.setIcon(new ImageIcon(Slot.class.getResource("/resources/Asset 1.png")));
		lblBgPhoto_1.setBounds(241, -33, 704, 413);
		frame.getContentPane().add(lblBgPhoto_1);
	}
}
