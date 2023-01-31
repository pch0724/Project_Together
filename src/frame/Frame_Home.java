package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame_Home extends JPanel {

	public Frame_Home() {

		// JPanel 구조
		setSize(500, 730);
		setBackground(Color.WHITE);
		setLayout(null);

		// 로고 라벨
		ImageIcon logophoto = new ImageIcon("투개더로고2.png");
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
		JLabel a = new JLabel("산책정보: 오늘은 30km만큼 산책했어요");
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setBounds(115, 105, 250, 30);
		a.setOpaque(true);
		a.setBackground(Color.WHITE);
		add(a);

		// 반려동물 사진
		JLabel petphoto = new JLabel("반려동물사진");
		petphoto.setBounds(55, 145, 130, 130);
		petphoto.setOpaque(true);
		petphoto.setBackground(Color.LIGHT_GRAY);
		add(petphoto);

		// 내용
		JLabel n = new JLabel("이름: 개솜이" + "\n" + " 나이: 4살 " + "\n" + " 성별: 여");
		n.setHorizontalAlignment(SwingConstants.CENTER);
		n.setBounds(195, 145, 250, 130);
		n.setOpaque(true);
		n.setBackground(Color.LIGHT_GRAY);
		add(n);
		// 산책일지
		ImageIcon day = new ImageIcon("산책일지.png");
		ImageIcon day2 = new ImageIcon("산책일지2.png");
		JButton btnday = new JButton(day);
		btnday.setRolloverIcon(day2);
		btnday.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnday.setBounds(170, 300, 130, 45);
		add(btnday);

		// 추천산책로사진
		JLabel workphoto = new JLabel("추천산책로");
		workphoto.setBounds(20, 365, 450, 300);
		workphoto.setOpaque(true);
		workphoto.setBackground(Color.LIGHT_GRAY);
		add(workphoto);

		Bottom_Button bb = new Bottom_Button();
		add(bb);
	}

}
