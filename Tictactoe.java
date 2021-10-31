package ticTacToe;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tictactoe {

	private JFrame frame;
	private JButton tac1_Btn;
	private JButton tac2_Btn;
	private JButton tac3_Btn;
	private JButton tac4_Btn;
	private JButton tac5_Btn;
	private JButton tac6_Btn;
	private JButton tac7_Btn;
	private JButton tac8_Btn;
	private JButton tac9_Btn;

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
	boolean x1, x2, x3, x4, x5, x6, x7, x8, x9 = false;
	boolean o1, o2, o3, o4, o5, o6, o7, o8, o9 = false;
	int turn = 0;
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 430, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tac1_Btn = new JButton("");
		tac1_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button1 == false)){
					tac1_Btn.setIcon(tictacX);
					x1 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button1 == false)){
					tac1_Btn.setIcon(tictacO);
					o1 = true;
					turn++;
				}
				button1 = true;
				checkXorOWin();
				
			}
		});
		tac1_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac1_Btn.setBounds(10, 11, 125, 125);
		frame.getContentPane().add(tac1_Btn);
		
		tac2_Btn = new JButton("");
		tac2_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button2 == false)){
					tac2_Btn.setIcon(tictacX);
					x2 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button2 == false)){
					tac2_Btn.setIcon(tictacO);
					o2 = true;
					turn++;
				}
				button2 = true;
				checkXorOWin();
				
			}
		});
		tac2_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac2_Btn.setBounds(145, 11, 125, 125);
		frame.getContentPane().add(tac2_Btn);
		
	    tac3_Btn = new JButton("");
		tac3_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button3 == false)){
					tac3_Btn.setIcon(tictacX);
					x3 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button3 == false)){
					tac3_Btn.setIcon(tictacO);
					o3 = true;
					turn++;
				}
				button3 = true;
				checkXorOWin();
			}
		});
		tac3_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac3_Btn.setBounds(280, 11, 125, 125);
		frame.getContentPane().add(tac3_Btn);
		
		tac4_Btn = new JButton("");
		tac4_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button4 == false)){
					tac4_Btn.setIcon(tictacX);
					x4 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button4 == false)){
					tac4_Btn.setIcon(tictacO);
					o4 = true;
					turn++;
				}
				button4 = true;
				checkXorOWin();
			}
		});
		tac4_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac4_Btn.setBounds(10, 147, 125, 125);
		frame.getContentPane().add(tac4_Btn);
		
		tac5_Btn = new JButton("");
		tac5_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button5 == false)){
					tac5_Btn.setIcon(tictacX);
					x5 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button5 == false)){
					tac5_Btn.setIcon(tictacO);
					o5 = true;
					turn++;
				}
				button5 = true;
				checkXorOWin();
			}
		});
		tac5_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac5_Btn.setBounds(145, 147, 125, 125);
		frame.getContentPane().add(tac5_Btn);
		
		tac6_Btn = new JButton("");
		tac6_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button6 == false)){
					tac6_Btn.setIcon(tictacX);
					x6 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button6 == false)){
					tac6_Btn.setIcon(tictacO);
					o6 = true;
					turn++;
				}
				button6 = true;
				checkXorOWin();
			}
		});
		tac6_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac6_Btn.setBounds(280, 147, 125, 125);
		frame.getContentPane().add(tac6_Btn);
		
		tac7_Btn = new JButton("");
		tac7_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button7 == false)){
					tac7_Btn.setIcon(tictacX);
					x7 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button7 == false)){
					tac7_Btn.setIcon(tictacO);
					o7 = true;
					turn++;
				}
				button7 = true;
				checkXorOWin();
			}
		});
		tac7_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac7_Btn.setBounds(10, 283, 125, 125);
		frame.getContentPane().add(tac7_Btn);
		
		tac8_Btn = new JButton("");
		tac8_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button8 == false)){
					tac8_Btn.setIcon(tictacX);
					x8 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button8 == false)){
					tac8_Btn.setIcon(tictacO);
					o8 = true;
					turn++;
				}
				button8 = true;
				checkXorOWin();
			}
		});
		tac8_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac8_Btn.setBounds(145, 283, 125, 125);
		frame.getContentPane().add(tac8_Btn);
		
		tac9_Btn = new JButton("");
		tac9_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((turn % 2 == 0)&&(button9 == false)){
					tac9_Btn.setIcon(tictacX);
					x9 = true;
					turn++;
				}else if ((turn % 2 == 1)&&(button9 == false)){
					tac9_Btn.setIcon(tictacO);
					o9 = true;
					turn++;
				}
				button9 = true;
				checkXorOWin();
			}
		});
		tac9_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac9_Btn.setBounds(280, 283, 125, 125);
		frame.getContentPane().add(tac9_Btn);
		
		JButton playAgain = new JButton("Play Again?");
		playAgain.setBackground(Color.BLACK);
		playAgain.setForeground(Color.WHITE);
		playAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetGame();
			}
		});
		playAgain.setBounds(145, 424, 125, 23);
		frame.getContentPane().add(playAgain);
	}
	
	public void checkXorOWin()
	{
		if ( ((x1 == true)&&(x2 == true)&&(x3 == true)) || ((x1 == true)&&(x4 == true)&&(x7 == true)) || ((x1 == true)&&(x5 == true)&&(x9 == true)) ||
				((x3 == true)&&(x5 == true)&&(x7 == true)) || ((x3 == true)&&(x6 == true)&&(x9 == true)) || ((x7 == true)&&(x8 == true)&&(x9 == true))||
				((x2 == true)&&(x5 == true)&&(x8 == true)) || ((x4 == true)&&(x5 == true)&&(x6 == true)) ) {
			JOptionPane.showMessageDialog(frame,"X Wins!");
			int a = JOptionPane.showConfirmDialog(frame, "Would you like to play Again?", "X Wins!", JOptionPane.YES_NO_OPTION);
			if(a==JOptionPane.YES_OPTION){  
				resetGame(); 
			}else if(a == JOptionPane.NO_OPTION) {
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				System.exit(0);
			}
		}else if ( ((o1 == true)&&(o2 == true)&&(o3 == true)) || ((o1 == true)&&(o4 == true)&&(o7 == true)) || ((o1 == true)&&(o5 == true)&&(o9 == true)) ||
				((o3 == true)&&(o5 == true)&&(o7 == true)) || ((o3 == true)&&(o6 == true)&&(o9 == true)) || ((o7 == true)&&(o8 == true)&&(o9 == true)) ||
				((o2 == true)&&(o5 == true)&&(o8 == true)) || ((o4 == true)&&(o5 == true)&&(o6 == true))) {
			JOptionPane.showMessageDialog(frame,"O Wins!");
			int a = JOptionPane.showConfirmDialog(frame, "Would you like to play Again?", "O Wins!", JOptionPane.YES_NO_OPTION);
			if(a==JOptionPane.YES_OPTION){  
				resetGame(); 
			}else if(a == JOptionPane.NO_OPTION) {
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				System.exit(0);
			}
		}else if (turn == 9){
			JOptionPane.showMessageDialog(frame,"Draw!");
			int a = JOptionPane.showConfirmDialog(frame, "Would you like to play Again?", "Draw", JOptionPane.YES_NO_OPTION);
			if(a==JOptionPane.YES_OPTION){  
				resetGame(); 
			}else if(a == JOptionPane.NO_OPTION) {
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				System.exit(0);
			}
		}
	}
	
	public void resetGame(){
		button1 = false; button2 = false; button3 = false; button4 = false; button5 = false; button6 = false; button7 = false; button8 = false; button9 = false;
		x1 = false; x2 = false; x3 = false; x4 = false; x5 = false; x6 = false; x7 = false; x8 = false; x9 = false;
		o1 = false; o2 = false; o3 = false; o4 = false; o5 = false; o6 = false; o7 = false; o8 = false; o9 = false;
		turn = 0;
		tac1_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac2_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac3_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac4_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac5_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac6_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac7_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac8_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
		tac9_Btn.setIcon(new ImageIcon(Tictactoe.class.getResource("/ticTacToe/Resources/BLANK.png")));
	}
}
