package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import customDAO.CartDAO;
import customDAO.MyInfo;
import customDAO.SellDAO;

public class Frame_Diary extends JFrame {

	private String DIARY_FOLDER = "Diary";

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
		Image dog2 = dog1.getScaledInstance(240, 258, Image.SCALE_SMOOTH);
		ImageIcon dog3 = new ImageIcon(dog2);

		JLabel w = new JLabel(dog3);
		w.setBounds(470, 230, 230, 250);
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
		Border lineBorder = BorderFactory.createLineBorder(Color.black, 2);
		maintext.setBorder(BorderFactory(lineBorder));
		ff.add(maintext);

		// 등록버튼
		ImageIcon save1 = new ImageIcon("img//등록1.png");
		ImageIcon save2 = new ImageIcon("img//등록2.png");
		JButton btn1 = new JButton(save1);
		btn1.setRolloverIcon(save2);
		btn1.setBorderPainted(false); // 버튼의 외곽선 없에기
		// 투명하게
		btn1.setContentAreaFilled(false);
		// 버튼의 위치와 크기지정
		btn1.setBounds(495, 20, 150, 60);
		// 버튼에 액션리스너를 붙이기
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String titleText = title.getText();
				String contents = maintext.getText();
				String memberId = m.getId();

				// 다이어리 제목과 내용이 작성되어 있는 경우
				if (!"".equals(titleText) && !"".equals(contents)) {
					// 로그인한 사용자의 폴더 가져옴
					File dir = new File(DIARY_FOLDER + "/" + memberId);
					// 폴더가 존재하는지 체크
					if (!dir.exists()) {
						// 존재하지 않으면 폴더 생성
						dir.mkdir();
					}

					// 해당 폴더에 저장되어 있는 파일목록 가져옴
					File files[] = dir.listFiles();
					// 파일 개수
					int fileCount = files.length;
					String fileTitle = "";
					// 파일 개수 + 1로 파일명
					if (fileCount == 0)
						fileTitle = "1";
					else
						fileTitle = (fileCount + 1) + "";

					try {
						// 제목과 내용을 ###으로 구분하여 파일에 입력
						String save = "";
						save = save + titleText + "###" + contents;
						BufferedWriter bw;
						bw = new BufferedWriter(new OutputStreamWriter(
								new FileOutputStream(DIARY_FOLDER + "/" + memberId + "/" + fileTitle + ".txt"),
								"utf-8"));
						bw.write(save);
						bw.close();
						JOptionPane.showMessageDialog(null, "등록되었습니다.");
					} catch (Exception e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "오류가 발생하였습니다.");
					} finally {
						title.setText("");
						maintext.setText("");
					}
					ff.dispose();
				}
			}
		});
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
				ff.dispose();

			}
		});
		ff.add(btn2);

		ff.setResizable(false);

	}

	private Border BorderFactory(Border lineBorder) {
		// TODO Auto-generated method stub
		return null;
	}

}