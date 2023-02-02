package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import customDAO.CartDAO;
import customDAO.MyInfo;
import customDAO.SellDAO;

public class Frame_Diary extends JFrame {

	public Frame_Diary() {
	}

	public Frame_Diary(MyInfo m, CartDAO cart, SellDAO history) {

		JFrame ff = new JFrame();
		ff.setVisible(true);
		ff.setSize(700, 500);
		ff.setLocationRelativeTo(null);
		// pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ff.getContentPane().setLayout(null);
		ff.getContentPane().setLayout(null);
		ff.getContentPane().setBackground(Color.WHITE);

		// 배경화면
		ImageIcon dog = new ImageIcon("img//배경화면.png");
		Image dog1 = dog.getImage();
		Image dog2 = dog1.getScaledInstance(250, 260, Image.SCALE_SMOOTH);
		ImageIcon dog3 = new ImageIcon(dog2);

		JLabel w = new JLabel(dog3);
		w.setBounds(465, 230, 250, 250);
		w.setLayout(null);
		ff.add(w);

		// 제목
		JLabel t = new JLabel("제목");
		t.setBounds(10, 20, 30, 20);
		ff.add(t);

		// 제목입력상자
		JTextField title = new JTextField(30);
		title.setBounds(60, 20, 400, 20);
		ff.add(title);

		// 본문
		setLayout(null);
		JLabel text = new JLabel("내용");
		text.setBounds(10, 60, 30, 20);
		ff.add(text);

		// 본문 입력상자
		JTextArea maintext = new JTextArea("", 3, 100);
		maintext.setBackground(Color.lightGray);
		maintext.setBounds(15, 100, 460, 290);
		ff.add(maintext);

		// 등록버튼
		ImageIcon save1 = new ImageIcon("img//등록1.png");
		ImageIcon save2 = new ImageIcon("img//등록2.png");
		JButton btn1 = new JButton(save1);
		btn1.setRolloverIcon(save2);
		btn1.setBorderPainted(false); // 버튼의 외곽선 없에기
		btn1.setContentAreaFilled(false);
		btn1.setBounds(495, 20, 150, 60);
		ff.add(btn1);

		// 취소버튼
		ImageIcon cancel1 = new ImageIcon("img//취소1.png");
		ImageIcon cancel2 = new ImageIcon("img//취소2.png");
		JButton btn2 = new JButton(cancel1);
		btn2.setRolloverIcon(cancel2);
		btn2.setBorderPainted(false); // 버튼의 외곽선 없에기
		btn2.setContentAreaFilled(false); // 투명 버튼
		btn2.setBounds(495, 100, 150, 60);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		ff.add(btn2);

	}

}
