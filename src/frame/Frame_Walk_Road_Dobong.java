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



public class Frame_Walk_Road_Dobong extends JFrame {

	public Frame_Walk_Road_Dobong() {

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

		ImageIcon Dobong1 = new ImageIcon("img//도봉1.png");
		Image img1 = Dobong1.getImage();
		Image chanDobong1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
		ImageIcon Dobong2 = new ImageIcon(chanDobong1);
		
		JLabel Proad = new JLabel(Dobong2);
		Proad.setOpaque(true);
		Proad.setSize(870, 260);
		Proad.setLocation(60, 40);
		Proad.setLayout(null);
		pf.add(Proad);
		
        //=======================================================
		ImageIcon Dobong3 = new ImageIcon("img//도봉2.png");
		Image img2 = Dobong3.getImage();
		Image chanDobong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
		ImageIcon Dobong4 = new ImageIcon(chanDobong2);
		
		JLabel Ppic = new JLabel(Dobong4);
		Ppic.setOpaque(true);
		Ppic.setSize(420, 250);
		Ppic.setLocation(60, 320);
		Proad.setLayout(null);
		pf.add(Ppic);
		//Ppic.setBounds(520, 320, 420, 250);


		//=======================================================
		
		Font font=new Font(Font.SANS_SERIF, Font.BOLD, 16);
		JTextArea Pdes=new JTextArea("                          [ 도봉구 초안산 도봉 둘레길 ]\r\n"
				+ "\r\n"
				+ "산책코스 : 초안산근린공원 공영주차장\r\n"
				+ "                 – 도봉구반려견놀이터(초안산공공반려견놀이터)\r\n"
				+ "                 – 초안산 도봉 둘레길\r\n"
				+ "                 – 초안산 나들길 \r\n"
				+ "\r\n"
				+ "주소 : 서울 도봉구 해등로 3길 48-11 (초안산근린공원)\r\n"
				+ "연락처 : 02-2091-4474\r\n"
				+ "입장조건 : 동물 등록 필수, 맹견 입장 불가\r\n"
				+ "놀이터 분리여부 : 소형견, 대형견 분리        |        주차 가능\r\n"
				+ "\r\n"
				+ "",18,42);
		Pdes.setOpaque(true);
		Pdes.setBounds(490, 320, 450, 250);
		
	    Pdes.setFont(font);
		pf.add(Pdes);

		//=======================================================
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
		//=======================================================

	}

}