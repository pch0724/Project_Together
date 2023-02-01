package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame_Walk_Road extends JFrame{

	public Frame_Walk_Road() {

		JFrame pf = new JFrame();
		pf.setVisible(true);
		pf.setSize(1000, 700);
		pf.setLocationRelativeTo(null);
		//pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pf.getContentPane().setLayout(null);
		// ======================================================

		JLabel Proad = new JLabel();
		Proad.setOpaque(true);
		Proad.setBackground(Color.blue);
		Proad.setBounds(50, 40, 420, 250);

		pf.add(Proad);

		JLabel Ppic = new JLabel();
		Ppic.setOpaque(true);
		Ppic.setBackground(Color.blue);
		Ppic.setBounds(520, 40, 420, 250);

		pf.add(Ppic);

		JLabel Pdes = new JLabel();
		Pdes.setOpaque(true);
		Pdes.setBackground(Color.blue);
		Pdes.setBounds(60, 320, 870, 260);

		pf.add(Pdes);

		JButton Pclose = new JButton();
		Pclose.setOpaque(true);
		Pclose.setBackground(Color.RED);
		Pclose.setBounds(900, 600, 50, 30);
		Pclose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pf.dispose();
			}
		});

		pf.add(Pclose);

	}

}