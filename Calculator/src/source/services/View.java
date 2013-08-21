package source.services;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{
	JPanel panel1;
	JPanel overviewPanel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMal;
	JButton buttonDurch;
	
	JTextField eingabe;
	
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;

	public View(Model model){
		initialize();
		this.setSize(200, 200);;
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
		
	public void initialize(){
			
		this.setLayout(new GridLayout(2, 0));
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 0));	
		eingabe = new JTextField();
		panel1.add(eingabe);
		this.add(panel1);
		
		overviewPanel = new JPanel();
		overviewPanel.setLayout(new GridLayout(1,2));
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 3));
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);
		overviewPanel.add(panel2);
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 3));	
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);

		overviewPanel.add(panel3);
		
		panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1, 3));
		overviewPanel.add(panel4);	
		
		panel5 = new JPanel();
		panel5.setLayout(new GridLayout(1, 3));	
		overviewPanel.add(panel5);
		
		this.add(overviewPanel);
	}
}
