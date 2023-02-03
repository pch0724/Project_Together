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

public class Frame_Home extends JPanel {

	static boolean save = false;
	DogInfo di = new DogInfo();
	private String DIARY_FOLDER = "Diary";

	public Frame_Home() {
	}

	public Frame_Home(MyInfo m, CartDAO cart, SellDAO history) {

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
		File file = new File(DIARY_FOLDER + "/" + m.getId());
		File fileList[] = file.listFiles();
		int fileLength = fileList.length;
		JLabel a = new JLabel("산책정보: " + fileLength + "번 산책했어요!");
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

		if (save == false) {

			// 반려동물 사진

			JLabel petphoto = new JLabel("반려동물사진");
			petphoto.setBounds(55, 145, 130, 130);
			petphoto.setOpaque(true);
			petphoto.setBackground(Color.LIGHT_GRAY);
			add(petphoto);

			// 내용
			JTextField n = new JTextField("등록해주세요");
			n.setHorizontalAlignment(SwingConstants.CENTER);
			n.setBounds(195, 145, 250, 130);
			n.setOpaque(true);
			n.setBackground(Color.LIGHT_GRAY);
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
				dogpic.setIcon(new ImageIcon("img//images.jpg"));
				dogpic.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
				dogpic.setBounds(55, 145, 130, 130); // 사진 위치 조절 x,y,w,h
				add(dogpic);
				break;
			}

			// 내용
			JTextArea n = new JTextArea(
					"사랑스런 우리 " + di.getdName() + "\r\n" + di.getdAge() + "살이에요" + di.getdGender() + di.getdChip());

			n.setBounds(195, 145, 250, 130);
			n.setOpaque(true);
			n.setBackground(Color.LIGHT_GRAY);
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
		JLabel workphoto = new JLabel("추천산책로");
		workphoto.setBounds(20, 365, 450, 300);
		workphoto.setOpaque(true);
		workphoto.setBackground(Color.LIGHT_GRAY);
		add(workphoto);

		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
	}

}
