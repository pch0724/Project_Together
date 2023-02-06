package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

import customDAO.CartDAO;
import customDAO.CustomDAO;
import customDAO.DogInfo;
import customDAO.MyInfo;
import customDAO.SellDAO;
import customDAO.UserInfo;

public class Frame_MyPage extends JPanel {

	private String DIARY_FOLDER = "Diary";
	DogInfo di = new DogInfo();

	public Frame_MyPage() {
	}

	public Frame_MyPage(MyInfo m, CartDAO cart, SellDAO history) {

		Font font3 = new Font("에스코어 드림 5 Medium", Font.PLAIN, 13);
		
		// 기본 패널 설정
		setLayout(null);
		// JPanel nav = new JPanel();
		// nav.setBounds(0, 0, 450, 480);
		setSize(450, 480);
		// nav.setBackground(Color.GREEN);
		setBackground(Color.white);
		
		ImageIcon nTag = new ImageIcon("img\\nametag.png");
		ImageIcon aTag = new ImageIcon("img\\agetag.png");
		ImageIcon gTag = new ImageIcon("img\\gendertag.png");
		ImageIcon cTag = new ImageIcon("img\\chiptag.png");
		
		// 반려견 정보 라벨
		JLabel name = new JLabel(nTag);
		JLabel age = new JLabel(aTag);
		JLabel gender = new JLabel(gTag);
		JLabel chip = new JLabel(cTag);

		name.setBounds(230, 72, 80, 32);
		age.setBounds(230, 104, 80, 32);
		gender.setBounds(230, 136, 80, 32);
		chip.setBounds(230, 168, 80, 32);
		
		name.setOpaque(true);
		name.setBackground(Color.black);
		age.setOpaque(true);
		age.setBackground(Color.red);
		gender.setOpaque(true);
		gender.setBackground(Color.black);
		chip.setOpaque(true);
		chip.setBackground(Color.red);
		
		add(name);
		add(age);
		add(gender);
		add(chip);

		if (di.getdName() == null) {
			JTextArea Dinfo = new JTextArea("" + "\r\n" + "\r\n" + "" + "\r\n" + "\r\n" + "" + "\r\n" + "\r\n" + "");
			Dinfo.setBounds(330, 80, 190, 130);
			Dinfo.setOpaque(true);
			Dinfo.setBackground(Color.white);
			Dinfo.setEditable(false);
			add(Dinfo);
		} else {
			JTextArea Dinfo = new JTextArea(di.getdName() + "\r\n" + "\r\n" + di.getdAge() + "\r\n"
					+ "\r\n" + di.getdGender() + "\r\n" + "\r\n" + di.getdChip());
			Dinfo.setFont(font3);
			Dinfo.setBounds(330, 80, 190, 130);
			Dinfo.setOpaque(true);
			Dinfo.setBackground(Color.white);
			Dinfo.setEditable(false);
			add(Dinfo);

		}

		// 프로필 사진
		ImageIcon PIC1 = new ImageIcon("img\\강아지1.png");
		JButton picin1 = new JButton(PIC1);
		picin1.setBounds(42, 140, 90, 90);
		picin1.setBorderPainted(false);
		ImageIcon PIC2 = new ImageIcon("img\\강아지2.png");
		JButton picin2 = new JButton(PIC2);
		picin2.setBounds(134, 140, 90, 90);
		picin2.setBorderPainted(false);
		ImageIcon PIC3 = new ImageIcon("img\\강아지3.png");
		JButton picin3 = new JButton(PIC3);
		picin3.setBounds(226, 140, 90, 90);
		picin3.setBorderPainted(false);
		ImageIcon PIC4 = new ImageIcon("img\\강아지4.png");
		JButton picin4 = new JButton(PIC4);
		picin4.setBounds(317, 140, 90, 90);
		picin4.setBorderPainted(false);

		// 사진 label
		switch (DogInfo.getdPhoto()) {
		case 1:
			JLabel dogpic1 = new JLabel("");
			dogpic1.setIcon(new ImageIcon("img//강아지1.png"));
			dogpic1.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
			dogpic1.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
			add(dogpic1);
			break;

		case 2:
			JLabel dogpic2 = new JLabel("");
			dogpic2.setIcon(new ImageIcon("img//강아지2.png"));
			dogpic2.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
			dogpic2.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
			add(dogpic2);
			break;

		case 3:
			JLabel dogpic3 = new JLabel("");
			dogpic3.setIcon(new ImageIcon("img//강아지3.png"));
			dogpic3.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
			dogpic3.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
			add(dogpic3);
			break;

		case 4:
			JLabel dogpic4 = new JLabel("");
			dogpic4.setIcon(new ImageIcon("img//강아지4.png"));
			dogpic4.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
			dogpic4.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
			add(dogpic4);
			break;

		default:
			JLabel dogpic = new JLabel("");
			dogpic.setIcon(new ImageIcon("img//images2.png"));
			dogpic.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
			dogpic.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
			add(dogpic);
			break;
		}

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
				if (Frame_Home.save == false)
					JOptionPane.showMessageDialog(null, "등록된 반려견이 없습니다");
				else
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

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Diary(m, cart, history);
			}
		});

		writediary.setBounds(325, 230, 125, 40);
		add(writediary);

		// Jtable
		String Heder[] = { "제목", "내용" };

		// START
		File file = new File(DIARY_FOLDER + "/" + m.getId());
		File fileList[] = file.listFiles();
		int fileLength = fileList.length;
		int count = fileLength;
		String[][] list = new String[fileLength][2];

		int i = 0;
		for (File diary : fileList) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(diary, Charset.forName("UTF-8")));
				String text = reader.readLine();
				String[] textArr = text.split("###");
				list[i][0] = textArr[0];
				list[i][1] = textArr[1];
				++i;
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		// 게시판
		Color c1 = new Color(255, 156, 0);
		Color c2 = new Color(255, 230, 129);

		JTable table = new JTable(list, Heder);
		table.getColumnModel().getColumn(0).setMaxWidth(200);
		table.getColumnModel().getColumn(0).setMinWidth(120);
		JScrollPane s = new JScrollPane(table);
		s.setBounds(40, 290, 400, 270);
		JTableHeader theader = table.getTableHeader();
		theader.setBackground(c1);
		theader.setForeground(Color.WHITE);
		theader.setFont(new Font("에스코어 드림 5 Medium", Font.BOLD, 15));
		table.setBackground(c2);
		table.setFont(new Font("에스코어 드림 5 Medium", Font.PLAIN, 12));
		add(s);

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
						di.setdName("");
						di.setdAge("");
						di.setdGender("");
						di.setdChip("");
						di.setdPhoto(0);
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
						CustomDAO rd = new CustomDAO();
						
						rd.removeCustomer(m.toString());
						//System.out.println(m.toString());
						Pwithdrawal.dispose();
						di.setdName("");
						di.setdAge("");
						di.setdGender("");
						di.setdChip("");
						di.setdPhoto(0);
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