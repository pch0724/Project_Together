package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import customDAO.CartDAO;
import customDAO.DogInfo;
import customDAO.MyInfo;
import customDAO.SellDAO;
import customDAO.UserInfo;

public class Frame_Home extends JPanel {

	static boolean save = false;
	DogInfo di = new DogInfo();
	private String DIARY_FOLDER = "Diary";

	public Frame_Home() {
	}

	public Frame_Home(MyInfo m, CartDAO cart, SellDAO history) {

		Font font3 = new Font("에스코어 드림 5 Medium", Font.PLAIN, 13);
		// JPanel 구조
		setSize(500, 730);
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

		// 산책일지 정보
		Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 16);
		File file = new File(DIARY_FOLDER + "/" + m.getId());
		File fileList[] = file.listFiles();
		int fileLength = fileList.length;
		JLabel a = new JLabel("산책정보: " + fileLength + "번 산책했어요!");
		a.setFont(font);
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setBounds(115, 105, 250, 30);
		a.setOpaque(true);
		a.setBackground(Color.WHITE);
		add(a);

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
		
		// TextArea 부가 도구
		ImageIcon nTag = new ImageIcon("img\\nametag.png");
		Image img1 = nTag.getImage();
		img1.getScaledInstance(50, 25, Image.SCALE_SMOOTH);
		
		ImageIcon aTag = new ImageIcon("img\\agetag.png");
		Image img2 = nTag.getImage();
		img2.getScaledInstance(50, 25, Image.SCALE_SMOOTH);
		
		ImageIcon gTag = new ImageIcon("img\\gendertag.png");
		Image img3 = nTag.getImage();
		img3.getScaledInstance(50, 25, Image.SCALE_SMOOTH);
		
		ImageIcon cTag = new ImageIcon("img\\chiptag.png");			
		Image img4 = nTag.getImage();
		img4.getScaledInstance(50, 25, Image.SCALE_SMOOTH);

		JLabel name = new JLabel(nTag);
		JLabel age = new JLabel(aTag);
		JLabel gender = new JLabel(gTag);
		JLabel chip = new JLabel(cTag);
		
		name.setBounds(200, 155, 80, 32);
		age.setBounds(200, 185, 80, 32);
		gender.setBounds(200, 215, 80, 32);
		chip.setBounds(200, 245, 80, 32);
		
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
		
		if (save == false) {
			
			// 반려동물 사진
			ImageIcon PICD = new ImageIcon("img\\images.png");
			
			
			JLabel petphoto = new JLabel(PICD);
			petphoto.setBounds(55, 145, 130, 130);
			petphoto.setOpaque(true);
			petphoto.setBackground(Color.white);
			add(petphoto);

			
			
			// 내용
			JTextArea n = new JTextArea("" + "\r\n" + "\r\n" + ""  + "\r\n" + "\r\n" + ""  + "\r\n" + "\r\n" + "");
			n.setBounds(285, 158, 130, 130);
			n.setOpaque(true);
			n.setBackground(Color.white);
			n.setEditable(false);
			add(n);
		} else {
			// 반려동물 사진
			// 사진 label
			switch (DogInfo.getdPhoto()) {
			case 1:
				JLabel dogpic1 = new JLabel("");
				dogpic1.setIcon(new ImageIcon("img//강아지1.png"));
				dogpic1.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
				dogpic1.setBounds(55, 145, 130, 130); // 사진 위치 조절 x,y,w,h
				add(dogpic1);
				break;

			case 2:
				JLabel dogpic2 = new JLabel("");
				dogpic2.setIcon(new ImageIcon("img//강아지2.png"));
				dogpic2.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
				dogpic2.setBounds(55, 145, 130, 130); // 사진 위치 조절 x,y,w,h
				add(dogpic2);
				break;

			case 3:
				JLabel dogpic3 = new JLabel("");
				dogpic3.setIcon(new ImageIcon("img//강아지3.png"));
				dogpic3.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
				dogpic3.setBounds(55, 145, 130, 130); // 사진 위치 조절 x,y,w,h
				add(dogpic3);
				break;

			case 4:
				JLabel dogpic4 = new JLabel("");
				dogpic4.setIcon(new ImageIcon("img//강아지4.png"));
				dogpic4.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
				dogpic4.setBounds(55, 145, 130, 130); // 사진 위치 조절 x,y,w,h
				add(dogpic4);
				break;

			default:
				JLabel dogpic = new JLabel("");
				dogpic.setIcon(new ImageIcon("img//images.png"));
				dogpic.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
				dogpic.setBounds(55, 145, 130, 130); // 사진 위치 조절 x,y,w,h
				add(dogpic);
				break;
			}
			
			// TextArea
			JTextArea n = new JTextArea(
					di.getdName() + "\r\n" + "\r\n" + di.getdAge() + "\r\n" + "\r\n" + di.getdGender() + "\r\n" +  "\r\n" + di.getdChip());
			n.setFont(font3);
			n.setBounds(285, 158, 130, 130);
			n.setOpaque(true);
			n.setBackground(Color.white);
			n.setEditable(false);
			add(n);
		}

