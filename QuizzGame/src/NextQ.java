import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class NextQ extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEstiSigurCa;
	public static int nr_intrebari=0;
	private JTextField JPunctaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NextQ frame = new NextQ();
					frame.setVisible(true);
					frame.setTitle("Posibilitate de a continua sau a te opri");
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
	public NextQ() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtEstiSigurCa = new JTextField();
		txtEstiSigurCa.setForeground(Color.BLACK);
		txtEstiSigurCa.setBackground(Color.WHITE);
		txtEstiSigurCa.setEditable(false);
		txtEstiSigurCa.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEstiSigurCa.setText("Esti sigur ca vrei sa mergi mai departe?");
		txtEstiSigurCa.setBounds(116, 221, 300, 55);
		contentPane.add(txtEstiSigurCa);
		txtEstiSigurCa.setColumns(10);
		JButton JNextQ = new JButton("Merg mai departe");
		JNextQ.setForeground(Color.WHITE);
		JNextQ.setBackground(Color.DARK_GRAY);
		JNextQ.setFont(new Font("Tahoma", Font.BOLD, 15));
		JNextQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Game.nr_intrebare++;//cresc id-ul intrebarii
					Game.id_ras++;//cresc id-ul numarului
					Game.ok=0;
					if(nr_intrebari<=10) {
					 setVisible(false);
					 Game second= new Game(); //Treci la urmatorul JAR
				     second.setVisible(true);
				     second.setTitle("Intrebare");
				     second.setLocationRelativeTo(null);
				     nr_intrebari++;
				     DifandDom.mult=1;
				    if(nr_intrebari>=10) {
				    	setVisible(false);
				    	Finish second1= new Finish();
						second1.setVisible(true);
						second1.setTitle("Sfarsit");
						second1.setLocationRelativeTo(null);
				    }
				    
				     }else {
				    	 System.exit(0);
				     } 
			        } catch(Exception e){System.out.print(e);}
			}
		});
		JNextQ.setBounds(134, 309, 267, 55);
		contentPane.add(JNextQ);
		
		JButton JStop = new JButton("Ma opresc aici");
		JStop.setForeground(Color.WHITE);
		JStop.setBackground(Color.DARK_GRAY);
		JStop.setFont(new Font("Tahoma", Font.BOLD, 15));
		JStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Finish second1= new Finish();
					setVisible(false);
					second1.setVisible(true);
					second1.setTitle("Sfarsit");
					second1.setLocationRelativeTo(null);
			        } catch(Exception e){System.out.print(e);}
			}
		});
		JStop.setBounds(134, 401, 267, 55);
		contentPane.add(JStop);
		JLabel lblNewLabel = new JLabel("Scorul tau este de:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 41, 267, 48);
		contentPane.add(lblNewLabel);
		JPunctaj = new JTextField();
		JPunctaj.setEditable(false);
		JPunctaj.setHorizontalAlignment(SwingConstants.CENTER);
		JPunctaj.setText(JPunctaj.getText() +DifandDom.scor);
		JPunctaj.setBounds(214, 110, 86, 55);
		contentPane.add(JPunctaj);
		JPunctaj.setColumns(10);
		String url="imagini/play.png";
		ImageIcon icone=new ImageIcon(url);
		JLabel JLabelImg = new JLabel(icone,JLabel.CENTER);
		JLabelImg.setBounds(79, 309, 50, 55);
		contentPane.add(JLabelImg);
		String url1="imagini/sad.png";
		ImageIcon icone1=new ImageIcon(url1);
		JLabel SadButtom = new JLabel(icone1,JLabel.CENTER);
		SadButtom.setBounds(79, 403, 50, 55);
		contentPane.add(SadButtom);
	}
}
