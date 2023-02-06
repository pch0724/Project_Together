package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import Button.RoundedButton;

public class Frame_Walk_Road_Gwangjin extends JFrame {

   public Frame_Walk_Road_Gwangjin() {

      JFrame pf = new JFrame();
      pf.setVisible(true);
      pf.setSize(1000, 700);
      pf.setLocationRelativeTo(null);
      pf.setBackground(Color.white);
      // pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pf.getContentPane().setLayout(null);
      pf.getContentPane().setLayout(null);
      pf.getContentPane().setBackground(Color.WHITE);

      ImageIcon dog = new ImageIcon("img//구석강아지2.png");
      Image dog1 = dog.getImage();
      Image dog2 = dog1.getScaledInstance(230, 100, Image.SCALE_SMOOTH);
      ImageIcon dog4 = new ImageIcon(dog2);
      JLabel dog5 = new JLabel(dog4);
      dog5.setBounds(20, 565, 250, 120);
      pf.add(dog5);

      // ======================================================

      ImageIcon Gwangjin1 = new ImageIcon("img//광진1.png");
      Image img1 = Gwangjin1.getImage();
      Image chanGwangjin = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Gwangjin2 = new ImageIcon(chanGwangjin);

      JButton Proad = new JButton(Gwangjin2);
      Proad.setOpaque(true);
      Proad.setSize(870, 260);
      Proad.setLocation(60, 40);
      Proad.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame a = new JFrame();
            a.setVisible(true);
            a.setSize(1200, 800);
            a.setLocationRelativeTo(null);

            ImageIcon Gwangjin11 = new ImageIcon("img//산 광진11.png");
            Image img11 = Gwangjin11.getImage();
            Image chanGwangjin11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Gwangjin22 = new ImageIcon(chanGwangjin11);
            JButton b = new JButton(Gwangjin22);
            b.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                  a.dispose();

               }
            });
            a.add(b);
            
         }
      });
      pf.add(Proad);

      // =======================================================
      ImageIcon Gwangjin3 = new ImageIcon("img//광진2.png");
      Image img2 = Gwangjin3.getImage();
      Image chanGwangjin1 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Gwangjin4 = new ImageIcon(chanGwangjin1);

      JButton Ppic = new JButton(Gwangjin4);
      Ppic.setOpaque(true);
      Ppic.setSize(420, 250);
      Ppic.setLocation(60, 320);
      Ppic.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame a = new JFrame();
            a.setVisible(true);
            a.setSize(1100, 800);
            a.setLocationRelativeTo(null);

            ImageIcon Gwangjin11 = new ImageIcon("img//산 지 광진.png");
            Image img11 = Gwangjin11.getImage();
            Image chanGwangjin11 = img11.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Gwangjin22 = new ImageIcon(chanGwangjin11);
            JButton b = new JButton(Gwangjin22);
            b.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                  a.dispose();

               }
            });
            a.add(b);
            
         }
      });
      pf.add(Ppic);
      


      // =======================================================

      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 14);
      JTextArea Pdes = new JTextArea("                  [광진구 어린이대공원 반려견 놀이터]\r\n" + "\r\n"
            + "산책코스 : 어린이대공원역 - 정문 - 순명비 유강원 석물 \r\n" + "- 음악분수 - 생태연못 - 식물원카페테리아 - 땡땡마을\r\n"
            + "- 들새마을 - 구의문 반려견 놀이터 \r\n" + "\r\n" + "주소 : 서울특별시 광진구 능동로 216 \r\n" + "(어린이대공원 구의문 주차장)\r\n"
            + "연락처 : 02-2124-2835\r\n" + "입장조건 : 동물보호법에 명시된 맹견 입장 불가\r\n" + "질병이 있거나 발정중인 반려견 입장 불가\r\n"
            + "사람 음식물, 반려견 사료 및 간식 반입 금지\r\n" + "놀이터 분리여부 : 소형견, 대형견 분리             |            주차 가능");
      Pdes.setOpaque(true);
      Pdes.setBounds(490, 320, 450, 250);
      Pdes.setEditable(false);
      Pdes.setFont(font);
      pf.add(Pdes);

      // =======================================================
      RoundedButton Pclose = new RoundedButton("닫기");
      Color c1 = new Color(255, 108, 0);
      Font font1 = new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);
      Pclose.setBackground(c1);
      Pclose.setFont(font1);
      Pclose.setBounds(900, 600, 65, 40);
      Pclose.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            pf.dispose();
            new Frame_Walk_Food_Gwangjin();
         }
      });

      pf.add(Pclose);
      // =======================================================

   }

}