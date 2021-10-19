package ticTacToe;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tictactoe {

	private JFrame frame;
	private JButton tac1_Btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe window = new Tictactoe();
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
	public Tictactoe() {
		initialize();
	}
	
	ImageIcon tictacX = new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/Xs.png"));
	ImageIcon tictacO = new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/Os.png"));
	ImageIcon tictacBlank = new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png"));
	boolean button1, button2, button3, button4, button5, button6, button7, button8, button9 = false ;
	int turn = 0;
	//UIManager.put("Button.disabledText", new ColorUIResource(Color.BLUE)); 
	//ImageIcon tictacX = new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/X.png").getImage().getScaledInstance(20, 20, 0));
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tac1_Btn = new JButton("");
		tac1_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button1 == false)){
					tac1_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button1 == false)){
					tac1_Btn.setIcon(tictacO);
					turn++;
				}
				button1 = true;
				checkXWin();
				
			}
		});
		tac1_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac1_Btn.setBounds(10, 11, 125, 125);
		frame.getContentPane().add(tac1_Btn);
		
		JButton tac2_Btn = new JButton("");
		tac2_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button2 == false)){
					tac2_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button2 == false)){
					tac2_Btn.setIcon(tictacO);
					turn++;
				}
				button2 = true;
				
			}
		});
		tac2_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac2_Btn.setBounds(145, 11, 125, 125);
		frame.getContentPane().add(tac2_Btn);
		
		JButton tac3_Btn = new JButton("");
		tac3_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button3 == false)){
					tac3_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button3 == false)){
					tac3_Btn.setIcon(tictacO);
					turn++;
				}
				button3 = true;
			}
		});
		tac3_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac3_Btn.setBounds(280, 11, 125, 125);
		frame.getContentPane().add(tac3_Btn);
		
		JButton tac4_Btn = new JButton("");
		tac4_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button4 == false)){
					tac4_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button4 == false)){
					tac4_Btn.setIcon(tictacO);
					turn++;
				}
				button4 = true;
			}
		});
		tac4_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac4_Btn.setBounds(10, 147, 125, 125);
		frame.getContentPane().add(tac4_Btn);
		
		JButton tac5_Btn = new JButton("");
		tac5_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button5 == false)){
					tac5_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button5 == false)){
					tac5_Btn.setIcon(tictacO);
					turn++;
				}
				button5 = true;
			}
		});
		tac5_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac5_Btn.setBounds(145, 147, 125, 125);
		frame.getContentPane().add(tac5_Btn);
		
		JButton tac6_Btn = new JButton("");
		tac6_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button6 == false)){
					tac6_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button6 == false)){
					tac6_Btn.setIcon(tictacO);
					turn++;
				}
				button6 = true;
			}
		});
		tac6_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac6_Btn.setBounds(280, 147, 125, 125);
		frame.getContentPane().add(tac6_Btn);
		
		JButton tac7_Btn = new JButton("");
		tac7_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button7 == false)){
					tac7_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button7 == false)){
					tac7_Btn.setIcon(tictacO);
					turn++;
				}
				button7 = true;
			}
		});
		tac7_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac7_Btn.setBounds(10, 283, 125, 125);
		frame.getContentPane().add(tac7_Btn);
		
		JButton tac8_Btn = new JButton("");
		tac8_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button8 == false)){
					tac8_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button8 == false)){
					tac8_Btn.setIcon(tictacO);
					turn++;
				}
				button8 = true;
			}
		});
		tac8_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac8_Btn.setBounds(145, 283, 125, 125);
		frame.getContentPane().add(tac8_Btn);
		
		JButton tac9_Btn = new JButton("");
		tac9_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button9 == false)){
					tac9_Btn.setIcon(tictacX);
					turn++;
				}else if ((turn % 2 == 1)&&(button9 == false)){
					tac9_Btn.setIcon(tictacO);
					turn++;
				}
				button9 = true;
			}
		});
		tac9_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac9_Btn.setBounds(280, 283, 125, 125);
		frame.getContentPane().add(tac9_Btn);
	}
	
	public void setXorO()
	{
		for (int i = 0; i < 9; i++ )
		{
			
		}
	}
	public void checkXWin()
	{
		String Icon1=tac1_Btn.getIcon().toString();
		String Iconx = "file:/C:/Users/Ryan/Desktop/Github%20Projects/JavaProjects/GithubProjects/bin/ticTacToe/Resources/Xs.png";
		System.out.println("Check" + Icon1);
		if (Icon1 == Iconx)
		{
			System.out.println("ture");
		}
		//String Icon2=Button2.getIcon().toString();

		//if(Icon1.equals(Icon2)){
		   //System.out.println("Yes");
		
	}
}
