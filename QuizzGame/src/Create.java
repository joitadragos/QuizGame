import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Create extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Username;
	private JTextField Password;
	private JTextField NumePrenume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create frame = new Create();
					frame.setVisible(true);
					frame.setTitle("Creeaza cont");
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
	public Create() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduUsername = new JLabel("Introdu username");
		lblIntroduUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntroduUsername.setBounds(20, 40, 135, 30);
		contentPane.add(lblIntroduUsername);
		
		Username = new JTextField();
		Username.setBounds(165, 40, 160, 30);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JLabel lblIntroduParola = new JLabel("Introdu parola");
		lblIntroduParola.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntroduParola.setBounds(20, 90, 135, 30);
		contentPane.add(lblIntroduParola);
		
		Password = new JTextField();
		Password.setBounds(165, 90, 160, 30);
		contentPane.add(Password);
		Password.setColumns(10);
		
		JLabel lblNumePrenume = new JLabel("Nume & Prenume");
		lblNumePrenume.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumePrenume.setBounds(20, 140, 135, 30);
		contentPane.add(lblNumePrenume);
		
		NumePrenume = new JTextField();
		NumePrenume.setBounds(165, 140, 160, 30);
		contentPane.add(NumePrenume);
		NumePrenume.setColumns(10);
		
		JButton btnCreeazaCont = new JButton("Creeaza cont");
		btnCreeazaCont.setForeground(Color.WHITE);
		btnCreeazaCont.setBackground(Color.DARK_GRAY);
		btnCreeazaCont.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCreeazaCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgame", "root" ,"");
			            PreparedStatement posted = con.prepareStatement("INSERT INTO quizgame (username, password,nume) VALUES ('"+Username.getText()+"', '"+Password.getText()+"','"+NumePrenume.getText()+"')");
			           
			            posted.executeUpdate();
			            JOptionPane.showMessageDialog(null , "Cont creat");
			            setVisible(false);
			            Login second1= new Login();
						second1.setVisible(true);
						second1.setTitle("Pagina Login");
						second1.setLocationRelativeTo(null);
			            
			        } catch(Exception e){System.out.print(e);}
			}
		});
		btnCreeazaCont.setBounds(82, 209, 135, 30);
		contentPane.add(btnCreeazaCont);
	}
}
