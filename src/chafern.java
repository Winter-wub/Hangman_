import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.SwingConstants;

public class chafern extends JFrame {

	
	private JPanel contentPane;
	private JButton input[] = new JButton[26];
	private question[] q;
	private JLabel first_lbl;
	private JLabel two_lbl;
	private JLabel three_lbl;
	private JLabel four_lbl;
	private JLabel five_lbl;
	private JLabel six_lbl;
	private int no;
	private question quest;
	
	public chafern(question[] q) {
		this.q = q;
		quest =this.q[0];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 159, 452, 168);
		contentPane.add(panel);
		
		first_lbl = new JLabel("_");
		first_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		first_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		first_lbl.setBounds(60, 58, 51, 54);
		contentPane.add(first_lbl);
		
		two_lbl = new JLabel("_");
		two_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		two_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		two_lbl.setBounds(117, 58, 51, 54);
		contentPane.add(two_lbl);
		
		three_lbl = new JLabel("_");
		three_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		three_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		three_lbl.setBounds(178, 58, 51, 54);
		contentPane.add(three_lbl);
		
		four_lbl = new JLabel("_");
		four_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		four_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		four_lbl.setBounds(239, 58, 51, 54);
		contentPane.add(four_lbl);
		
		five_lbl = new JLabel("_");
		five_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		five_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		five_lbl.setBounds(301, 58, 51, 54);
		contentPane.add(five_lbl);
		
		six_lbl = new JLabel("_");
		six_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		six_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		six_lbl.setBounds(362, 58, 51, 54);
		contentPane.add(six_lbl);
		
		
		char textOninput = 'A';
		JButton input[] = new JButton[26];
		for(int i = 0 ;i<26 ;i++){
			input[i] = new JButton(""+textOninput+ "");
			panel.add(input[i]);
			input[i].addActionListener(new ButtonListener());
			textOninput++;
		}
		
			
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ButtonListener x = new ButtonListener();
			if(e.getSource() instanceof JButton){
				if(((JButton)e.getSource()).getText().equals(q[no].getWordat(0))){
					System.out.println("R");
				}
			}
			
		}
	}	
}