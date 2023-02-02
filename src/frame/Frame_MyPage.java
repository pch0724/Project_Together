package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import customDAO.CartDAO;
import customDAO.MyInfo;
import customDAO.SellDAO;

public class Frame_MyPage extends JPanel {

	public Frame_MyPage() {
	}

	public Frame_MyPage(MyInfo m, CartDAO cart, SellDAO history) {

		// 기본 패널 설정
		setLayout(null);
		// JPanel nav = new JPanel();
		// nav.setBounds(0, 0, 450, 480);
		setSize(450, 480);
		// nav.setBackground(Color.GREEN);
		setBackground(Color.white);
		// 반려견 정보 라벨

		JLabel Dinfo = new JLabel("반려견 정보");
		Dinfo.setVerticalAlignment(SwingConstants.TOP);
		Dinfo.setHorizontalAlignment(SwingConstants.CENTER);
		Dinfo.setBounds(250, 50, 190, 130);
		add(Dinfo);

		Dinfo.setOpaque(true);
		Dinfo.setBackground(Color.black);

		// 사진 label
		JLabel dogpic = new JLabel("");
		dogpic.setIcon(new ImageIcon("img//images.jpg"));
		dogpic.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
		dogpic.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
		add(dogpic);

		// 수정버튼
		ImageIcon btndreg1 = new ImageIcon("img//마이페이지등록버튼1.png");
		ImageIcon btndreg2 = new ImageIcon("img//마이페이지등록버튼2.png");
		JButton DregiBtn = new JButton(btndreg1);
		DregiBtn.setContentAreaFilled(false);
		DregiBtn.setBorderPainted(false); // 버튼의 외곽선 없에기
		DregiBtn.setRolloverIcon(btndreg2);
		DregiBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_MyPage_RegisterDog(m, cart, history);

			}
		});
		DregiBtn.setBounds(40, 230, 125, 40);
		add(DregiBtn);

		ImageIcon btndmo1 = new ImageIcon("img//수정버튼1.png");
		ImageIcon btndmo2 = new ImageIcon("img//수정버튼2.png");
		JButton DmodifyBtn = new JButton(btndmo1);
		DmodifyBtn.setContentAreaFilled(false);
		DmodifyBtn.setBorderPainted(false); // 버튼의 외곽선 없에기
		DmodifyBtn.setRolloverIcon(btndmo2);
		DmodifyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame_MyPage_UpdateDog(m, cart, history);
			}
		});
		DmodifyBtn.setBounds(185, 230, 125, 40);
		add(DmodifyBtn);

		// 일지작성
		ImageIcon btnwrite1 = new ImageIcon("img//일지작성버튼1.png");
		ImageIcon btnwrite2 = new ImageIcon("img//일지작성버튼2.png");
		JButton writediary = new JButton(btnwrite1);
		writediary.setContentAreaFilled(false);
		writediary.setBorderPainted(false); // 버튼의 외곽선 없에기
		writediary.setRolloverIcon(btnwrite2);

		writediary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame_Diary(m, cart, history);
			}
		});

		writediary.setBounds(325, 230, 125, 40);
		add(writediary);

		// diarylist 라벨
		// diarylist 라벨
		String Heder[] = { "제목", "내용" };
		Object[][] list = { { "짱귀여운강아지", "세상에 이렇게 귀여운 강아지가 있다. 솜이야!" },
				{ "오늘도 너무나 귀여운 우리솜이", "세상에 벽을 뿌시고싶다 솜이야너무 귀여워!!!!!!!!!" }, { "어떻게해야 귀겨움을 멈출수 있죠?", "으아아아아아아아앙아ㅏ악" } };

		JTable table = new JTable(list, Heder);
		JScrollPane s = new JScrollPane(table);
		s.setBounds(70, 310, 350, 220);
		add(s);
		/*
		 * JLabel diarylistL = new JLabel("diarylist");
		 * diarylistL.setHorizontalAlignment(SwingConstants.CENTER); // 라벨 정렬 | 가운데
		 * diarylistL.setBounds(70, 310, 350, 220); add(diarylistL); // 패널에 라벨 추가
		 */

		ImageIcon btnwpmod1 = new ImageIcon("img//정보수정버튼1.png");
		ImageIcon btnwpmod2 = new ImageIcon("img//정보수정버튼2.png");
		JButton PmodifyBtn = new JButton(btnwpmod1);
		PmodifyBtn.setContentAreaFilled(false);
		PmodifyBtn.setBorderPainted(false); // 버튼의 외곽선 없에기
		PmodifyBtn.setRolloverIcon(btnwpmod2);

		PmodifyBtn.addActionListener(new ActionListener() { // 버튼 수행동작
			public void actionPerformed(ActionEvent e) {

				new Frame_MyPage_UpdateP(m);

			}
		});
		PmodifyBtn.setBounds(40, 580, 125, 40);
		add(PmodifyBtn);

		ImageIcon btnlogout1 = new ImageIcon("img//로그아웃버튼1.png");
		ImageIcon btnlogout2 = new ImageIcon("img//로그아웃버튼2.png");
		JButton logoutBtn = new JButton(btnlogout1);
		logoutBtn.setContentAreaFilled(false);
		logoutBtn.setBorderPainted(false); // 버튼의 외곽선 없에기
		logoutBtn.setRolloverIcon(btnlogout2);

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame logout = new JFrame("로그아웃");

				logout.setVisible(true);
				logout.setSize(300, 200); // width, height
				logout.setLocationRelativeTo(null); // 화면 가운데 위치
				logout.setResizable(false); // 크기조절 X
				logout.getContentPane().setLayout(null);
				logout.setBackground(Color.white);
				JLabel LOlb = new JLabel("로그아웃하시겠습니까?");

				LOlb.setSize(300, 120);
				LOlb.setHorizontalAlignment(SwingConstants.CENTER);
				JButton LOb1 = new JButton("네");
				LOb1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						logout.dispose();
						Frame_Base.getInstance(new Frame_Login());
						;
					}
				});

				JButton LOb2 = new JButton("아니오");
				LOb2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						logout.dispose();
					}
				});
				LOb1.setBounds(40, 120, 90, 30);
				LOb2.setBounds(150, 120, 90, 30);
				logout.getContentPane().add(LOlb);
				logout.getContentPane().add(LOb1);
				logout.getContentPane().add(LOb2);

			}
		});
		logoutBtn.setBounds(185, 580, 125, 40);
		add(logoutBtn);

		ImageIcon btnwit1 = new ImageIcon("img//탈퇴버튼1.png");
		ImageIcon btnwit2 = new ImageIcon("img//탈퇴버튼2.png");
		JButton withdrawalBtn = new JButton(btnwit1);
		withdrawalBtn.setContentAreaFilled(false);
		withdrawalBtn.setBorderPainted(false); // 버튼의 외곽선 없에기
		withdrawalBtn.setRolloverIcon(btnwit2);

		withdrawalBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame Pwithdrawal = new JFrame("탈퇴");

				Pwithdrawal.setVisible(true);
				Pwithdrawal.setSize(300, 200); // width, height
				Pwithdrawal.setLocationRelativeTo(null); // 화면 가운데 위치
				Pwithdrawal.setResizable(false); // 크기조절 X
				Pwithdrawal.getContentPane().setLayout(null);
				Pwithdrawal.setBackground(Color.white);
				JLabel WDlb = new JLabel("정말로 탈퇴하시겠습니까?");
				WDlb.setOpaque(true);
				WDlb.setBackground(Color.white);
				WDlb.setSize(300, 120);

				WDlb.setHorizontalAlignment(SwingConstants.CENTER);
				JButton WDb1 = new JButton("네");
				WDb1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						Pwithdrawal.dispose();
						Frame_Base.getInstance(new Frame_Login());
						;
					}
				});
				JButton WDb2 = new JButton("아니오");
				WDb2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pwithdrawal.dispose();
					}
				});
				WDb1.setBounds(40, 120, 90, 30);
				WDb2.setBounds(150, 120, 90, 30);
				Pwithdrawal.add(WDlb);
				Pwithdrawal.add(WDb1);
				Pwithdrawal.add(WDb2);

			}
		});
		withdrawalBtn.setBounds(325, 580, 125, 40);
		add(withdrawalBtn);

		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
	}
}