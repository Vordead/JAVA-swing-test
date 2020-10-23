import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatFrame implements  ActionListener {

	JMenuItem m111 ;
	JMenuItem m122 ;
	JButton ss ;
	JButton r ;
	JFrame frame ;
	JPanel p ;
	
	public ChatFrame() {
		
		frame = new JFrame("Chat Frame") ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(300, 300);
		JMenuBar mb = new JMenuBar(); 
		JMenu m1 = new JMenu("FILE"); 
		JMenu m2 = new JMenu("Help") ;
		mb.add(m1); 
		mb.add(m2) ;
		m111 = new JMenuItem("Open"); 
		m122 = new JMenuItem("Save as") ;
		m1.add(m111); 
		m1.add(m122) ;
		frame.setJMenuBar(mb);
		
		p = new JPanel() ;
		p.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Enter Text");
		p.add(label) ;
		
		JTextField text = new JTextField("", 10) ;
		p.add(text) ;
		
		ss = new JButton("Send") ;
		r = new JButton("Reset") ;
		p.add(ss) ;
		p.add(r) ;
		
		frame.add(BorderLayout.SOUTH, p) ;
		frame.setVisible(true);
		
		ss.addActionListener(this) ;
		r.addActionListener(this) ;
		m111.addActionListener(this) ;
		m122.addActionListener(this) ;
		
	}
	
	public static void main(String[] args) {
		
		ChatFrame test = new ChatFrame() ;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JButton) { 
			JButton b = (JButton) e.getSource() ; 
			if(b == ss) {
				JOptionPane.showMessageDialog(frame, "Send button was pressed");
			}else if (b == r) {
				JOptionPane.showMessageDialog(frame, "Reset button was pressed");
			}
		}else if (e.getSource() instanceof JMenuItem) {  	
			JMenuItem m = (JMenuItem) e.getSource();  	
			if (m == m111) {
				JOptionPane.showMessageDialog(frame, "Open", "JMenu item was clicked", JOptionPane.PLAIN_MESSAGE);
			}else if (m == m122) {
				JOptionPane.showMessageDialog(frame, "Save As", "JMenu item was clicked", JOptionPane.PLAIN_MESSAGE);
			}
				
		}	
	}
}