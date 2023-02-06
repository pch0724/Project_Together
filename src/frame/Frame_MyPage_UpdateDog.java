package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Button.RoundedButton;
import customDAO.CartDAO;
import customDAO.CustomDAO;
import customDAO.DogInfo;
import customDAO.MyInfo;
import customDAO.SellDAO;
import customDAO.UserInfo;

public class Frame_MyPage_UpdateDog extends JFrame {

	DogInfo di = new DogInfo();
	Frame_Home h = new Frame_Home();

	public Frame_MyPage_UpdateDog() {
	}

	public Frame_MyPage_UpdateDog(MyInfo m, CartDAO cart, SellDAO history) {

		// 프레임=======================
		JFrame jf = new JFrame("반려견 수정");
		jf.setVisible(true);

		jf.setSize(460, 700);
		jf.setLocationRelativeTo(null);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.getContentPane().setBackground(Color.WHITE);
		Font font2 = new Font("에스코어 드림 5 Medium", Font.PLAIN, 14);
		Font font3 = new Font("에스코어 드림 5 Medium", Font.PLAIN, 12);
		// ==============================================

		JLabel Jpic1 = new JLabel("프로필 선택");
		Jpic1.setBounds(115, 100, 90, 30);
		Jpic1.setFont(font2);
		Jpic1.setOpaque(true);
		Jpic1.setBackground(Color.WHITE);

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

		JRadioButton picinC1 = new JRadioButton("", true);
		picinC1.setBackground(Color.WHITE);
		picinC1.setBounds(80, 240, 20, 20);
		JRadioButton picinC2 = new JRadioButton("");
		picinC2.setBackground(Color.WHITE);
		picinC2.setBounds(172, 240, 20, 20);
		JRadioButton picinC3 = new JRadioButton("");
		picinC3.setBackground(Color.WHITE);
		picinC3.setBounds(264, 240, 20, 20);
		JRadioButton picinC4 = new JRadioButton("");
		picinC4.setBackground(Color.WHITE);
		picinC4.setBounds(356, 240, 20, 20);
		ButtonGroup picinC = new ButtonGroup();

		picinC.add(picinC1);
		picinC.add(picinC2);
		picinC.add(picinC3);
		picinC.add(picinC4);

		// ==============================================
		// 라벨[이름]
		JLabel Jname1 = new JLabel("이름");
		Jname1.setBounds(115, 275, 40, 30);
		Jname1.setFont(font2);
		Jname1.setOpaque(true);
		Jname1.setBackground(Color.WHITE);

		// 텍스트 필드
		JPanel Jname = new JPanel();
		Jname.setBounds(107, 305, 240, 30);
		Jname.setBackground(Color.WHITE);

		JTextField Jname2 = new JTextField(di.getdName(), 18);

		Jname.add(Jname2);
		// ===================================================

		// 라벨[나이]
		JLabel Jage1 = new JLabel("나이");
		Jage1.setBounds(115, 335, 40, 30);
		Jage1.setFont(font2);
		Jage1.setOpaque(true);
		Jage1.setBackground(Color.WHITE);

		// 텍스트 필드
		JPanel Jage = new JPanel();
		Jage.setBounds(107, 365, 240, 30);
		Jage.setBackground(Color.WHITE);

		JTextField Jage2 = new JTextField(di.getdAge(), 18);

		Jage.add(Jage2);
		// ===================================================

		// 라벨 성별
		JLabel Jgender1 = new JLabel("성별");
		Jgender1.setOpaque(true);
		Jgender1.setFont(font2);
		Jgender1.setBackground(Color.WHITE);
		Jgender1.setBounds(115, 395, 40, 30);

		// 성별 라디오 버튼
		JPanel Jgender = new JPanel();
		Jgender.setBackground(Color.WHITE);
		Jgender.setBounds(105, 425, 240, 40);

		JRadioButton JgenderFemale = new JRadioButton("암컷      ", true);
		JgenderFemale.setFont(font3);
		JgenderFemale.setBackground(Color.WHITE);
		JRadioButton JgenderMale = new JRadioButton("수컷");
		JgenderMale.setFont(font3);
		JgenderMale.setBackground(Color.WHITE);
		ButtonGroup JJgen = new ButtonGroup();

		JJgen.add(JgenderFemale);
		JJgen.add(JgenderMale);

		Jgender.add(JgenderFemale);
		Jgender.add(JgenderMale);
		// ===================================================

		JLabel Jchip1 = new JLabel("칩 등록 여부");
		Jchip1.setOpaque(true);
		Jchip1.setFont(font2);
		Jchip1.setBackground(Color.WHITE);
		Jchip1.setBounds(115, 465, 90, 30);

		// 성별 라디오 버튼
		JPanel Jchip = new JPanel();
		Jchip.setBackground(Color.WHITE);
		Jchip.setBounds(105, 495, 240, 40);

		JRadioButton JchipO = new JRadioButton("등록   ");
		JchipO.setBackground(Color.WHITE);
		JchipO.setFont(font3);
		JRadioButton JchipX = new JRadioButton("미등록", true);
		JchipX.setBackground(Color.WHITE);
		JchipX.setFont(font3);
		ButtonGroup JJchip = new ButtonGroup();

		JJchip.add(JchipO);
		JJchip.add(JchipX);

		Jchip.add(JchipO);
		Jchip.add(JchipX);

		// ===================================================

		// 등록 닫기 버튼

		RoundedButton Enroll = new RoundedButton("등록");
		Color c1 = new Color(255, 108, 0);
		Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);
		Enroll.setBackground(c1);
		Enroll.setFont(font);
		Enroll.setBounds(100, 565, 80, 40);
		Enroll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ((picinC1.isSelected()) || (picinC2.isSelected()) || (picinC3.isSelected())
						|| (picinC4.isSelected())) {

					if (!(Jname2.getText().equals("") || Jage2.getText().equals("")
							|| !(JgenderFemale.isSelected()) && !(JgenderMale.isSelected())
							|| !(JchipO.isSelected()) && !(JchipX.isSelected()))) {
						di.setdName(Jname2.getText());// 이름
						di.setdAge(Jage2.getText());// 나이

						if (JgenderFemale.isSelected()) {
							di.setdGender("여아");
						} else {
							di.setdGender("남아");
						} // 성별

						if (JchipO.isSelected()) {
							di.setdChip("등록");
						} else {
							di.setdChip("미등록");
						} // 칩
						if (picinC1.isSelected()) {
							di.setdPhoto(1);
						} else if (picinC2.isSelected()) {
							di.setdPhoto(2);
						} else if (picinC3.isSelected()) {
							di.setdPhoto(3);
						} else if (picinC4.isSelected()) {
							di.setdPhoto(4);
						}
						h.save = true;
						jf.dispose();
						Frame_Base.getInstance(new Frame_MyPage(m, cart, history));

					} else if (Jname2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
					} else if (Jage2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "나이를 입력하세요.");
					} else if (!(JgenderFemale.isSelected()) && !(JgenderMale.isSelected())) {
						JOptionPane.showMessageDialog(null, "성별을 선택하세요.");
					} else if (!(JchipO.isSelected()) && !(JchipX.isSelected())) {
						JOptionPane.showMessageDialog(null, "칩 유무를 선택하세요.");
					}
				} else
					JOptionPane.showMessageDialog(null, "사진을 선택하세요.");

				/*
				 * if(picinC1.isSelected()) { di.setdPhoto(1); }else if(picinC2.isSelected()) {
				 * di.setdPhoto(2); }else if(picinC3.isSelected()) { di.setdPhoto(3); }else
				 * if(picinC4.isSelected()){ di.setdPhoto(4); }
				 */

				// 사진

			}
		});
		RoundedButton Cancle = new RoundedButton("취소");
		Cancle.setBackground(c1);
		Cancle.setFont(font);
		Cancle.setBounds(270, 565, 80, 40);
		Cancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
			}
		});

		// 로고
		ImageIcon logophoto = new ImageIcon("img\\투개더로고2.png");
		Image img = logophoto.getImage();
		Image changelogophoto = img.getScaledInstance(250, 80, Image.SCALE_SMOOTH);
		ImageIcon logophoto2 = new ImageIcon(changelogophoto);
		JLabel Jpro = new JLabel(logophoto2);
		Jpro.setHorizontalAlignment(SwingConstants.CENTER);// 사진정렬-가운데
		Jpro.setBounds(105, 15, 250, 80);
		Jpro.setOpaque(true);
		Jpro.setBackground(Color.GRAY);

		jf.add(Jpro);// 프로젝트[라벨]
		jf.add(Jpic1);
		jf.add(Jname1);// 반려견 이름[라벨]
		jf.add(Jage1);// 반려견 나이[라벨]
		jf.add(Jgender1);// 반려견 성별[라벨]
		jf.add(Jname);// 이름 텍스트 필드
		jf.add(Jage);// 나이 텍스트 필드
		jf.add(Jgender);// 성별 텍스트 버튼
		jf.add(Enroll);
		jf.add(Cancle);
		jf.add(picinC1);// 사진 라디오
		jf.add(picinC2);// 사진 라디오
		jf.add(picinC3);// 사진 라디오
		jf.add(picinC4);// 사진 라디오
		jf.add(picin1);// 사진 버튼이미지
		jf.add(picin2);// 사진 버튼이미지
		jf.add(picin3);// 사진 버튼이미지
		jf.add(picin4);// 사진 버튼이미지
		jf.add(Jchip1);
		jf.add(Jchip);

	}

}
