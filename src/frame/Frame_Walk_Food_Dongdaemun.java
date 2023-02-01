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



public class Frame_Walk_Food_Dongdaemun extends JFrame {

	public Frame_Walk_Food_Dongdaemun() {

		JFrame ff = new JFrame();
		ff.setVisible(true);
		ff.setSize(1000, 700);
		ff.setLocationRelativeTo(null);
		ff.getContentPane().setLayout(null);
		ff.getContentPane().setBackground(Color.WHITE);
	
		// ======================================================

		ImageIcon Dongdaemun1 = new ImageIcon("img//동대문 카페 갸또1.jpeg");
		Image img1 = Dongdaemun1.getImage();
		Image chanDongdaemun = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
		ImageIcon Dongdaemun2 = new ImageIcon(chanDongdaemun);
		
		JLabel Proad = new JLabel(Dongdaemun2);
		Proad.setOpaque(true);
		Proad.setSize(870, 260);
		Proad.setLocation(60, 40);
		Proad.setLayout(null);
		ff.add(Proad);
		
        //=======================================================
		ImageIcon Dongdaemun3 = new ImageIcon("img//동대문 카페 갸또2.png");
		Image img2 = Dongdaemun3.getImage();
		Image chanDongdaemun2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
		ImageIcon Dongdaemun4 = new ImageIcon(chanDongdaemun2);
		
		JLabel Ppic = new JLabel(Dongdaemun4);
		Ppic.setOpaque(true);
		Ppic.setSize(420, 250);
		Ppic.setLocation(50, 320);
		Proad.setLayout(null);
		ff.add(Ppic);
		//Ppic.setBounds(520, 320, 420, 250);


		//=======================================================
		Font font=new Font(Font.SANS_SERIF, Font.BOLD, 14);
		JTextArea Pdes1=new JTextArea("                                [카페 갸또마루]\r\n"
				+ "\r\n"
				+ "서울특별시 광진구 면목로 182 5층 갸또마루\r\n"
				+ "중곡역 2,3번출구\r\n"
				+ "문의 0507-1413-7386\r\n"
				+ "\r\n"
				+ "1. 매일 직접 만들어지는 디저트와 케익\r\n"
				+ "2. 에스프레소머신이아닌, 모 카 포 트 카페\r\n"
				+ "3. 아늑한 공간과, 숲같은 루프탑공간\r\n"
				+ "4. 분리된 애견동반공간 (야외입니다)\r\n"
				+ "\r\n"
				+ " * 주차장은 건물주차장 공동사용중이며 (무료), \r\n"
				+ "   평일은 만차일경우가 많아요.");
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