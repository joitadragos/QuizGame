import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Start extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
					frame.setTitle("Start");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplicatie Teste Grila");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 534, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Regulile sunt urmatoarele:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 68, 256, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1. Pentru fiecare intrebare avem o singura varianta de raspuns");
		lblNewLabel_2.setBounds(10, 114, 534, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2.Pentru a putea juca trebuie sa ai un cont, poti creea unul");
		lblNewLabel_3.setBounds(10, 156, 534, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3.Orice incercare de a trisa este pedepsita");
		lblNewLabel_4.setBounds(10, 197, 534, 30);
		contentPane.add(lblNewLabel_4);
		
		JButton JStart = new JButton("START");
		JStart.setForeground(Color.WHITE);
		JStart.setBackground(Color.DARK_GRAY);
		JStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login second= new Login();
				second.setVisible(true);
				second.setTitle("Pagina Login");
				second.setLocationRelativeTo(null);
				
			}
		});
		JStart.setFont(new Font("Elephant", Font.BOLD, 15));
		JStart.setBounds(198, 267, 135, 56);
		contentPane.add(JStart);
		String url="imagini/punch.png";
		ImageIcon icone=new ImageIcon(url);
		JLabel brofist = new JLabel(icone,JLabel.CENTER);
		brofist.setBounds(133, 269, 64, 56);
		contentPane.add(brofist);
	}
}
