package frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame_Login extends JPanel {

	public Frame_Login() {

		// JPanel 구조
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(450, 600);

		// 로고
		ImageIcon logophoto = new ImageIcon("투개더로고2.png");
		Image img = logophoto.getImage();
		Image changelogophoto = img.getScaledInstance(250, 80, Image.SCALE_SMOOTH);
		ImageIcon logophoto2 = new ImageIcon(changelogophoto);
		JLabel logo = new JLabel(logophoto2);
		logo.setHorizontalAlignment(SwingConstants.CENTER);// 사진정렬-가운데
		logo.setBounds(115, 200, 250, 80);
		logo.setOpaque(true);
		logo.setBackground(Color.GRAY);
		add(logo);

		// 라벨 ID
		JLabel ID = new JLabel("ID : ");
		ID.setSize(450, 100);
		ID.setLocation(95, 250);

		// ID 입력상자
		JTextField txtId = new JTextField(20);
		txtId.setSize(150, 30);
		txtId.setLocation(150, 289);
		// 입력 후 삭제 및 처음으로 포커스 옮김 필요

		add(ID);
		add(txtId);

		// 라벨 PW
		JLabel PW = new JLabel("PW : ");
		PW.setSize(450, 100);
		PW.setLocation(86, 300);

		// PW 입력상자
		JPasswordField txtPw = new JPasswordField(20);
		txtPw.setSize(150, 30);
		txtPw.setLocation(150, 339);

		add(PW);
		add(txtPw);

		//

		JLabel btn = new JLabel("");
		btn.setSize(450, 100);
		btn.setLocation(0, 400);
		btn.setLayout(new FlowLayout());

		// 로그인, 회원가입, ID/PW 찾기
		// 로그인버튼
		ImageIcon ImgLogin1 = new ImageIcon("로그인1.png");
		ImageIcon ImgLogin2 = new ImageIcon("로그인2.png");
		JButton btnLogin = new JButton(ImgLogin1);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnLogin.setRolloverIcon(ImgLogin2);

		// 회원가입버튼
		ImageIcon ImgInit1 = new ImageIcon("회원가입1.png");
		ImageIcon ImgInit2 = new ImageIcon("회원가입2.png");
		JButton btnInit = new JButton(ImgInit1);
		btnInit.setContentAreaFilled(false);
		btnInit.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnInit.setRolloverIcon(ImgInit2);

		// 아이디찾기버튼
		ImageIcon ImgIdFind1 = new ImageIcon("ID찾기1.png");
		ImageIcon ImgIdFind2 = new ImageIcon("ID찾기2.png");
		JButton btnIdFind = new JButton(ImgIdFind1);
		btnIdFind.setContentAreaFilled(false);
		btnIdFind.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnIdFind.setRolloverIcon(ImgIdFind2);

		// 패스워드찾기버튼
		ImageIcon ImgPwFind1 = new ImageIcon("PW찾기1.png");
		ImageIcon ImgPwFind2 = new ImageIcon("PW찾기2.png");
		JButton btnPwFind = new JButton(ImgPwFind1);
		btnPwFind.setContentAreaFilled(false);
		btnPwFind.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnPwFind.setRolloverIcon(ImgPwFind2);

		btnLogin.setSize(85, 30);
		btnInit.setSize(85, 30);
		btnIdFind.setSize(85, 30);
		btnPwFind.setSize(85, 30);

		add(btn);
		btn.add(btnLogin);
		btn.add(btnInit);
		btn.add(btnIdFind);
		btn.add(btnPwFind);

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {// ID PW 일치여부 확인 필요
				Frame_Base.getInstance(new Frame_Home());
			}
		});

		btnInit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Login_Register();
			}
		});

	}

}