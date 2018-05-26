/**********************************************************************************************
 * PROJECT: WindowAppCalculator
 * 
 * AUTHOR: itshally
 * 
 * CREATE DATE: 5/26/2018
 * 
 * DESCRIPTION: a basic calculator in java language using
 * 		a swing designer to build a window application.
 **********************************************************************************************/

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JButton btnAdd;
	private JButton btnMinus;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn0;
	private JButton btnDec;
	private JButton btnEqual;
	private JButton btnClear;
	
	double numSet1, numSet2, outcome;
	String operator, number;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Standard Calculator");
		frmCalculator.getContentPane().setBackground(new Color(255, 240, 245));
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/img/icon.png")));
		frmCalculator.setBounds(100, 100, 319, 532);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel txtScreen = new JLabel("");
		txtScreen.setForeground(new Color(216, 191, 216));
		txtScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtScreen.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtScreen.setBounds(10, 51, 290, 36);
		frmCalculator.getContentPane().add(txtScreen);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(0, 124, 431, 2);
		frmCalculator.getContentPane().add(separator);
		
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numSet1 = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				operator = "+";
			}
		});
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(255, 182, 193));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnAdd.setBounds(10, 137, 65, 61);
		frmCalculator.getContentPane().add(btnAdd);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnAdd.setBorder(emptyBorder);
		btnAdd.setFocusPainted(false);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numSet1 = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				operator = "-";
			}
		});
		btnMinus.setForeground(Color.WHITE);
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnMinus.setFocusPainted(false);
		btnMinus.setBackground(new Color(255, 182, 193));
		btnMinus.setBounds(85, 137, 65, 61);
		frmCalculator.getContentPane().add(btnMinus);
		btnMinus.setBorder(emptyBorder);
		
		btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numSet1 = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				operator = "/";
			}
		});
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnDivide.setFocusPainted(false);
		btnDivide.setBackground(new Color(255, 182, 193));
		btnDivide.setBounds(160, 137, 65, 61);
		frmCalculator.getContentPane().add(btnDivide);
		btnDivide.setBorder(emptyBorder);
		
		btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numSet1 = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				operator = "*";
			}
		});
		btnMultiply.setForeground(Color.WHITE);
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnMultiply.setFocusPainted(false);
		btnMultiply.setBackground(new Color(255, 182, 193));
		btnMultiply.setBounds(235, 137, 65, 61);
		frmCalculator.getContentPane().add(btnMultiply);
		btnMultiply.setBorder(emptyBorder);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn7.setFocusPainted(false);
		btn7.setBackground(new Color(216, 191, 216));
		btn7.setBounds(10, 209, 65, 61);
		frmCalculator.getContentPane().add(btn7);
		btn7.setBorder(emptyBorder);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);				
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn8.setFocusPainted(false);
		btn8.setBackground(new Color(216, 191, 216));
		btn8.setBounds(85, 209, 65, 61);
		frmCalculator.getContentPane().add(btn8);
		btn8.setBorder(emptyBorder);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number); 		
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn9.setFocusPainted(false);
		btn9.setBackground(new Color(216, 191, 216));
		btn9.setBounds(160, 209, 65, 61);
		frmCalculator.getContentPane().add(btn9);
		btn9.setBorder(emptyBorder);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn6.setFocusPainted(false);
		btn6.setBackground(new Color(216, 191, 216));
		btn6.setBounds(10, 281, 65, 61);
		frmCalculator.getContentPane().add(btn6);
		btn6.setBorder(emptyBorder);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn5.setFocusPainted(false);
		btn5.setBackground(new Color(216, 191, 216));
		btn5.setBounds(85, 281, 65, 61);
		frmCalculator.getContentPane().add(btn5);
		btn5.setBorder(emptyBorder);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn4.setFocusPainted(false);
		btn4.setBackground(new Color(216, 191, 216));
		btn4.setBounds(160, 281, 65, 61);
		frmCalculator.getContentPane().add(btn4);
		btn4.setBorder(emptyBorder);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn3.setFocusPainted(false);
		btn3.setBackground(new Color(216, 191, 216));
		btn3.setBounds(10, 353, 65, 61);
		frmCalculator.getContentPane().add(btn3);
		btn3.setBorder(emptyBorder);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn2.setFocusPainted(false);
		btn2.setBackground(new Color(216, 191, 216));
		btn2.setBounds(85, 353, 65, 61);
		frmCalculator.getContentPane().add(btn2);
		btn2.setBorder(emptyBorder);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn1.setFocusPainted(false);
		btn1.setBackground(new Color(216, 191, 216));
		btn1.setBounds(160, 353, 65, 61);
		frmCalculator.getContentPane().add(btn1);
		btn1.setBorder(emptyBorder);
		
		btn0 = new JButton("0");
		btn0.setMnemonic(KeyEvent.VK_NUMPAD0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gets the action event of the button
				number = txtScreen.getText() + e.getActionCommand();
				//displays the text to the screen
				txtScreen.setText(number);
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn0.setFocusPainted(false);
		btn0.setBackground(new Color(216, 191, 216));
		btn0.setBounds(85, 425, 65, 61);
		frmCalculator.getContentPane().add(btn0);
		btn0.setBorder(emptyBorder);
		
		btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//displays decimal once
				if(!txtScreen.getText().contains(".")) {
					txtScreen.setText(txtScreen.getText() + e.getActionCommand());
				}
			}
		});
		btnDec.setForeground(Color.WHITE);
		btnDec.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnDec.setFocusPainted(false);
		btnDec.setBackground(new Color(255, 182, 193));
		btnDec.setBounds(10, 425, 65, 61);
		frmCalculator.getContentPane().add(btnDec);
		btnDec.setBorder(emptyBorder);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result; 
				numSet2 = Double.parseDouble(txtScreen.getText());
				
				switch(operator) {
				
					case "+":					
							outcome = numSet1 + numSet2;
							result = String.format("%s", outcome);
							txtScreen.setText(result);
						break;
						
					case "-":
						outcome = numSet1 - numSet2;
						result = String.format("%s", outcome);
						txtScreen.setText(result);
						break;
						
					case "/":
						outcome = numSet1 / numSet2;
						result = String.format("%s", outcome);
						txtScreen.setText(result);
						break;
						
					case "*":
						outcome = numSet1 * numSet2;
						result = String.format("%s", outcome);
						txtScreen.setText(result);
						
						break;
						
					 default :
						break;
				} //end of switch 
			}
		});
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnEqual.setFocusPainted(false);
		btnEqual.setBackground(new Color(255, 182, 193));
		btnEqual.setBounds(160, 425, 140, 61);
		frmCalculator.getContentPane().add(btnEqual);
		btnEqual.setBorder(emptyBorder);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clears the display screen
				txtScreen.setText("");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnClear.setFocusPainted(false);
		btnClear.setBackground(new Color(255, 182, 193));
		btnClear.setBounds(235, 209, 65, 61);
		frmCalculator.getContentPane().add(btnClear);
		btnClear.setBorder(emptyBorder);
		
		JButton btnBackspace = new JButton("");
		btnBackspace.setIcon(new ImageIcon(Calculator.class.getResource("/img/backspace-icon.png")));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtScreen.getText().length() > 0) {
					StringBuilder i = new StringBuilder(txtScreen.getText());
					i.deleteCharAt(txtScreen.getText().length() - 1).toString();
					number = i.toString();
					txtScreen.setText(number);
					 
				}
			}
		});
		btnBackspace.setForeground(Color.WHITE);
		btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBackspace.setFocusPainted(false);
		btnBackspace.setBackground(new Color(255, 182, 193));
		btnBackspace.setBounds(235, 281, 65, 133);
		btnBackspace.setBorder(emptyBorder);
		frmCalculator.getContentPane().add(btnBackspace);
	}
}
