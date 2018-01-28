/**
 * Application Main
 * @author 2020_maxwell_phillips
 *
 */
package rl;
import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import rl.screens.Screen;
import rl.screens.StartScreen;

public class ApplicationMain extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1060623638149583738L;
	
	private AsciiPanel terminal;
	private Screen screen;
	/*
	 * ApplicationMain constructor to 
	 * instantiate a new terminal window 
	 * as an instance of AsciiPanel.
	 * 
	 */
	public ApplicationMain() {
		super();
		terminal = new AsciiPanel();
        //terminal.write("test window", 1, 1); //Test line of text.
        add(terminal);
        pack();
        screen = new StartScreen();
        addKeyListener(this);
        repaint();
        
	}
	
	public void repaint() {
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}
	
	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased (KeyEvent e) {
		
	}
	
	public void keyTyped (KeyEvent e) {
		
	}
	
	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

	}
}
