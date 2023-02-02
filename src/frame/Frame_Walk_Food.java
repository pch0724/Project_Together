package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame_Walk_Food extends JFrame {

	public Frame_Walk_Food() {

		JFrame ff = new JFrame(" 지역 소개");
		ff.setVisible(true);
		ff.setSize(1000, 700);
		ff.setLocationRelativeTo(null);
		// ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ff.getContentPane().setLayout(null);
		// ======================================================

		JLabel Proad = new JLabel();
		Proad.setOpaque(true);
		Proad.setBackground(Color.red);
		Proad.setBounds(50, 40, 420, 250);

		ff.add(Proad);

		JLabel Ppic = new JLabel();
		Ppic.setOpaque(true);
		Ppic.setBackground(Color.red);
		Ppic.setBounds(520, 40, 420, 250);

		ff.add(Ppic);

		JLabel Pdes = new JLabel();
		Pdes.setOpaque(true);
		Pdes.setBackground(Color.red);
		Pdes.setBounds(60, 320, 870, 260);

		ff.add(Pdes);

		JButton Pclose = new JButton();
		Pclose.setOpaque(true);
		Pclose.setBackground(Color.RED);
		Pclose.setBounds(900, 600, 50, 30);
		Pclose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ff.dispose();

			}
		});
		ff.add(Pclose);

	}

}