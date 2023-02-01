package frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import customDAO.*;

public class Frame_Login extends JPanel {

	public Frame_Login() {
		
		CustomDAO custom = new CustomDAO();
		
		// JPanel 구조
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(450, 600);

		// 로고
		ImageIcon logophoto = new ImageIcon("img\\투개더로고2.png");
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
		txtId.setText("아이디");
		txtId.setForeground(Color.gray);
		txtId.setSize(150, 30);
		txtId.setLocation(150, 289);
		
		// 입력 후 삭제 및 처음으로 포커스 옮김 필요
		txtId.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String id = txtId.getText();
				if (id.equals("아이디")) {
					txtId.setForeground(Color.BLACK);
					txtId.setText("");
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				String id = txtId.getText();
				if(id.equals("")) {
					txtId.setText("아이디");
					txtId.setForeground(Color.gray);
				}
				
			}
		});
		
		add(ID);
		add(txtId);

		// 라벨 PW
		JLabel PW = new JLabel("PW : ");
		PW.setSize(450, 100);
		PW.setLocation(86, 300);

		// PW 입력상자
		JPasswordField txtPw = new JPasswordField(20);
		txtPw.setText("비밀번호");
		txtPw.setForeground(Color.gray);
		txtPw.setSize(150, 30);
		txtPw.setLocation(150, 339);

		add(PW);
		add(txtPw);

		// 입력 후 삭제 및 처음으로 포커스 옮김 필요
		txtPw.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String pw = String.valueOf(txtPw.getPassword());
				if (pw.equals("비밀번호")) {
					txtPw.setForeground(Color.BLACK);
					txtPw.setText("");
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				String pw = String.valueOf(txtPw.getPassword());
				if(pw.equals("")) {
					txtPw.setText("비밀번호");
					txtPw.setForeground(Color.gray);
				}
				
			}
		});
		//

		JLabel btn = new JLabel("");
		btn.setSize(450, 100);
		btn.setLocation(0, 400);
		btn.setLayout(new FlowLayout());

		// 로그인, 회원가입, ID/PW 찾기
		// 로그인버튼
		ImageIcon ImgLogin1 = new ImageIcon("img\\로그인1.png");
		ImageIcon ImgLogin2 = new ImageIcon("img\\로그인2.png");
		JButton btnLogin = new JButton(ImgLogin1);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnLogin.setRolloverIcon(ImgLogin2);

		// 회원가입버튼
		ImageIcon ImgInit1 = new ImageIcon("img\\회원가입1.png");
		ImageIcon ImgInit2 = new ImageIcon("img\\회원가입2.png");
		JButton btnInit = new JButton(ImgInit1);
		btnInit.setContentAreaFilled(false);
		btnInit.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnInit.setRolloverIcon(ImgInit2);

		// 아이디찾기버튼
		ImageIcon ImgIdFind1 = new ImageIcon("img\\ID찾기1.png");
		ImageIcon ImgIdFind2 = new ImageIcon("img\\ID찾기2.png");
		JButton btnIdFind = new JButton(ImgIdFind1);
		btnIdFind.setContentAreaFilled(false);
		btnIdFind.setBorderPainted(false); // 버튼의 외곽선 없에기
		btnIdFind.setRolloverIcon(ImgIdFind2);

		// 패스워드찾기버튼
		ImageIcon ImgPwFind1 = new ImageIcon("img\\PW찾기1.png");
		ImageIcon ImgPwFind2 = new ImageIcon("img\\PW찾기2.png");
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

		//버튼 기능 구현
		
		//로그인
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!(custom.loginCheck(txtId.getText(), String.valueOf(txtPw.getPassword())).getId().equals(""))) {
					
					MyInfo m = custom.loginCheck(txtId.getText(), String.valueOf(txtPw.getPassword()));
					
					UserInfo userinfo = new UserInfo(m.getId(), m);
					
					Frame_Base.getInstance(new Frame_Home());
				}
				
			}
		}); 
		
		//회원가입
		btnInit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame_Login_Register();
			}
		});
		
		//Id찾기
		btnIdFind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = JOptionPane.showInputDialog("이름 입력");
				
				if(custom.findId(name) == null) {
					JOptionPane.showMessageDialog(null, "일치하는 회원 정보가 없습니다.");
				} else if(!(custom.findId(name).equals(""))) {
					
					String id =custom.findId(name);
					
					JOptionPane.showMessageDialog(null, id);
					
				}
				
			}
		});
		
		//Pw찾기
		btnPwFind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("ID 입력");
				
				if(custom.findPw(id) == null) {
					JOptionPane.showMessageDialog(null, "등록된 ID가 아닙니다.");
				} else if(!(custom.findPw(id).equals(""))) {
					
					String pw = custom.findPw(id);
					
					JOptionPane.showMessageDialog(null, pw);
					
				}
				
			}
			
		});
	}

}