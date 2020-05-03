package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class Calculator {

	private JFrame frmMaheshsCalculator;
	private JTextField textField;
	double firstnumber;
	double secondnumber;
	double thirdnumber;
	double fourthnumber;
	String operations;
	String answer;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmMaheshsCalculator.setVisible(true);
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
		frmMaheshsCalculator = new JFrame();
		frmMaheshsCalculator.setBackground(Color.GRAY);
		frmMaheshsCalculator.setTitle("Mahesh's Calculator");
		frmMaheshsCalculator.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmMaheshsCalculator.getContentPane().setBackground(Color.WHITE);
		frmMaheshsCalculator.setBounds(14, -31, 259, 350);
		frmMaheshsCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaheshsCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 227, 41);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frmMaheshsCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 108, 57, 50);
		btn7.setHorizontalAlignment(SwingConstants.LEFT);
		btn7.setToolTipText("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(69, 108, 57, 50);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(125, 108, 57, 50);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(180, 108, 57, 50);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "-";
			}
		});
		btnSub.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 158, 57, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(69, 158, 57, 50);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(125, 158, 57, 50);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.setBounds(180, 158, 57, 50);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "*";
			}
		});
		btnMul.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnMul);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 205, 57, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(69, 205, 57, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(125, 205, 57, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(180, 205, 57, 50);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "/";
			}
		});
		btnDiv.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 255, 57, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(69, 255, 57, 50);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btnDot.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(180, 255, 57, 50);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				secondnumber = Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = firstnumber + secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operations == "-")
				{
					result = firstnumber - secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operations == "*")
				{
					result = firstnumber * secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operations == "/")
				{
					result = firstnumber / secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operations == "%")
				{
					result = firstnumber % secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnEqual);
		
		JButton btnPM = new JButton("+-");
		btnPM.setBounds(125, 255, 57, 50);
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops =Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnPM);
		
		JButton btnBackspace = new JButton("<-");
		btnBackspace.setBounds(10, 58, 60, 50);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace=strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnBackspace);
		
		JButton btnClose = new JButton("c");
		btnClose.setBounds(69, 58, 57, 50);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClose.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnClose);
		
		JButton btnMD = new JButton("%");
		btnMD.setBounds(125, 58, 57, 50);
		btnMD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "%";
			}
		});
		btnMD.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnMD);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(180, 58, 57, 50);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "+";
			}
		});
		btnPlus.setFont(new Font("Verdana", Font.BOLD, 18));
		frmMaheshsCalculator.getContentPane().add(btnPlus);
	}
}
