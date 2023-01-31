package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame_Base extends JFrame{
		
	private static Frame_Base instance= new Frame_Base();
		
	private Frame_Base() {	
		//기본 프레임 구조
		setTitle("Together");
		setSize(500,800);

		setVisible(true);
		setResizable(false);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void getInstance (JPanel e) {
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
		
	}
	
}

