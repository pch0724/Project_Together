package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame_MyPage_UpdateDog extends JFrame {

   public Frame_MyPage_UpdateDog() {

      // 프레임=======================
      JFrame jjf = new JFrame("반려견 수정");
      jjf.setVisible(true);

      jjf.setSize(400, 550);
      jjf.setLocationRelativeTo(null);
      // jjf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jjf.getContentPane().setLayout(null);
      jjf.getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      // ==============================================

      JLabel JJpic1 = new JLabel(" 사진");
      JJpic1.setBounds(90, 90, 40, 30);
      JJpic1.setOpaque(true);
      JJpic1.setBackground(Color.WHITE);

      JButton Jpicin = new JButton("변경하기");
      Jpicin.setBounds(90, 120, 220, 30);
      Jpicin.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            jjf.dispose();
         }
      });
      // ==============================================
      // 라벨[이름]
      JLabel JJname1 = new JLabel("이름 : ");
      JJname1.setBounds(90, 170, 40, 30);
      JJname1.setOpaque(true);
      JJname1.setBackground(Color.WHITE);
      
      // 텍스트 필드
      JPanel JJname = new JPanel();
      JJname.setBounds(80, 200, 240, 30);
      JJname.setBackground(Color.WHITE);

      JTextField JJname2 = new JTextField(null, 18);

      JJname.add(JJname2);
      // ===================================================
      // 라벨[나이]
      JLabel JJage1 = new JLabel("나이 : ");
      JJage1.setBounds(90, 250, 40, 30);
      JJage1.setOpaque(true);
      JJage1.setBackground(Color.WHITE);
      // 텍스트 필드
      JPanel JJage = new JPanel();
      JJage.setBounds(80, 280, 240, 30);
      JJage.setBackground(Color.WHITE);

      JTextField JJage2 = new JTextField(null, 18);

      JJage.add(JJage2);
      // ===================================================

      // 라벨 성별
      JLabel JJgender1 = new JLabel("성별");
      JJgender1.setOpaque(true);
      JJgender1.setBackground(Color.WHITE);
      JJgender1.setBounds(90, 330, 40, 30);
      
      // 성별 라디오 버튼
      JPanel JJgender = new JPanel();
      JJgender.setBackground(Color.WHITE);
      JJgender.setBounds(80, 360, 240, 40);

      JRadioButton JJgenderFemale = new JRadioButton("암컷");
      JJgenderFemale.setBackground(Color.WHITE);
      JRadioButton JJgenderMale = new JRadioButton("수컷");
      JJgenderMale.setBackground(Color.WHITE);
      ButtonGroup JJJgen = new ButtonGroup();

      JJJgen.add(JJgenderFemale);
      JJJgen.add(JJgenderMale);

      JJgender.add(JJgenderFemale);
      JJgender.add(JJgenderMale);
      // ===================================================
      
      // 등록 닫기 버튼

      JButton JEnroll = new JButton("수정");
      JEnroll.setBounds(90, 430, 80, 40);
      JEnroll.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            Frame_Base.getInstance(new Frame_MyPage());
            jjf.dispose();
         }
      });

      JButton JCancle = new JButton("취소");
      JCancle.setBounds(230, 430, 80, 40);
      JCancle.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            jjf.dispose();

         }
      });

      ImageIcon logophoto = new ImageIcon("img\\투개더로고2.png");
      Image img = logophoto.getImage();
      Image changelogophoto = img.getScaledInstance(250, 80, Image.SCALE_SMOOTH);
      ImageIcon logophoto2 = new ImageIcon(changelogophoto);
      JLabel JJpro = new JLabel(logophoto2);
      JJpro.setHorizontalAlignment(SwingConstants.CENTER);// 사진정렬-가운데
      JJpro.setBounds(80, 15, 250, 80);
      JJpro.setOpaque(true);
      JJpro.setBackground(Color.GRAY);

      jjf.add(JJpro);// 프로젝트[라벨]
      jjf.add(JJpic1);
      jjf.add(JJname1);// 반려견 이름[라벨]
      jjf.add(JJage1);// 반려견 나이[라벨]
      jjf.add(JJgender1);// 반려견 성별[라벨]
      jjf.add(JJname);// 이름 텍스트 필드
      jjf.add(JJage);// 나이 텍스트 필드
      jjf.add(JJgender);// 성별 텍스트 버튼
      jjf.add(JEnroll);
      jjf.add(JCancle);
      jjf.add(Jpicin);

   }

}