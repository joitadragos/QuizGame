import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Finish extends JFrame {

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
					Finish frame = new Finish();
					frame.setVisible(true);
					frame.setTitle("Sfarsit");
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
	public Finish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scorul tau este:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(101, 156, 170, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SFARSIT!!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(165, 30, 164, 62);
		contentPane.add(lblNewLabel_1);
		
		JLabel SpuneCeva = new JLabel("New label");
		if(DifandDom.scor>5) {
			SpuneCeva.setText("FELICITARI");
		}else {
			SpuneCeva.setText("NU E BINE");
		}
		SpuneCeva.setFont(new Font("Tahoma", Font.BOLD, 15));
		SpuneCeva.setHorizontalAlignment(SwingConstants.CENTER);
		SpuneCeva.setBounds(165, 275, 164, 44);
		contentPane.add(SpuneCeva);
		
		JButton TryAgain = new JButton("Mai incearca");
		TryAgain.setForeground(Color.WHITE);
		TryAgain.setBackground(Color.DARK_GRAY);
		TryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Game.nr_intrebare=1;
					Game.id_ras=1;
					DifandDom.scor=0;
					NextQ.nr_intrebari=0;
					DifandDom second= new DifandDom();
					second.setVisible(true);
					second.setTitle("Dificultate si domeniu");
					second.setLocationRelativeTo(null);
				
			        } catch(Exception e){System.out.print(e);}
			}
		});
		
		TryAgain.setFont(new Font("Tahoma", Font.BOLD, 15));
		TryAgain.setBounds(165, 344, 164, 34);
		contentPane.add(TryAgain);
		setVisible(false);
		JLabel JScor = new JLabel("");
		JScor.setText(JScor.getText() +DifandDom.scor);
		JScor.setBounds(269, 156, 60, 50);
		contentPane.add(JScor);
	}
}
