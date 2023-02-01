package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame_Intro extends JPanel {

	
	public Frame_Intro(){


	setSize(500, 800);
	setLayout(null);
	setBackground(Color.WHITE);
	setVisible(true);

	
	ImageIcon intro = new ImageIcon("img//인트로화면.png");
	Image img = intro.getImage();
	Image changeintro = img.getScaledInstance(500, 750, Image.SCALE_SMOOTH);
	ImageIcon intro2 = new ImageIcon(changeintro);
	JLabel i = new JLabel(intro2);
	i.setBounds(0,0,500,795);
	add(i);
	
	
	ImageIcon btn1 = new ImageIcon("img//GO1.png");
	ImageIcon btn2 = new ImageIcon("img//GO2.png");
	JButton go = new JButton(btn1);
	go.setRolloverIcon(btn2);
	go.setBorderPainted(false); // 버튼의 외곽선 없에기
	go.setBounds(180,350,130,130);
	add(go);
	
	go.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Frame_Base.getInstance(new Frame_Login());
			
		}
	});
	
	
	}
	
}
