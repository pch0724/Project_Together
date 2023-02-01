package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import frame.Frame_Base;

public class Frame_Shopping extends JPanel {

	public Frame_Shopping() {
		setLayout(null);
		setSize(500, 730);
		setBackground(Color.WHITE);

		// 로고 라벨
		ImageIcon logophoto = new ImageIcon("img\\투개더로고2.png");
		Image img = logophoto.getImage();
		Image changelogophoto = img.getScaledInstance(250, 80, Image.SCALE_SMOOTH);
		ImageIcon logophoto2 = new ImageIcon(changelogophoto);

		JLabel logo = new JLabel(logophoto2);
		logo.setHorizontalAlignment(SwingConstants.CENTER);// 사진정렬-가운데
		logo.setBounds(115, 20, 250, 80);
		logo.setOpaque(true);
		logo.setBackground(Color.GRAY);
		add(logo);

		Font font = new Font("맑은고딕", Font.BOLD, 40);
		JLabel cateBtn = new JLabel("상품 구매");
		cateBtn.setBackground(Color.WHITE);
		cateBtn.setSize(200, 70);
		cateBtn.setLocation(150, 80);
		cateBtn.setFont(font);
		add(cateBtn);

		JButton cartBtn = new JButton("장바구니");
		cartBtn.setBackground(Color.WHITE);
		cartBtn.setSize(60, 60);
		cartBtn.setLocation(420, 0);
		add(cartBtn);

		JButton product1Btn = new JButton("간식");
		product1Btn.setBackground(Color.WHITE);
		product1Btn.setSize(245, 200);
		product1Btn.setLocation(0, 180);
		add(product1Btn);
		product1Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Snack());

			}// snack으로 연결
		});

		JButton product2Btn = new JButton("장난감");
		product2Btn.setBackground(Color.WHITE);
		product2Btn.setSize(245, 200);
		product2Btn.setLocation(product1Btn.getX() + 245, product1Btn.getY());
		add(product2Btn);
		product2Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Toy());

			}// toy로 연결
		});

		JButton product3Btn = new JButton("배변/위생");
		product3Btn.setBackground(Color.WHITE);
		product3Btn.setSize(245, 200);
		product3Btn.setLocation(product1Btn.getX(), product1Btn.getY() + 200);
		add(product3Btn);
		product3Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Clean());

			}// clean으로 연결
		});

		JButton product4Btn = new JButton("산책용품");
		product4Btn.setBackground(Color.WHITE);
		product4Btn.setSize(245, 200);
		product4Btn.setLocation(product1Btn.getX() + 245, product1Btn.getY() + 200);
		add(product4Btn);
		product4Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Walk());

			}// walk로 연결
		});

		Bottom_Button bb = new Bottom_Button();
		add(bb);
	}

}
