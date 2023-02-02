package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Frame_Walk_Road_Joong extends JFrame {

	public Frame_Walk_Road_Joong() {

		JFrame pf = new JFrame();
		pf.setVisible(true);
		pf.setSize(1000, 700);
		pf.setLocationRelativeTo(null);
		pf.setBackground(Color.white);
		// pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pf.getContentPane().setLayout(null);
		pf.getContentPane().setLayout(null);
		pf.getContentPane().setBackground(Color.WHITE);

		// ======================================================

		ImageIcon Joong1 = new ImageIcon("img//중구1.png");
		Image img1 = Joong1.getImage();
		Image chanJoong1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
		ImageIcon Joong2 = new ImageIcon(chanJoong1);

		JLabel Proad = new JLabel(Joong2);
		Proad.setOpaque(true);
		Proad.setSize(870, 260);
		Proad.setLocation(60, 40);
		Proad.setLayout(null);
		pf.add(Proad);

		// =======================================================
		ImageIcon Joong3 = new ImageIcon("img//중구2.png");
		Image img2 = Joong3.getImage();
		Image chanJoong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
		ImageIcon Joong4 = new ImageIcon(chanJoong2);

		JLabel Ppic = new JLabel(Joong4);
		Ppic.setOpaque(true);
		Ppic.setSize(420, 250);
		Ppic.setLocation(60, 320);
		Proad.setLayout(null);
		pf.add(Ppic);
		// Ppic.setBounds(520, 320, 420, 250);

		ImageIcon dog = new ImageIcon("img//구석강아지2.png");
		Image dog1 = dog.getImage();
		Image dog2 = dog1.getScaledInstance(230, 100, Image.SCALE_SMOOTH);
		ImageIcon dog4 = new ImageIcon(dog2);
		JLabel dog5 = new JLabel(dog4);
		dog5.setBounds(20, 565, 250, 120);
		pf.add(dog5);

		// =======================================================

		Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 16);
		JTextArea Pdes = new JTextArea(
				"                          [ 남산 둘레길 ]\r\n" + "\r\n" + "산책코스 : 남산 야외 식물원\r\n"
						+ "                 – 자연생태길 둘레길\r\n" + "                 – 벚꽃길\r\n"
						+ "                 – 역사문화 둘레길\r\n" + "\r\n" + "주소 : 서울 중구 회현동1가\r\n" + "연락처 : 02-3783-5900\r\n"
						+ "입장조건 : 동물 등록 필수, 맹견 입장 불가\r\n" + "차량 통제 및 무장애 길 | 소형견, 대형견 분리 | 주차 가능\r\n" + "\r\n" + "",
				18, 42);
		Pdes.setOpaque(true);
		Pdes.setBounds(490, 320, 450, 250);

		Pdes.setFont(font);
		pf.add(Pdes);

		// =======================================================
		JButton Pclose = new JButton("닫기");
		Pclose.setOpaque(true);
		Pclose.setBackground(Color.RED);
		Pclose.setBounds(900, 600, 60, 30);
		Pclose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pf.dispose();
			}
		});

		pf.add(Pclose);
		// =======================================================

	}

}