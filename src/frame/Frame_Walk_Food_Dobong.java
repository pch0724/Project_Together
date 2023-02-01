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



public class Frame_Walk_Food_Dobong extends JFrame {

	public Frame_Walk_Food_Dobong() {

		JFrame ff = new JFrame();
		ff.setVisible(true);
		ff.setSize(1000, 700);
		ff.setLocationRelativeTo(null);
		// pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ff.getContentPane().setLayout(null);
	
		// ======================================================

		ImageIcon Dobong1 = new ImageIcon("img//도봉 카페 부기1.png");
		Image img1 = Dobong1.getImage();
		Image chanDobong1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
		ImageIcon Dobong2 = new ImageIcon(chanDobong1);
		
		JLabel Proad = new JLabel(Dobong2);
		Proad.setOpaque(true);
		Proad.setSize(870, 260);
		Proad.setLocation(60, 40);
		Proad.setLayout(null);
		ff.add(Proad);
		
        //=======================================================
		ImageIcon Dobong3 = new ImageIcon("img//도봉 카페 부기2.png");
		Image img2 = Dobong3.getImage();
		Image chanDobong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
		ImageIcon Dobong4 = new ImageIcon(chanDobong2);
		
		JLabel Ppic = new JLabel(Dobong4);
		Ppic.setOpaque(true);
		Ppic.setSize(420, 250);
		Ppic.setLocation(50, 320);
		Proad.setLayout(null);
		ff.add(Ppic);
		//Ppic.setBounds(520, 320, 420, 250);


		//=======================================================
		Font font=new Font(Font.SANS_SERIF, Font.BOLD, 14);
		JTextArea Pdes1=new JTextArea("                                           [카페 부기]\r\n"
				+ "\r\n"
				+ "서울특별시 도봉구 도봉로114길 29-5, 101호 (창동, 남양캐슬)\r\n"
				+ "문의 0507-1346-8157\r\n"
				+ "\r\n"
				+ "알림 애견동반시 지켜주셔야 할 점\r\n"
				+ "1. 실내 배변을 하는 강아지들은 매너 패드 착용\r\n"
				+ "(매장 바닥이 카펫 이라 흡수가 잘됩니다)\r\n"
				+ "2. 매너 패드 미착용 시 안고 있어 주세요\r\n"
				+ "3. 의자 위에 앉히실 땐 발을 닦이고 앉혀주세요\r\n"
				+ "(의자들이 밝은 톤이라 자국이 생기면 지워지지 않아요)\r\n"
				+ "4. 큰 대형견들 입장 시 목줄 착용과 의자 아래에 앉혀주세요");
		Pdes1.setOpaque(true);
		Pdes1.setBounds(520, 320, 420, 250);
		
		Pdes1.setFont(font);
	    ff.add(Pdes1);

		//=======================================================
		JButton Pclose = new JButton("닫기");
		Pclose.setOpaque(true);
		Pclose.setBackground(Color.RED);
		Pclose.setBounds(900, 600, 60, 30);
		Pclose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ff.dispose();
			}
		});

		ff.add(Pclose);
		//=======================================================

	}

}