		// 산책일지
		ImageIcon day = new ImageIcon("img\\산책일지.png");
		ImageIcon day2 = new ImageIcon("img\\산책일지2.png");
		JButton btnday = new JButton(day);
		btnday.setRolloverIcon(day2);
		btnday.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnday.setBounds(170, 300, 130, 45);
		add(btnday);

		btnday.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Diary(m, cart, history);
			}
		});
		
		// 추천산책로사진
		ImageIcon walk1 = new ImageIcon("img\\산 광진5.png");
		ImageIcon walk2 = new ImageIcon("img\\산 도봉5.png");
		ImageIcon walk3 = new ImageIcon("img\\산 동대문5.png");
		ImageIcon walk4 = new ImageIcon("img\\산 동작5.png");
		ImageIcon walk5 = new ImageIcon("img\\산 마포5.png");
		ImageIcon walk6 = new ImageIcon("img\\산 중구5.png");
		
		
		// 추천산책로
		switch (UserInfo.UserInfoMap.get(m.getId()).getAddr()) {
		case 1:
			JLabel workphoto1 = new JLabel("추천산책로");
			workphoto1.setIcon(walk1);
			workphoto1.setBounds(20, 365, 450, 300);
			workphoto1.setOpaque(true);
			workphoto1.setBackground(Color.white);
			add(workphoto1);
			
			break;

		case 2:
			JLabel workphoto2 = new JLabel("추천산책로");
			workphoto2.setIcon(walk2);
			workphoto2.setBounds(20, 365, 450, 300);
			workphoto2.setOpaque(true);
			workphoto2.setBackground(Color.white);
			add(workphoto2);
			
			break;
			
		case 3:
			JLabel workphoto3 = new JLabel("추천산책로");
			workphoto3.setIcon(walk3);
			workphoto3.setBounds(20, 365, 450, 300);
			workphoto3.setOpaque(true);
			workphoto3.setBackground(Color.white);
			add(workphoto3);
			
			break;
			
		case 4:
			JLabel workphoto4 = new JLabel("추천산책로");
			workphoto4.setIcon(walk4);
			workphoto4.setBounds(20, 365, 450, 300);
			workphoto4.setOpaque(true);
			workphoto4.setBackground(Color.white);
			add(workphoto4);
			
			break;
			
		case 5:
			JLabel workphoto5 = new JLabel("추천산책로");
			workphoto5.setIcon(walk5);
			workphoto5.setBounds(20, 365, 450, 300);
			workphoto5.setOpaque(true);
			workphoto5.setBackground(Color.white);
			add(workphoto5);
			
			break;
				
		case 6:
			JLabel workphoto6 = new JLabel("추천산책로");
			workphoto6.setIcon(walk6);
			workphoto6.setBounds(20, 365, 450, 300);
			workphoto6.setOpaque(true);
			workphoto6.setBackground(Color.white);
			add(workphoto6);
			
			break;
		}
		

		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
	}

}
