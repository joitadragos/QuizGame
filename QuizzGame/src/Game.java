import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;


public  class Game extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con=DBConnect.DB();
	ResultSet result;
	PreparedStatement statement;
	private JPanel contentPane;
	private JTextField J_Intrebare;
	private JTextField JRaspA;
	private JTextField JRaspB;
	private JTextField JRaspC;
	private JTextField JRaspD;
	public static int nr_intrebare=1;
	public static int id_ras=1;
	public static int nr_intrebari=1;
	public static int corect,ok=0;
	public static int idraspunsA;
	public static int idraspunsB;
	public static int idraspunsC;
	public static int idraspunsD;
	private JTextField textField;
	private JLabel Answlbl;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
					frame.setTitle("Intrebare");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Game () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Answer_Button = new JButton("Raspuns");
		Answer_Button.setForeground(Color.WHITE);
		Answer_Button.setBackground(Color.DARK_GRAY);
		Answer_Button.setFont(new Font("Tahoma", Font.BOLD, 13));
		Answer_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(nr_intrebari==1) {
					setVisible(false);
					NextQ second= new NextQ(); //Treci la urmatorul JAR
				     second.setVisible(true);		    
				     second.setTitle("Vrei sa mergi mai departe?");
					 second.setLocationRelativeTo(null);
				     
				   
				}
				 
			}
		});
		
		Answer_Button.setBounds(198, 398, 90, 30);
		contentPane.add(Answer_Button);
		
		
		JToggleButton btnA = new JToggleButton("A");
		btnA.setForeground(Color.WHITE);
		btnA.setBackground(Color.DARK_GRAY);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				try{
					
					
					if(idraspunsA==corect && ok==0) {
						DifandDom.scor++;
						ok=1;
					}
					if(idraspunsA!=corect && ok==1) {
						DifandDom.mult+=9;
						if(DifandDom.mult>10) {
							JOptionPane.showMessageDialog(null, "Poti selecta un singur raspuns");
							DifandDom.scor--;
							
						}
						
					}
					
			        } catch(Exception e){System.out.print(e);}
			}
		});

		btnA.setBounds(31, 170, 125, 30);
		contentPane.add(btnA);
		
		
		
		
		JToggleButton btnB = new JToggleButton("B");
		btnB.setForeground(Color.WHITE);
		btnB.setBackground(Color.DARK_GRAY);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				try{
					if(idraspunsB==corect && ok==0 ) {
						DifandDom.scor++;
						ok=1;
					}
					if(idraspunsB!=corect && ok==1) {
						DifandDom.mult+=9;
						if(DifandDom.mult>10) {
							JOptionPane.showMessageDialog(null, "Poti selecta un singur raspuns");
							DifandDom.scor--;
							
						}
						
					}
			        } catch(Exception e){System.out.print(e);}
			}
		});
		btnB.setBounds(31, 220, 125, 30);
		contentPane.add(btnB);
		
		JToggleButton btnC = new JToggleButton("C");
		btnC.setForeground(Color.WHITE);
		btnC.setBackground(Color.DARK_GRAY);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(idraspunsC==corect && ok==0) {
						DifandDom.scor++;
						ok=1;
					}
					if(idraspunsC!=corect && ok==1) {
						DifandDom.mult+=9;
						if(DifandDom.mult>10) {
							JOptionPane.showMessageDialog(null, "Poti selecta un singur raspuns");
							DifandDom.scor--;
							
						}
						
					}
			        } catch(Exception e){System.out.print(e);}
			}
		});
		btnC.setBounds(31, 270, 125, 30);
		contentPane.add(btnC);
		
		JToggleButton btnD = new JToggleButton("D");
		btnD.setBackground(Color.DARK_GRAY);
		btnD.setForeground(Color.WHITE);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(idraspunsD==corect && ok==0) {
						DifandDom.scor++;
						ok=1;
					}
					if(idraspunsD!=corect && ok==1) {
						DifandDom.mult+=9;
						if(DifandDom.mult>10) {
							JOptionPane.showMessageDialog(null, "Poti selecta un singur raspuns");
							DifandDom.scor--;
							
						}
						
					}
			        } catch(Exception e){System.out.print(e);}
			}
		});
		btnD.setBounds(31, 320, 125, 30);
		contentPane.add(btnD);
		
		
		J_Intrebare = new JTextField();
		J_Intrebare.setForeground(Color.WHITE);
		J_Intrebare.setFont(new Font("Tahoma", Font.BOLD, 13));
		J_Intrebare.setBackground(Color.DARK_GRAY);
		J_Intrebare.setText("intrebare loc");
	
			 String sql="Select * from intrebari where categorie='"+DifandDom.domeniu+"'and dificultate='"+DifandDom.dificultate+"'and intrebare_id='"+nr_intrebare+"'";
			
			 try {
				 statement=con.prepareStatement(sql);
				 result=statement.executeQuery(sql);
				 if(result.next()) {
					 J_Intrebare.setText(result.getString(2));
					 result.close();
					 statement.close();
				 }
			 }catch(Exception e){
				 JOptionPane.showMessageDialog(null,e);
			 }
	
		J_Intrebare.setEditable(false);
		J_Intrebare.setBounds(31, 68, 513, 50);
		contentPane.add(J_Intrebare);
		J_Intrebare.setColumns(10);
		
		JRaspA = new JTextField();
		JRaspA.setFont(new Font("Tahoma", Font.BOLD, 12));
		JRaspA.setForeground(Color.BLACK);
		JRaspA.setBackground(Color.WHITE);
		 String sql1="Select * from raspunsuri where QFK='"+nr_intrebare+"' and raspuns_id='"+id_ras+"'";
			idraspunsA=id_ras;
		 try {
			 statement=con.prepareStatement(sql1);
			 result=statement.executeQuery(sql1);
			 if(result.next()) {
				 JRaspA.setText(result.getString(2));
				 result.close();
				 statement.close();
			 }
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null,e);
		 }
		 
		
		 id_ras++;
		JRaspA.setEditable(false);
		JRaspA.setBounds(162, 170, 382, 30);
		contentPane.add(JRaspA);
		JRaspA.setColumns(10);
		
		JRaspB = new JTextField();
		JRaspB.setForeground(Color.BLACK);
		JRaspB.setBackground(Color.WHITE);
		JRaspB.setFont(new Font("Tahoma", Font.BOLD, 12));
		String sql2="Select * from raspunsuri where QFK='"+nr_intrebare+"' and raspuns_id='"+id_ras+"'";
		idraspunsB=id_ras;
		 try {
			 statement=con.prepareStatement(sql2);
			 result=statement.executeQuery(sql2);
			 if(result.next()) {
				 JRaspB.setText(result.getString(2));
				 result.close();
				 statement.close();
			 }
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null,e);
		 }
		 
		 id_ras++;
		JRaspB.setEditable(false);
		JRaspB.setColumns(10);
		JRaspB.setBounds(162, 220, 382, 30);
		contentPane.add(JRaspB);
		
		JRaspC = new JTextField();
		JRaspC.setForeground(Color.BLACK);
		JRaspC.setBackground(Color.WHITE);
		JRaspC.setFont(new Font("Tahoma", Font.BOLD, 12));
		String sql3="Select * from raspunsuri where QFK='"+nr_intrebare+"' and raspuns_id='"+id_ras+"'";
		idraspunsC=id_ras;
		 try {
			 statement=con.prepareStatement(sql3);
			 result=statement.executeQuery(sql3);
			 if(result.next()) {
				 JRaspC.setText(result.getString(2));
				 result.close();
				 statement.close();
			 }
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null,e);
		 }
		 
		 id_ras++;
		
		JRaspC.setEditable(false);
		JRaspC.setColumns(10);
		JRaspC.setBounds(162, 270, 382, 30);
		contentPane.add(JRaspC);
		
		JRaspD = new JTextField();
		JRaspD.setForeground(Color.BLACK);
		JRaspD.setFont(new Font("Tahoma", Font.BOLD, 12));
		JRaspD.setBackground(Color.WHITE);
		String sql4="Select * from raspunsuri where QFK='"+nr_intrebare+"' and raspuns_id='"+id_ras+"'";
		
		 try {
			 statement=con.prepareStatement(sql4);
			 result=statement.executeQuery(sql4);
			 if(result.next()) {
				 JRaspD.setText(result.getString(2));
				 result.close();
				 statement.close();
			 }
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null,e);
		 }
		 idraspunsD=id_ras;
		JRaspD.setEditable(false);
		JRaspD.setColumns(10);
		JRaspD.setBounds(162, 320, 382, 30);
		contentPane.add(JRaspD);
		
		textField = new JTextField();
		String sql5="Select raspuns_id from raspunsuri where QFK='"+nr_intrebare+"' and corect='1'";
		
		 try {
			 statement=con.prepareStatement(sql5);
			 result=statement.executeQuery(sql5);
			 if(result.next()) {
				 corect=result.getInt(1);
				 result.close();
				 statement.close();
			 }
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null,e);
		 }
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(506, 438, 1, 1);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String url="imagini/answer.png";
		ImageIcon icone=new ImageIcon(url);
		Answlbl = new JLabel(icone,JLabel.CENTER);
		Answlbl.setBounds(153, 398, 46, 30);
		contentPane.add(Answlbl);
		
		
	}
}
