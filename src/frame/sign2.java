package frame;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class sign2 {
	
	public sign2() {
		// =============================================
		JFrame sf = new JFrame(" 회원가입");
		sf.setVisible(true);
		sf.setSize(500, 700);
		sf.setLocationRelativeTo(null);
		//sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sf.getContentPane().setLayout(null);
		// ============================================= 아디
		JLabel Spro = new JLabel();
		Spro.setOpaque(true);
		Spro.setBackground(Color.BLACK);
		Spro.setBounds(80, 40, 320, 60);
		
		JLabel SID1 = new JLabel(" 아이디   ");
		SID1.setOpaque(true);
		SID1.setBounds(90, 120, 50, 20);

		JPanel SID = new JPanel();
		SID.setOpaque(true);
		SID.setBounds(90, 140, 300, 30);

		JTextField SID2 = new JTextField(null, 32);
		SID.add(SID2);
		// ============================================= 비번
		JLabel SPW1 = new JLabel(" 비밀번호 ");
		SPW1.setOpaque(true);
		SPW1.setBounds(90, 190, 60, 20);

		JPanel SPW = new JPanel();
		SPW.setOpaque(true);
		SPW.setBounds(90, 210, 300, 30);

		JPasswordField SPW2 = new JPasswordField(null, 32);
		SPW.add(SPW2);
		// ============================================= 비확
		JLabel SPWch1 = new JLabel(" 비밀번호 재확인");
		SPWch1.setOpaque(true);
		SPWch1.setBounds(90, 260, 100, 20);

		JPanel SPWch = new JPanel();
		SPWch.setOpaque(true);
		SPWch.setBounds(90, 280, 300, 30);

		JPasswordField SPWch2 = new JPasswordField(null, 32);
		SPWch.add(SPWch2);
		// ============================================= 이름
		JLabel Sname1 = new JLabel(" 이름");
		Sname1.setOpaque(true);
		Sname1.setBounds(90, 330, 30, 20);

		JPanel Sname = new JPanel();
		Sname.setOpaque(true);
		Sname.setBounds(90, 350, 300, 30);

		JTextField Sname2 = new JTextField(null, 32);
		Sname.add(Sname2);
		// ============================================= 생년
		JLabel Sbir1 = new JLabel(" 생년월일");
		Sbir1.setOpaque(true);
		Sbir1.setBounds(90, 400, 60, 20);

		JPanel Sbir = new JPanel();
		Sbir.setOpaque(true);
		Sbir.setBounds(90, 420, 300, 30);

		JTextField Sbir2 = new JTextField(null, 32);
		Sbir.add(Sbir2);
		// ============================================= 박스
		JLabel Sad1 = new JLabel(" 거주하고 있는 인근지역");
		Sad1.setOpaque(true);
		Sad1.setBounds(90, 470, 140, 20);

		JPanel Sad = new JPanel();
		Sad.setOpaque(true);
		Sad.setBounds(90, 490, 300, 40);

		String[] optionsToChoose = { "------------------------------선택------------------------------", "광진구", "도봉구",
				"동대문구", "동작구", "마포구", "중구" };
		JComboBox<String> Sad2 = new JComboBox<String>(optionsToChoose);
		Sad2.setBounds(200, 430, 300, 20);
		Sad.add(Sad2);
		// ============================================= 버튼
		JButton Enroll1 = new JButton("가입하기");
		Enroll1.setBounds(120, 570, 90, 40);
		/*
		Enroll1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		*/
		JButton Cancle1 = new JButton("나가기");
		Cancle1.setBounds(270, 570, 90, 40);
		/*
		Cancle1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		*/
		sf.add(Spro);// 프로젝트[라벨]
		sf.add(SID1);// 아이디[라벨]
		sf.add(SID);// 아이디 [텍스트]
		sf.add(SPW1);// 비밀번호[라벨]
		sf.add(SPW);// 비밀번호 [텍스트]
		sf.add(SPWch1);// 확인[라벨]
		sf.add(SPWch);// 비밀번호 확인 [텍스트]
		sf.add(Sname1);// 이름[라벨]
		sf.add(Sname);// 이름 [텍스트]
		sf.add(Sbir1);// 생년월일[라벨]
		sf.add(Sbir);// 생년월일 [텍스트]
		sf.add(Sad1);// 주소[라밸]
		sf.add(Sad);// 주소 [콤보박스]
		sf.add(Enroll1);// 가입하기 [버튼]
		sf.add(Cancle1);// 나가기 [버튼]

	}

}
