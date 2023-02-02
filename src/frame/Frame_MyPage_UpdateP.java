package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import customDAO.*;

public class Frame_MyPage_UpdateP {

	public Frame_MyPage_UpdateP() {
	}

	public Frame_MyPage_UpdateP(MyInfo m) {
		// =============================================
		JFrame sf = new JFrame("정보수정");
		sf.setVisible(true);
		sf.setSize(500, 700);
		sf.setLocationRelativeTo(null);
		sf.getContentPane().setLayout(null);
		sf.getContentPane().setBackground(Color.WHITE);

		JLabel Spro = new JLabel();
		Spro.setOpaque(true);
		Spro.setBackground(Color.BLACK);
		Spro.setBounds(80, 40, 320, 60);

		JLabel SID1 = new JLabel(" 아이디   ");
		SID1.setOpaque(true);
		SID1.setBackground(Color.white);
		SID1.setBounds(90, 120, 50, 20);

		JLabel SID2 = new JLabel(UserInfo.UserInfoMap.get(m.getId()).getId());
		SID2.setBounds(90, 140, 300, 30);
		SID2.setLayout(null);

		// ============================================= 비번
		JLabel SPW1 = new JLabel("비밀번호 변경");
		SPW1.setOpaque(true);
		SPW1.setBackground(Color.white);
		SPW1.setBounds(90, 190, 90, 20);

		JPasswordField SPW2 = new JPasswordField(UserInfo.UserInfoMap.get(m.getId()).getPw(), 26);
		SPW2.setBounds(90, 210, 300, 30);

		// ============================================= 비확
		JLabel SPWch1 = new JLabel(" 비밀번호 재확인");
		SPWch1.setOpaque(true);
		SPWch1.setBackground(Color.white);
		SPWch1.setBounds(90, 260, 100, 20);

		JPasswordField SPWch2 = new JPasswordField(UserInfo.UserInfoMap.get(m.getId()).getPw(), 26);

		SPWch2.setBounds(90, 280, 300, 30);

		// ============================================= 이름
		JLabel Sname1 = new JLabel(" 이름");
		Sname1.setOpaque(true);
		Sname1.setBackground(Color.white);
		Sname1.setBounds(90, 330, 30, 20);

		JTextField Sname2 = new JTextField(UserInfo.UserInfoMap.get(m.getId()).getName(), 26);
		Sname2.setBounds(90, 350, 300, 30);

		// ============================================= 박스
		JLabel Sad1 = new JLabel(" 거주하고 있는 인근지역");
		Sad1.setOpaque(true);
		Sad1.setBackground(Color.white);
		Sad1.setBounds(90, 400, 300, 20);

		JPanel Sad = new JPanel();
		Sad.setOpaque(true);
		Sad.setBackground(Color.white);
		Sad.setBounds(90, 420, 300, 30);

		String[] optionsToChoose = { "------------------------------선택------------------------------", "광진구", "도봉구",
				"동대문구", "동작구", "마포구", "중구" };
		JComboBox<String> Sad2 = new JComboBox<String>(optionsToChoose);
		Sad2.setBounds(200, 430, 300, 20);
		Sad2.setSelectedIndex(UserInfo.UserInfoMap.get(m.getId()).getAddr());
		Sad.add(Sad2);
		// ============================================== 박스2
		JLabel Spet1 = new JLabel("반려견 유무 여부");
		Spet1.setOpaque(true);
		Spet1.setBackground(Color.WHITE);
		Spet1.setBounds(90, 470, 300, 20);

		// ============================================= 보유 여부 콤보박스
		JPanel Spet = new JPanel();
		Spet.setBackground(Color.WHITE);
		Spet.setBounds(90, 500, 300, 30);

		String[] optionsToChoose2 = { "------------------------------선택------------------------------", "있음", "없음" };
		JComboBox<String> Spet2 = new JComboBox<String>(optionsToChoose2);
		Spet2.setBounds(200, 430, 300, 20);
		Spet2.setSelectedIndex(UserInfo.UserInfoMap.get(m.getId()).getPet());
		Spet.add(Spet2);

		// ============================================= 버튼
		JButton Enroll1 = new JButton("저장하기");
		Enroll1.setBounds(120, 570, 90, 40);

		Enroll1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 저장하기 기능 구현 필요
				String pw = String.valueOf(SPW2.getPassword());
				String conpw = String.valueOf(SPWch2.getPassword());
				int addri = Sad2.getSelectedIndex();
				int peti = Spet2.getSelectedIndex();

				if (!(Sname2.getText().equals("") || String.valueOf(SPW2.getPassword()).equals("") || addri == 0
						|| peti == 0)) {
					if (!pw.equals(conpw)) {
						JOptionPane.showMessageDialog(null, "비밀번호를 확인 해주세요.");
					} else {
						UserInfo.UserInfoMap.get(m.getId()).setName(Sname2.getText());
						UserInfo.UserInfoMap.get(m.getId()).setPw(pw);
						UserInfo.UserInfoMap.get(m.getId()).setAddr(addri);
						UserInfo.UserInfoMap.get(m.getId()).setPet(addri);
						sf.dispose();
					}

				} else if (Sname2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.");
				} else if (pw.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				} else if (addri == 0) {
					JOptionPane.showMessageDialog(null, "주소를 선택해주세요.");
				} else {
					JOptionPane.showMessageDialog(null, "반려견 보유 여부를 선택해주세요.");
				}

			}
		});

		JButton Cancle1 = new JButton("나가기");
		Cancle1.setBounds(270, 570, 90, 40);

		Cancle1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sf.dispose();
			}
		});

		sf.add(Spro);// 프로젝트[라벨]
		sf.add(SID1);// 아이디[라벨]
		sf.add(SID2);// 아이디 [텍스트]
		sf.add(SPW1);// 비밀번호[라벨]
		sf.add(SPW2);// 비밀번호 [텍스트]
		sf.add(SPWch1);// 확인[라벨]
		sf.add(SPWch2);// 비밀번호 확인 [텍스트]
		sf.add(Sname1);// 이름[라벨]
		sf.add(Sname2);// 이름 [텍스트]
		sf.add(Spet1);// 보유여부 [라벨]
		sf.add(Spet);// 보유여부 [콤보박스]
		sf.add(Sad1);// 주소[라밸]
		sf.add(Sad);// 주소 [콤보박스]
		sf.add(Enroll1);// 가입하기 [버튼]
		sf.add(Cancle1);// 나가기 [버튼]

	}

}