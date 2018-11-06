/**
 * PROJECTNAME
 * Maxwell Phillips
 * Sep 4, 2018
 */

import javax.swing.*;

public class guiSpam
{

	static int guiNum = 0;
	public guiSpam()
	{
		
	}
	public static void main(String[] args)
	{
		while (true)
		{
					JFrame f = new JFrame("frameo");
					JPanel contentPanel = new JPanel();
					contentPanel.add(new JLabel("SPAM-O"));
					f.setContentPane(contentPanel);
					f.pack();
					f.setVisible(true);
					
					guiNum++;
					System.out.println(guiNum);
		}
	}

}
