package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Frame_Walk extends JPanel {

	public Frame_Walk() {
		setBounds(0, 0, 500, 730);
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel map = new JLabel("서울 지도");
		map.setOpaque(true);
		map.setBackground(Color.black);
		map.setSize(300, 300);
		map.setLocation(50, 50);
		map.setHorizontalAlignment(SwingConstants.CENTER);
		add(map);
		
		Bottom_Button bb = new Bottom_Button();
		add(bb);
	}

}
