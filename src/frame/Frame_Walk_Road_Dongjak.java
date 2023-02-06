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

public class Frame_Walk_Road_Dongjak extends JFrame {

   public Frame_Walk_Road_Dongjak() {

      JFrame pf = new JFrame();
      pf.setVisible(true);
      pf.setSize(1000, 700);
      pf.setLocationRelativeTo(null);
      pf.setBackground(Color.white);
      // pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pf.getContentPane().setLayout(null);
      pf.getContentPane().setLayout(null);
      pf.getContentPane().setBackground(Color.WHITE);

      // ======================================================

      ImageIcon Dongjak1 = new ImageIcon("img//동작1.png");
      Image img1 = Dongjak1.getImage();
      Image chanDongjak1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Dongjak2 = new ImageIcon(chanDongjak1);

      JButton Proad = new JButton(Dongjak2);
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

            ImageIcon Dongjak11 = new ImageIcon("img//산 동작11.png");
            Image img11 = Dongjak11.getImage();
            Image chanDongjak11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Dongjak22 = new ImageIcon(chanDongjak11);
            JButton b = new JButton(Dongjak22);
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
      ImageIcon Dongjak3 = new ImageIcon("img//동작2.png");
      Image img2 = Dongjak3.getImage();
      Image chanDongjak2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Dongjak4 = new ImageIcon(chanDongjak2);

      JButton Ppic = new JButton(Dongjak4);
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

            ImageIcon Dongjak11 = new ImageIcon("img//산 지 동작.png");
            Image img11 = Dongjak11.getImage();
            Image chanDongjak11 = img11.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Dongjak22 = new ImageIcon(chanDongjak11);
            JButton b = new JButton(Dongjak22);
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
      // Ppic.setBounds(520, 320, 420, 250);

      ImageIcon dog = new ImageIcon("img//구석강아지2.png");
      Image dog1 = dog.getImage();
      Image dog2 = dog1.getScaledInstance(230, 100, Image.SCALE_SMOOTH);
      ImageIcon dog4 = new ImageIcon(dog2);
      JLabel dog5 = new JLabel(dog4);
      dog5.setBounds(20, 565, 250, 120);
      pf.add(dog5);
      // =======================================================

      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 16);
      JTextArea Pdes = new JTextArea("                          [ 보라매 공원 반려견 놀이터 ]\r\n" + "\r\n"
            + "산책코스 : 보라매 공원 신대방동-정문\r\n" + "                 – 와우산 둘레길\r\n" + "                 – 한화불꽃정원\r\n"
            + "                 – 보라매공원 반려견 놀이터 \r\n" + "\r\n" + "주소 : 동작구 여의대방로20마길 11(보라매공원 향기원 옆)\r\n"
            + "연락처 : 02-2124-2835\r\n" + "입장조건 : 동물 등록 필수, 맹견 입장 불가\r\n"
            + "24시간 운영 | 월요일 휴무 | 소형견, 대형견 분리 | 주차 가능\r\n" + "\r\n" + "", 18, 42);
      Pdes.setOpaque(true);
      Pdes.setBounds(490, 320, 450, 250);

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
            new Frame_Walk_Food_Dongjak();
         }
      });

      pf.add(Pclose);
      // =======================================================

   }

}