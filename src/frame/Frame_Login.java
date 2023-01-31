package frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame_Login extends JPanel {
      
   public Frame_Login() {
      
	  //JPanel 구조
	  setLayout(null);
      setBackground(Color.gray);
      setSize(450, 600);
      
      //라벨 ID
      JLabel ID = new JLabel("ID : ");
      ID.setSize(450, 100);
      ID.setLocation(95, 250);
      
      //ID 입력상자
      JTextField txtId = new JTextField(20);
      txtId.setSize(150, 30);
      txtId.setLocation(150, 289);
      //입력 후 삭제 및 처음으로 포커스 옮김 필요
      
      add(ID);
      add(txtId);
      
      
      //라벨 PW
      JLabel PW = new JLabel("PW : ");
      PW.setSize(450, 100);
      PW.setLocation(86, 300);
      
      //PW 입력상자
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
      
      //로그인, 회원가입, ID/PW 찾기
      JButton btnLogin = new JButton("로그인");
      JButton btnInit = new JButton("회원가입");
      JButton btnIdFind = new JButton("ID 찾기");
      JButton btnPwFind = new JButton("PW 찾기");
      
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
		public void actionPerformed(ActionEvent e) {//ID PW 일치여부 확인 필요
			Frame_Base.getInstance(new Frame_Home());
		}
	});
      
      btnInit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new sign2();
		}
	});
      
      
   }
  
}