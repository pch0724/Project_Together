package frame;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import customDAO.CustomDAO;
import customDAO.MyInfo;

public class Frame_Login_Register extends JFrame {

   public Frame_Login_Register() {
      // =============================================
      JFrame sf = new JFrame("회원가입");
      sf.setVisible(true);
      sf.setSize(500, 700);
      sf.setLocationRelativeTo(null);
      // sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      sf.getContentPane().setLayout(null);

      // ============================================= 아디
      JLabel Spro = new JLabel();
      Spro.setOpaque(true);
      Spro.setBackground(Color.BLACK);
      Spro.setBounds(80, 40, 320, 60);

      JLabel SID1 = new JLabel(" 아이디   ");
      SID1.setOpaque(true);
      SID1.setBounds(90, 120, 50, 20);
      
      JTextField SID2 = new JTextField(null, 26);
      SID2.setBounds(90, 140, 300, 30);

      // ============================================= 비번
      JLabel SPW1 = new JLabel(" 비밀번호 ");
      SPW1.setOpaque(true);
      SPW1.setBounds(90, 190, 60, 20);

      JPasswordField SPW2 = new JPasswordField(null, 26);
      SPW2.setBounds(90, 210, 300, 30);

      
      // ============================================= 비확
      JLabel SPWch1 = new JLabel(" 비밀번호 재확인");
      SPWch1.setOpaque(true);
      SPWch1.setBounds(90, 260, 100, 20);

      JPanel SPWch = new JPanel();
      SPWch.setOpaque(true);
      SPWch.setBounds(90, 280, 300, 30);

      JPasswordField SPWch2 = new JPasswordField(null, 26);
      SPWch.add(SPWch2);
      // ============================================= 이름
      JLabel Sname1 = new JLabel(" 이름");
      Sname1.setOpaque(true);
      Sname1.setBounds(90, 330, 30, 20);

      JTextField Sname2 = new JTextField(null, 26);
      Sname2.setBounds(90, 350, 300, 30);

      /*
       * // ============================================= 생년 JLabel Sbir1 = new
       * JLabel(" 생년월일"); Sbir1.setOpaque(true); Sbir1.setBounds(90, 400, 60, 20);
       * 
       * JPanel Sbir = new JPanel(); Sbir.setOpaque(true); Sbir.setBounds(90, 420,
       * 300, 30);
       * 
       * JTextField Sbir2 = new JTextField(null, 26); Sbir.add(Sbir2);
       */
      // ============================================= 박스
      JLabel Sad1 = new JLabel(" 거주하고 있는 인근지역");
      Sad1.setOpaque(true);
      Sad1.setBounds(90, 400, 300, 20);

      JPanel Sad = new JPanel();
      Sad.setOpaque(true);
      Sad.setBounds(90, 420, 300, 30);

      String[] optionsToChoose = { "------------------------------선택------------------------------", "광진구", "도봉구",
            "동대문구", "동작구", "마포구", "중구" };
      JComboBox<String> Sad2 = new JComboBox<String>(optionsToChoose);
      Sad2.setBounds(200, 430, 300, 20);
      Sad.add(Sad2);
      // ============================================= 버튼
      JButton Enroll1 = new JButton("가입하기");
      Enroll1.setBounds(120, 570, 90, 40);

      Enroll1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
        	 CustomDAO rd = new CustomDAO();
        	 String pw = String.valueOf(SPW2.getPassword());
        	 String cofirmPw = String.valueOf(SPWch2.getPassword());
        	 int addri = Sad2.getSelectedIndex();
				if (!(SID2.getText().equals("") || Sname2.getText().equals("")
						|| String.valueOf(SPW2.getPassword()).equals("") || addri == 0)) {
					if (rd.checkId(SID2.getText())) {
						if (!pw.equals(cofirmPw)) {
							JOptionPane.showMessageDialog(null, "비밀번호를 확인 해주세요.");
						}
						else {
							rd.registCustomer(Sname2.getText(), SID2.getText(), String.valueOf(SPW2.getPassword()), addri);
							JOptionPane.showMessageDialog(null, "가입완료");
							
							sf.dispose();
						}
						
					} 

					else {
						JOptionPane.showMessageDialog(null, "Id 중복 오류");
					}
				} else if (SID2.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
				} else if (Sname2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.");

				
				} else if(pw.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				} else {
					JOptionPane.showMessageDialog(null, "주소를 선택해주세요.");
				}
			}
         
      });

      JButton Cancle1 = new JButton("나가기");
      Cancle1.setBounds(270, 570, 90, 40);

      Cancle1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // Frame_Base.getInstance(new Frame_Login());
            sf.dispose();
         }
      });

      sf.add(Spro);// 프로젝트[라벨]
      sf.add(SID1);// 아이디[라벨]
      sf.add(SID2);// 아이디 [텍스트]
      sf.add(SPW1);// 비밀번호[라벨]
      sf.add(SPW2);// 비밀번호 [텍스트]
      sf.add(SPWch1);// 확인[라벨]
      sf.add(SPWch);// 비밀번호 확인 [텍스트]
      sf.add(Sname1);// 이름[라벨]
      sf.add(Sname2);// 이름 [텍스트]
      // sf.add(Sbir1);// 생년월일[라벨]
      // sf.add(Sbir);// 생년월일 [텍스트]
      sf.add(Sad1);// 주소[라밸]
      sf.add(Sad);// 주소 [콤보박스]
      sf.add(Enroll1);// 가입하기 [버튼]
      sf.add(Cancle1);// 나가기 [버튼]

   }

}