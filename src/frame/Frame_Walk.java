 package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import customDAO.CartDAO;
import customDAO.MyInfo;
import customDAO.SellDAO;

public class Frame_Walk extends JPanel {

	public Frame_Walk() {
	}

	public Frame_Walk(MyInfo m, CartDAO cart, SellDAO history) {
		setBounds(0, 0, 500, 730);
		setBackground(Color.WHITE);
		setLayout(null);

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

		// 지도 이미지
		ImageIcon seoul = new ImageIcon("img\\서울.png");
		Image img2 = seoul.getImage();
		Image changeseoul = img2.getScaledInstance(430, 430, Image.SCALE_SMOOTH);
		ImageIcon seoul2 = new ImageIcon(changeseoul);

		// 지도 라벨
		JLabel map = new JLabel(seoul2);
		map.setOpaque(true);
		map.setBackground(Color.WHITE);
		map.setSize(430, 430);
		map.setLocation(26, 200);
		map.setHorizontalAlignment(SwingConstants.CENTER);
		map.setLayout(null);
		add(map);

		// 버튼 아이콘
		ImageIcon imgloc1 = new ImageIcon("img\\point1.png");
		ImageIcon imgloc2 = new ImageIcon("img\\point2.png");

		// 지역 버튼
		// 광진구
		JButton loc1 = new JButton(imgloc1);
		loc1.setContentAreaFilled(false);// 투명
		loc1.setBorderPainted(false);
		loc1.setRolloverIcon(imgloc2);
		loc1.setSize(35, 50);
		loc1.setLocation(map.getX() + 280, map.getY() + 5);
		loc1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Walk_Road_Gwangjin();
			}
		});

		// 동대문구
		JButton loc2 = new JButton(imgloc1);
		loc2.setContentAreaFilled(false);// 투명
		loc2.setBorderPainted(false);
		loc2.setRolloverIcon(imgloc2);
		loc2.setSize(35, 50);
		loc2.setLocation(map.getX() + 260, map.getY() - 50);// 좌표값 수정필요
		loc2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Walk_Road_Dongdaemun();
			}
		});

		// 도봉구
		JButton loc3 = new JButton(imgloc1);
		loc3.setContentAreaFilled(false);// 투명
		loc3.setBorderPainted(false);
		loc3.setRolloverIcon(imgloc2);
		loc3.setSize(35, 50);
		loc3.setLocation(map.getX() + 235, map.getY() - 170);
		loc3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Walk_Road_Dobong();
			}
		});

		// 중구
		JButton loc4 = new JButton(imgloc1);
		loc4.setContentAreaFilled(false);// 투명
		loc4.setBorderPainted(false);
		loc4.setRolloverIcon(imgloc2);
		loc4.setSize(35, 50);
		loc4.setLocation(map.getX() + 195, map.getY() - 30);
		loc4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Walk_Road_Joong();
			}
		});

		// 관악구
		JButton loc5 = new JButton(imgloc1);
		loc5.setContentAreaFilled(false);// 투명
		loc5.setBorderPainted(false);
		loc5.setRolloverIcon(imgloc2);
		loc5.setSize(35, 50);
		loc5.setLocation(map.getX() + 120, map.getY() + 65);
		loc5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Walk_Road_Dongjak();
			}
		});

		// 마포구
		JButton loc6 = new JButton(imgloc1);
		loc6.setContentAreaFilled(false);// 투명
		loc6.setBorderPainted(false);
		loc6.setRolloverIcon(imgloc2);
		loc6.setSize(35, 50);
		loc6.setLocation(map.getX() + 100, map.getY() - 15);
		loc6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Walk_Road_Mapo();
			}
		});

		map.add(loc1);
		map.add(loc2);
		map.add(loc3);
		map.add(loc4);
		map.add(loc5);
		map.add(loc6);

		// 버튼
		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
	}

}
