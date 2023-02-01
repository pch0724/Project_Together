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



public class Frame_Walk_Food_Joong extends JFrame {

	public Frame_Walk_Food_Joong() {

		JFrame ff = new JFrame();
		ff.setVisible(true);
		ff.setSize(1000, 700);
		ff.setLocationRelativeTo(null);
		// pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ff.getContentPane().setLayout(null);
	
		// ======================================================

		ImageIcon Joong1 = new ImageIcon("img//중1.jpg");
		Image img1 = Joong1.getImage();
		Image chanJoong = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
		ImageIcon Joong2 = new ImageIcon(chanJoong);
		
		JLabel Proad = new JLabel(Joong2);
		Proad.setOpaque(true);
		Proad.setSize(870, 260);
		Proad.setLocation(60, 40);
		Proad.setLayout(null);
		ff.add(Proad);
		
        //=======================================================
		ImageIcon Joong3 = new ImageIcon("img//중2.png");
		Image img2 = Joong3.getImage();
		Image chanJoong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
		ImageIcon Joong4 = new ImageIcon(chanJoong2);
		
		JLabel Ppic = new JLabel(Joong4);
		Ppic.setOpaque(true);
		Ppic.setSize(420, 250);
		Ppic.setLocation(50, 320);
		Proad.setLayout(null);
		ff.add(Ppic);
		//Ppic.setBounds(520, 320, 420, 250);


		//=======================================================
		Font font=new Font(Font.SANS_SERIF, Font.BOLD, 16);
		JTextArea Pdes1=new JTextArea("                           [카페 카페구할구]\r\n"
				+ "\r\n"
				+ "서울 중구 퇴계로20길 73 카페 구할구\r\n"
				+ "문의 0507-1486-5953\r\n"
				+ "\r\n"
				+ "명동 남산의 뷰맛집 커피맛집 카페구할구 남산입니다.\r\n"
				+ "서울 지하철 명동역에서 도보 5분거리.\r\n"
				+ "1,2,3층 그리고 4층 루프탑까지 전층 운영합니다.\r\n"
				+ "남산둘레길 반려견과 산책후 들러주시면 감사하겠습니다.\r\n"
				+ "주차장은 남산 공영주차장을 이용해 주세요.");
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