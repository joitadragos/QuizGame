import java.sql.*;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Username;

	/*public static int scor=0;
	protected static int mult=10;*/
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setTitle("Pagina de Login");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(UIManager.getColor("Button.highlight"));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(62, 28, 80, 40);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(62, 100, 80, 40);
		contentPane.add(lblPassword);
		
		Username = new JTextField();
		Username.setBounds(169, 30, 200, 40);
		contentPane.add(Username);
		Username.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(169, 100, 200, 40);
		contentPane.add(Password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgame", "root" ,"");
					Statement stmt = con.createStatement();
					@SuppressWarnings("deprecation")
					String sql = "Select * from quizgame where UserName ='"+Username.getText()+"' and Password='"+Password.getText().toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					
					if (rs.next ()) {
						 setVisible(false);
					     DifandDom second= new DifandDom(); //Treci la urmatorul JAR
					     second.setVisible(true);
					     second.setTitle("Alege Dificultate si Domeniu");
						 second.setLocationRelativeTo(null);
					     
					}
					
					else
						JOptionPane.showMessageDialog(null , "Username sau parola gresite");
					con.close();
						
				}catch(Exception e ) {System.out.print(e);}
			}
			
		});
		
		btnLogin.setBounds(90, 170, 160, 30);
		contentPane.add(btnLogin);
		
		JButton btnCreateNewAccount = new JButton("Creeaza un cont");
		btnCreateNewAccount.setForeground(Color.WHITE);
		btnCreateNewAccount.setBackground(Color.DARK_GRAY);
		btnCreateNewAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCreateNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Create second= new Create();
				second.setVisible(true);
				second.setTitle("Creeaza cont");
				second.setLocationRelativeTo(null);
			}
		});
		
		btnCreateNewAccount.setBounds(90, 220, 160, 30);
		contentPane.add(btnCreateNewAccount);
		String url="imagini/username.png";
		ImageIcon icone=new ImageIcon(url);
		JLabel UserLbl = new JLabel(icone,JLabel.CENTER);
		UserLbl.setBounds(10, 30, 42, 40);
		contentPane.add(UserLbl);
		String url1="imagini/password.png";
		ImageIcon icone1=new ImageIcon(url1);
		JLabel PwdLbl = new JLabel(icone1,JLabel.CENTER);
		PwdLbl.setBounds(10, 100, 42, 40);
		contentPane.add(PwdLbl);
		String url2="imagini/login.png";
		ImageIcon icone2=new ImageIcon(url2);
		JLabel LoginImg = new JLabel(icone2,JLabel.CENTER);
		LoginImg.setBounds(24, 170, 42, 30);
		contentPane.add(LoginImg);
		String url3="imagini/create.png";
		ImageIcon icone3=new ImageIcon(url3);
		JLabel CreateImg = new JLabel(icone3,JLabel.CENTER);
		CreateImg.setBounds(27, 220, 42, 30);
		contentPane.add(CreateImg);
			
		
	}
	
	
	
}
