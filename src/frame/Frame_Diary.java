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
import javax.swing.JTextField;

import customDAO.CartDAO;
import customDAO.MyInfo;
import customDAO.SellDAO;

public class Frame_Diary extends JFrame {
	
	public Frame_Diary() {
	}
	
	public Frame_Diary(MyInfo m, CartDAO cart, SellDAO history) {

		JLabel w = new JLabel();
		
		setTitle("산책일지");
		setSize(700, 500);
		setLocationRelativeTo(null);
		getContentPane().add(w);
		setVisible(true);
		setResizable(false);
		
		ImageIcon back = new ImageIcon("img//배경화면.png");
		Image img = back.getImage();
		Image changeback = img.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
		ImageIcon back2 = new ImageIcon(changeback);

		w.setIcon(back2);
		w.setBounds(0, 0, 700, 500);
		w.setHorizontalAlignment(JLabel.CENTER);

		// 배경화면
		w.setBackground(Color.WHITE);
		w.setLayout(null);
		w.setSize(700, 500);

		// 제목
		JLabel t = new JLabel("제목");
		t.setBounds(10, 20, 30, 20);
		w.add(t);

		// 제목입력상자
		JTextField title = new JTextField(50);
		title.setBounds(60, 20, 400, 20);
		w.add(title);

		// 본문
		setLayout(null);
		JLabel text = new JLabel("내용");
		text.setBounds(10, 60, 30, 20);
		w.add(text);

		// 본문 입력상자
		JTextField maintext = new JTextField(50);
		maintext.setBounds(15, 100, 460, 300);
		w.add(maintext);

		// 등록버튼
		ImageIcon save1 = new ImageIcon("img//등록1.png");
		ImageIcon save2 = new ImageIcon("img//등록2.png");
		JButton btn1 = new JButton(save1);
		btn1.setRolloverIcon(save2);
		btn1.setBorderPainted(false); // 버튼의 외곽선 없에기
		btn1.setContentAreaFilled(false);
		btn1.setBounds(495, 20, 150, 60);
		w.add(btn1);


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
		w.add(btn2);
		
	}


}
