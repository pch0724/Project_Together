package frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame_Work extends JPanel{
	
	public Frame_Work() {
		setBounds(0, 0, 450, 480);
		setBackground(Color.GREEN);
		setLayout(null);
		
		
		JComboBox<String> jcombx=new JComboBox<String>();
		jcombx.setBounds(350, 30, 70, 30);
		
		add(jcombx);
		
		JLabel wname =new JLabel();
		wname.setBounds(30, 40, 90, 40);
		wname.setOpaque(true);
		wname.setBackground(Color.black);
		
		JLabel wpic=new JLabel();
		wpic.setBounds(wname.getX(), 80, 390, 150);
		wpic.setOpaque(true);
		wpic.setBackground(Color.DARK_GRAY);
		
		JButton wpre= new JButton();
		wpre.setBounds(wname.getX(), 230, 40, 30);
		
		JButton wnxt= new JButton();
		wnxt.setBounds(380, 230, 40, 30);
		
		JLabel cname =new JLabel();
		cname.setBounds(30, wpre.getY()+30,90, 40);
		cname.setOpaque(true);
		cname.setBackground(Color.gray);
		
		JLabel cpic=new JLabel();
		cpic.setBounds(cname.getX(), 300, 390, 150);
		cpic.setOpaque(true);
		cpic.setBackground(Color.cyan);
		
		JButton cpre= new JButton();
		cpre.setBounds(cname.getX(), 450, 40, 30);
		
		JButton cnxt= new JButton();
		cnxt.setBounds(380, 450, 40, 30);
		
		
		
		add(wname);
		add(wpic);
		add(wpre);
		add(wnxt);
		
		add(cname);
		add(cpic);
		add(cpre);
		add(cnxt);
		
		
	}

}
