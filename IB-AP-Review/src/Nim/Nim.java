package Nim;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Nim implements ActionListener {

	private JFrame frame;
	public NimLogic logic;
	private JLabel lblStonesLeft;
	private JLabel lblP1Stones;
	private JLabel lblP2Stones;
	private JSlider slider;	
	private JButton btnTake;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nim window = new Nim();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		logic = new NimLogic();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		slider = new JSlider();
		slider.setValue(2);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(1);
		slider.setMinimum(1);
		slider.setMaximum(3);
		frame.getContentPane().add(slider, BorderLayout.CENTER);
		
		JLabel stoneSelector = new JLabel("Select a number of stones to take and select \"Take.\"");
		frame.getContentPane().add(stoneSelector, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.SOUTH);
		
		lblP1Stones = new JLabel("P1 Stones: 0");
		splitPane.setLeftComponent(lblP1Stones);
		
		lblP2Stones = new JLabel("P2 Stones:  0");
		splitPane.setRightComponent(lblP2Stones);
		
		lblStonesLeft = new JLabel("Stones Left:");
		frame.getContentPane().add(lblStonesLeft, BorderLayout.WEST);
		
		btnTake = new JButton("Take");
		btnTake.addActionListener(this);
		frame.getContentPane().add(btnTake, BorderLayout.EAST);
		
		this.refreshStats();
	}

	public void actionPerformed(ActionEvent e) {

		Object s = e.getSource();
		if (s == btnTake) { //Player does their turn
			
			this.refreshStats();
			logic.p1Take(slider.getValue());
			this.refreshStats();
			logic.p2Take();
			this.refreshStats();
			
		}
	}
	
	public void refreshStats() {
		lblP1Stones.setText("P1 Stones: "+logic.player1Stones);
		lblP2Stones.setText("P2 Stones: "+logic.player2Stones);
		lblStonesLeft.setText("Stones Left: "+logic.totalStones);
		
	}
}
