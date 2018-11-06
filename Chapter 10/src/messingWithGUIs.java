import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
public class messingWithGUIs {

	static JFrame frame;
	static JPanel contentPanel;
	static JLabel label = new JLabel("Yeetity");
	static JTextField text = new JTextField("skeet");
	
	public static void main(String[] args) {
		frame = new JFrame("Shitty window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(0,2,10,5));
		contentPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPanel.add(label);
		contentPanel.add(text);
		
		frame.setContentPane(contentPanel);
		frame.pack();
		frame.setVisible(true);
	}

}
