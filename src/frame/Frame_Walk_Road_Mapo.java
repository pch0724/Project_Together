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

public class Frame_Walk_Road_Mapo extends JFrame {

	public Frame_Walk_Road_Mapo() {

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

		ImageIcon Mapo1 = new ImageIcon("img//마포1.png");
		Image img1 = Mapo1.getImage();
		Image chanMapo = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
		ImageIcon Mapo2 = new ImageIcon(chanMapo);

		JLabel Proad = new JLabel(Mapo2);
		Proad.setOpaque(true);
		Proad.setSize(870, 260);
		Proad.setLocation(60, 40);
		Proad.setLayout(null);
		pf.add(Proad);

		// =======================================================
		ImageIcon Mapo3 = new ImageIcon("img//마포2.jpg");
		Image img2 = Mapo3.getImage();
		Image chanMapo1 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
		ImageIcon Mapo4 = new ImageIcon(chanMapo1);

		JLabel Ppic = new JLabel(Mapo4);
		Ppic.setOpaque(true);
		Ppic.setSize(420, 250);
		Ppic.setLocation(60, 320);
		Ppic.setLayout(null);
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

		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);
		JTextArea Pdes = new JTextArea(
				"                    [ 마포구 하늘공원 메타세콰이어길 산책로 ]\r\n" + "\r\n" + "산책코스 : 평화의공원 주차장 \r\n"
						+ "– 월드컵공원 반려견놀이터 – 메타세콰이어길 – 하늘공원 진입로 \r\n" + "– 하늘계단 – 하늘공원 억새길 – 평화의공원 주차장\r\n" + "\r\n"
						+ "주소 : 서울 마포구 증산로 32 (상암동, 안내소)\r\n" + "연락처 : 02-2124-2835\r\n"
						+ "운영시간 : 10:00~21:00, 월요일 휴무\r\n" + "입장조건 : 동물 등록 필수\r\n" + "놀이터 분리여부 : 소형견, 대형견 분리\r\n"
						+ "*대형견: 체고 40cm 초과 또는 15kg 초과\r\n" + "*중·소형견: 체고 40cm 미만 또는 15kg 미만        |        주차 가능",
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