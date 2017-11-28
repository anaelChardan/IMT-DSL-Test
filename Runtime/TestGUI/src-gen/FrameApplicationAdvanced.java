import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class FrameApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	        JFrame A = new JFrame();
            	        JFrame B = new JFrame();
            	        
            	        A.setLayout(new FlowLayout());
            	        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            	        A.setTitle("Frame A");
            	        A.setSize(200, 100);
            	        JLabel label0 = new JLabel();
            	        A.add(label0);
            	        label0.setText("Hello");
            	        JButton buttonA1 = new JButton();
            	        A.add(button1);
            	        buttonA1.setText("...");
            	        buttonA1.addActionListener(new ActionListener(){
            	        @Override
            	        public void actionPerformed(ActionEvent e) {
            	        	
            	        	B.setVisible(true); 
            	        	A.setVisible(false);
            	        } 
            	        });
            	        B.setLayout(new FlowLayout());
            	        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            	        B.setTitle("Frame B");
            	        B.setSize(300, 100);
            	        JLabel label0 = new JLabel();
            	        B.add(label0);
            	        label0.setText("...World!");
            	        JButton buttonB1 = new JButton();
            	        B.add(button1);
            	        buttonB1.setText("Restart");
            	        buttonB1.addActionListener(new ActionListener(){
            	        @Override
            	        public void actionPerformed(ActionEvent e) {
            	        	
            	        	A.setVisible(true); 
            	        	B.setVisible(false);
            	        } 
            	        });
            	        
            	        A.setVisible(true);
            }
        });
    }
}
