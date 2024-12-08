package snippet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Id extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Field;
	double number1=0,number2=0,result=0 ;
	char Operator;
	char op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Id frame = new Id();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Id() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = Field.getText();
				Field.setText(currentText+num1.getText());
				
			}
		});
		num1.setBounds(95, 55, 60, 40);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = Field.getText();
				Field.setText(currentText+num2.getText());
			}
		});
		num2.setBounds(154, 55, 60, 40);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = Field.getText();
				Field.setText(currentText+num3.getText());
			}
		});
		num3.setBounds(213, 55, 60, 40);
		contentPane.add(num3);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+num4.getText());
			}
		});
		num4.setBounds(95, 93, 60, 40);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+num5.getText());
			}
		});
		num5.setBounds(154, 93, 60, 40);
		contentPane.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+num6.getText());
			}
		});
		num6.setBounds(213, 93, 60, 40);
		contentPane.add(num6);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+num7.getText());
			}
		});
		num7.setBounds(95, 131, 60, 40);
		contentPane.add(num7);
		
		JButton num8 = new JButton("8");
		num8.setForeground(new Color(0, 0, 0));
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+num8.getText());
			}
		});
		num8.setBounds(154, 131, 60, 40);
		contentPane.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+num9.getText());
			}
		});
		num9.setBounds(213, 131, 60, 40);
		contentPane.add(num9);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(Field.getText());
				Operator='+';
				Field.setText(" ");
				
				
			}
		});
		add.setBounds(271, 55, 60, 40);
		contentPane.add(add);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(Field.getText());
				Operator='-';
				Field.setText(" ");
			}
		});
		sub.setBounds(271, 93, 60, 40);
		contentPane.add(sub);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				Field.setText(currentText+dot.getText());
			}
		});
		dot.setBounds(271, 131, 60, 40);
		contentPane.add(dot);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(Field.getText());
				Operator='*';
				Field.setText(" ");
			}
		});
		mul.setBounds(95, 169, 60, 40);
		contentPane.add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(Field.getText());
				Operator='/';
				Field.setText(" ");
			}
		});
		div.setBounds(154, 169, 60, 40);
		contentPane.add(div);
		
		JButton square = new JButton("<html>x<sup>2</sup></html>");
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(Field.getText());
				result=(Math.pow(number1,2));
				Field.setText((String.valueOf(result)));
				
			}
		});
		square.setBounds(213, 169, 60, 40);
		contentPane.add(square);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2=Double.parseDouble(Field.getText());
				switch(Operator) {
				case '+':
					result=number1+number2;
					break;
				case '-':
					result=number1-number2;
					break;
				case '*':
					result=number1*number2;
					break;
				case '/':
					result=number1/number2;
					break;
				}
				Field.setText(String.valueOf(result));
				number1=result;
				
			}
		});
		equal.setBounds(271, 169, 60, 40);
		contentPane.add(equal);
		
		Field = new JTextField();
		Field.setBounds(95, 26, 236, 29);
		contentPane.add(Field);
		Field.setColumns(10);
		
		JButton reset = new JButton("C");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Field.setText(" ");
			}
		});
		reset.setBounds(25, 93, 60, 40);
		contentPane.add(reset);
		
		JButton negative = new JButton("Neg");
		negative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=Field.getText();
				op='-';
				Field.setText(op+currentText);
			}
		});
		negative.setBounds(341, 93, 60, 40);
		contentPane.add(negative);
	}
}
