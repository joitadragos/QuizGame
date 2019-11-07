import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.Color;


public class DifandDom extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static  String domeniu=null;
	public static int dificultate;
	private JPanel contentPane;
	public static int scor=0;
	protected static int mult=10;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DifandDom frame = new DifandDom();
					frame.setVisible(true);
					frame.setTitle("Dificultate si Domeniu");
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
	
	public DifandDom() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Domeniu = new JLabel("Alege domeniul:");
		Domeniu.setFont(new Font("Tahoma", Font.BOLD, 15));
		Domeniu.setBounds(21, 61, 130, 50);
		contentPane.add(Domeniu);
		
		JLabel Dificultate = new JLabel("Alege Dificultatea");
		Dificultate.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dificultate.setBounds(21, 278, 130, 50);
		contentPane.add(Dificultate);
		
		JToggleButton GeografieButton = new JToggleButton("Geografie");
		GeografieButton.setForeground(Color.WHITE);
		GeografieButton.setBackground(Color.DARK_GRAY);
		GeografieButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		GeografieButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				domeniu="Geografie";
			}
		});
		
		GeografieButton.setBounds(210, 30, 125, 30);
		contentPane.add(GeografieButton);
		
		JToggleButton FilmButton = new JToggleButton("Film");
		FilmButton.setForeground(Color.WHITE);
		FilmButton.setBackground(Color.DARK_GRAY);
		FilmButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		FilmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				domeniu="Film";
			}
		});
		FilmButton.setBounds(210, 75, 125, 30);
		contentPane.add(FilmButton);
		
		JToggleButton SportButton = new JToggleButton("Sport");
		SportButton.setForeground(Color.WHITE);
		SportButton.setBackground(Color.DARK_GRAY);
		SportButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		SportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				domeniu="Sport";
			}
		});
		SportButton.setBounds(210, 121, 125, 30);
		contentPane.add(SportButton);
		
		JToggleButton Dif1Button = new JToggleButton("1");
		Dif1Button.setForeground(Color.WHITE);
		Dif1Button.setBackground(Color.DARK_GRAY);
		Dif1Button.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dif1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultate=1;
				if(domeniu=="Film") {
				    Game.nr_intrebare+=20;
					Game.id_ras+=80;
				}
				if(domeniu=="Sport") {
					Game.nr_intrebare+=40;
					Game.id_ras+=160;
				}
			}
		});
		Dif1Button.setBounds(210, 280, 125, 30);
		contentPane.add(Dif1Button);
		
		JToggleButton Dif2Button = new JToggleButton("2");
		Dif2Button.setForeground(Color.WHITE);
		Dif2Button.setBackground(Color.DARK_GRAY);
		Dif2Button.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dif2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultate=2;
				if(domeniu=="Geografie") {
					Game.nr_intrebare+=10;
					Game.id_ras+=40;
				}
				if(domeniu=="Film") {
					Game.nr_intrebare+=30;
					Game.id_ras+=120;
				}
				if(domeniu=="Sport") {
					Game.nr_intrebare+=50;
					Game.id_ras+=200;
				}
				
			}
		});
		Dif2Button.setBounds(210, 330, 125, 30);
		contentPane.add(Dif2Button);
		
		JButton btnContinua = new JButton("Continua");
		btnContinua.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnContinua.setForeground(Color.WHITE);
		btnContinua.setBackground(Color.DARK_GRAY);
		btnContinua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(domeniu!=null) {
					if((dificultate==1)||(dificultate==2)) {
						setVisible(false);
						Game second= new Game(); //Treci la urmatorul JAR
					     second.setVisible(true);
					     second.setTitle("Intrebare");
						 second.setLocationRelativeTo(null);
					}
				}
			}
		});
		btnContinua.setBounds(387, 419, 130, 40);
		contentPane.add(btnContinua);
		String url="imagini/geografie.png";
		ImageIcon icone=new ImageIcon(url);
		JLabel GeoLbl = new JLabel(icone,JLabel.CENTER);
		GeoLbl.setBounds(345, 32, 35, 30);
		contentPane.add(GeoLbl);
		
		String url1="imagini/film.png";
		ImageIcon icone1=new ImageIcon(url1);
		JLabel Filmlbl = new JLabel(icone1,JLabel.CENTER);
		Filmlbl.setBounds(345, 75, 35, 30);
		contentPane.add(Filmlbl);
		String url2="imagini/sport.png";
		ImageIcon icone2=new ImageIcon(url2);
		JLabel SportLbl = new JLabel(icone2,JLabel.CENTER);
		SportLbl.setBounds(345, 121, 35, 30);
		contentPane.add(SportLbl);
	}
}
