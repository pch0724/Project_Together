package frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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

import customDAO.CartDAO;
import customDAO.CustomDAO;
import customDAO.ItemDAO;
import customDAO.MyInfo;
import customDAO.SellDAO;
import customDAO.UserInfo;

public class Frame_Login extends JPanel {

   private JPasswordField passText;
   private JTextField userText;

   UserInfo userInfo;

   public Frame_Login() {

      setLayout(null);
      setSize(500, 730);
      // setBackground(new Color(229,243,197));
      setBackground(Color.WHITE);
      CustomDAO custom = new CustomDAO();
      ItemDAO item = new ItemDAO();

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

      //JLabel btn = new JLabel("");
      //btn.setSize(500, 730);
      //btn.setLocation(0, 400);
      //btn.setLayout(new FlowLayout());

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

      btnLogin.setBounds(90,370,130, 30);
      btnInit.setBounds(260,370,130, 30);
      btnIdFind.setBounds(90,410,130, 30);
      btnPwFind.setBounds(260,410,130, 30);
      
      ImageIcon logophoto3 = new ImageIcon("img\\로그인3.png");
      Image img1 = logophoto3.getImage();
      Image changelogophoto2 = img1.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
      ImageIcon logophoto4 = new ImageIcon(changelogophoto2);
      JLabel logo1 = new JLabel(logophoto4);
      logo1.setHorizontalAlignment(SwingConstants.CENTER);// 사진정렬-가운데
      logo1.setBounds(40, 500, 400, 300);
      logo1.setOpaque(true);
      logo1.setBackground(Color.GRAY);
      add(logo1);

      //add(btn);
      add(btnLogin);
      add(btnInit);
      add(btnIdFind);
      add(btnPwFind);

      Font font = new Font("맑은 고딕", Font.BOLD, 12);
      userText = new JTextField(20);
      userText.setText("아이디");
      userText.setFont(font);
      userText.setForeground(Color.GRAY);
      userText.setBounds(164, 289, 150, 30);

      userText.addFocusListener(new FocusListener() {

         @Override
         public void focusGained(FocusEvent e) {
            String id = userText.getText();
            if (id.equals("아이디")) {
               userText.setForeground(Color.BLACK);
               userText.setText("");
            }
         }

         @Override
         public void focusLost(FocusEvent e) {
            String id = userText.getText();
            if (id.equals("")) {
               userText.setText("아이디");
               userText.setForeground(Color.GRAY);
            }
         }
      });

      add(userText);

      passText = new JPasswordField(20);
      passText.setBounds(164, 319, 150, 30);
      passText.setFont(font);
      passText.setText("비밀번호");

      passText.setForeground(Color.GRAY);

      passText.addFocusListener(new FocusListener() {

         @Override
         public void focusGained(FocusEvent e) {
            String pw = String.valueOf(passText.getPassword());

            if (pw.equals("비밀번호")) {
               passText.setForeground(Color.BLACK);
               passText.setText("");
            }
         }

         @Override
         public void focusLost(FocusEvent e) {
            String pw = String.valueOf(passText.getPassword());
            if (pw.equals("")) {
               passText.setText("비밀번호");
               passText.setForeground(Color.GRAY);

            }
         }
      });
      add(passText);

      btnInit.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new Frame_Login_Register();
         }
      });

      btnLogin.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // 로그인 정보 가져가기위해서 객체넘김
            if (!(custom.loginCheck(userText.getText(), String.valueOf(passText.getPassword())).getId()
                  .equals(""))) {
               MyInfo m = custom.loginCheck(userText.getText(),
                     String.valueOf(String.valueOf(passText.getPassword())));
               userInfo = new UserInfo(m.getId(), m);

               CartDAO cart = new CartDAO(m.getId());
               SellDAO history = new SellDAO(m.getId());

               Frame_Base.getInstance(new Frame_Home(UserInfo.UserInfoMap.get(m.getId()), cart, history));
               // Frame_Base.getInstance(new Frame_Home());

            } else {
               JOptionPane.showMessageDialog(null, "로그인 정보 오류");
            }
         }
      });

      btnIdFind.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
            String name = JOptionPane.showInputDialog("이름을 입력하시오 ");

            if (custom.findId(name) == null) {
               JOptionPane.showMessageDialog(null, "정보가 없습니다.");
            }

            else if (!(custom.findId(name).equals(""))) {
               String id = custom.findId(name);
               JOptionPane.showMessageDialog(null, "아이디 : " + id);
            }
         }
      });

      btnPwFind.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent arg0) {
            String id = JOptionPane.showInputDialog("아이디를 입력하시오 ");

            if (!(custom.findPw(id) == null)) {
               String pw = custom.findPw(id);
               JOptionPane.showMessageDialog(null, "pw : " + pw);
            } else {
               JOptionPane.showMessageDialog(null, "정보가 없습니다.");
            }
         }

      });

   }

}