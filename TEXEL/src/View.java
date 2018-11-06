import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
/**
 * PROJECTNAME
 * Maxwell Phillips
 * Sep 27, 2018
 */

public class View
{

	CalculateCorrelation cClass;
	ArrayList<Double> data1 = new ArrayList<Double>();
	ArrayList<Double> data2 = new ArrayList<Double>();
	
	File dataFile1;
	File dataFile2;

	private JFrame frame;
	private JLabel lblCorrelation;
	private JLabel lblCorrelationCoefficent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					View window = new View();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View()
	{
		initialize();
		cClass = new CalculateCorrelation();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame("Correlation Calculator");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSelectDataSet = new JButton("Select Data Set 1");
		btnSelectDataSet.setHorizontalAlignment(SwingConstants.LEFT);
		btnSelectDataSet.setFont(new Font("Comic Sans MS", btnSelectDataSet.getFont().getStyle(), 10));
		btnSelectDataSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Select Data Set 1
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("data/"));
				int result = fileChooser.showOpenDialog(frame);
				if (result == JFileChooser.APPROVE_OPTION) {
				    File selectedFile = fileChooser.getSelectedFile();
				    System.out.println("Selected file 1: " + selectedFile.getAbsolutePath());
				    dataFile1 = selectedFile;
				}
				
			}
		});
		btnSelectDataSet.setBounds(30, 53, 125, 30);
		frame.getContentPane().add(btnSelectDataSet);
		
		JButton button = new JButton("Select Data Set 2");
		button.setFont(new Font("Comic Sans MS", button.getFont().getStyle(), 10));
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Select Data Set 2
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("data/"));
				int result = fileChooser.showOpenDialog(frame);
				if (result == JFileChooser.APPROVE_OPTION) {
				    File selectedFile = fileChooser.getSelectedFile();
				    System.out.println("Selected file 2: " + selectedFile.getAbsolutePath());
				    dataFile2 = selectedFile;
				}
			}
		});
		button.setBounds(30, 82, 150, 30);
		frame.getContentPane().add(button);
		
		JButton btnFindCorrelation = new JButton("Find Correlation");
		btnFindCorrelation.setHorizontalAlignment(SwingConstants.LEFT);
		btnFindCorrelation.setFont(new Font("Comic Sans MS", btnFindCorrelation.getFont().getStyle(), 10));
		btnFindCorrelation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculateCorrelation.fillArrayList(data1, dataFile1);
				CalculateCorrelation.fillArrayList(data2, dataFile2);
				//TODO check that the data sets have same number of values before finding correlation
				CalculateCorrelation.getCorrelation(CalculateCorrelation.corrCo(data1, data2));
				setLblCorrelationText((CalculateCorrelation.getCorrelation(CalculateCorrelation.corrCo(data1, data2))).toString());
				double cc = CalculateCorrelation.corrCo(data1, data2);
				setLblCorrelationCoefficentText(String.format("%.2f", cc));
				
				//create scatter plot and place it

				}
		});
		btnFindCorrelation.setBounds(30, 111, 125, 30);
		frame.getContentPane().add(btnFindCorrelation);
		
		lblCorrelation = new JLabel("Correlation: ");
		lblCorrelation.setBounds(30, 142, 150, 16);
		frame.getContentPane().add(lblCorrelation);
		
		lblCorrelationCoefficent = new JLabel("Direction: ");
		lblCorrelationCoefficent.setBounds(30, 170, 150, 16);
		frame.getContentPane().add(lblCorrelationCoefficent);
		
		
	    
		//TESTING
		/*
		CalculateCorrelation.fillArrayList(data1, dataFile1);
		CalculateCorrelation.fillArrayList(data2, dataFile2);
		CalculateCorrelation.getCorrelation(CalculateCorrelation.corrCo(data1, data2));
		System.out.println("Correlation coefficent: "+(float)CalculateCorrelation.corrCo(data1, data2));
		*/
	}
	
	protected void setLblCorrelationText(String text) {
		lblCorrelation.setText(text);
	}
	
	protected void setLblCorrelationCoefficentText(String text_1) {
		lblCorrelationCoefficent.setText(text_1);
	}
}
