
package frame;

import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame_MyPage_RegisterDog extends JFrame {

	public Frame_MyPage_RegisterDog() {
		// 프레임=======================
		JFrame jf = new JFrame("반려견 등록");
		jf.setVisible(true);

		jf.setSize(400, 550);
		jf.setLocationRelativeTo(null);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);

		// ==============================================

		JLabel Jpic1 = new JLabel(" 사진");
		Jpic1.setBounds(90, 90, 40, 30);
		Jpic1.setOpaque(true);

		JButton picin = new JButton("추가하기");
		picin.setBounds(90, 120, 220, 30);
		picin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
			}
		});

		// ==============================================
		// 라벨[이름]
		JLabel Jname1 = new JLabel(" 이름");
		Jname1.setBounds(90, 170, 40, 30);
		Jname1.setOpaque(true);
		// Jname1.setBackground(Color.red);

		// 텍스트 필드
		JPanel Jname = new JPanel();
		Jname.setBounds(80, 200, 240, 30);
		// Jname.setBackground(Color.blue);

		JTextField Jname2 = new JTextField(null, 18);

		Jname.add(Jname2);
		// ===================================================

		// 라벨[나이]
		JLabel Jage1 = new JLabel(" 나이");
		Jage1.setBounds(90, 250, 40, 30);
		Jage1.setOpaque(true);
		// Jage1.setBackground(Color.red);

		// 텍스트 필드
		JPanel Jage = new JPanel();
		Jage.setBounds(80, 280, 240, 30);
		// Jage.setBackground(Color.blue);

		JTextField Jage2 = new JTextField(null, 18);

		Jage.add(Jage2);
		// ===================================================

		// 라벨 성별
		JLabel Jgender1 = new JLabel(" 성별");
		Jgender1.setOpaque(true);
		// Jgender1.setBackground(Color.red);
		Jgender1.setBounds(90, 330, 40, 30);

		// 성별 라디오 버튼
		JPanel Jgender = new JPanel();
		// Jgender.setBackground(Color.BLUE);
		Jgender.setBounds(80, 360, 240, 40);

		JRadioButton JgenderFemale = new JRadioButton("암컷");
		JRadioButton JgenderMale = new JRadioButton("수컷");
		ButtonGroup JJgen = new ButtonGroup();

		JJgen.add(JgenderFemale);
		JJgen.add(JgenderMale);

		Jgender.add(JgenderFemale);
		Jgender.add(JgenderMale);
		// ===================================================
		
		// 등록 닫기 버튼
		
		JButton Enroll = new JButton("등록");
		Enroll.setBounds(90, 430, 80, 40);
		Enroll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String dName = Jname2.getText();
				int dAge = Integer.parseInt(Jage2.getText());
				 
				
				
				
				
				jf.dispose();
			}
		});

		JButton Cancle = new JButton("취소");
		Cancle.setBounds(230, 430, 80, 40);
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
		Jpro.setBounds(80, 15, 250, 80);
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
		jf.add(picin);
	}

}
