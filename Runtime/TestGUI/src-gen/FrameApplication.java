import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class FrameApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	        JFrame A = new JFrame();
            	         	A.setLayout(new FlowLayout());
            	         	A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            	         	A.setTitle("Frame A");
            	         	A.setSize(200, 100);
            	        JLabel label0 = new JLabel();
            	        A.add(label0);
            	        label0.setText("Hello");
            	        JButton button1 = new JButton();
            	        A.add(button1);
            	        button1.setText("World!");
            	         	A.setVisible(true);
            }
        });
    }
}
