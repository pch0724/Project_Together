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

public class Frame_Walk_Road_Dobong extends JFrame {

   public Frame_Walk_Road_Dobong() {

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

      ImageIcon Dobong1 = new ImageIcon("img//도봉1.png");
      Image img1 = Dobong1.getImage();
      Image chanDobong1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Dobong2 = new ImageIcon(chanDobong1);

      JButton Proad = new JButton(Dobong2);
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

            ImageIcon Dobong11 = new ImageIcon("img//산 도봉11.png");
            Image img11 = Dobong11.getImage();
            Image chanDobong11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Dobong22 = new ImageIcon(chanDobong11);
            JButton b = new JButton(Dobong22);
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
      ImageIcon Dobong3 = new ImageIcon("img//도봉2.png");
      Image img2 = Dobong3.getImage();
      Image chanDobong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Dobong4 = new ImageIcon(chanDobong2);

      JButton Ppic = new JButton(Dobong4);
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

            ImageIcon Dobong11 = new ImageIcon("img//산 지 도봉.png");
            Image img11 = Dobong11.getImage();
            Image chanDobong11 = img11.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Dobong22 = new ImageIcon(chanDobong11);
            JButton b = new JButton(Dobong22);
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

      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 16);
      JTextArea Pdes = new JTextArea("                          [ 도봉구 초안산 도봉 둘레길 ]\r\n" + "\r\n"
            + "산책코스 : 초안산근린공원 공영주차장\r\n" + "                 – 도봉구반려견놀이터(초안산공공반려견놀이터)\r\n"
            + "                 – 초안산 도봉 둘레길\r\n" + "                 – 초안산 나들길 \r\n" + "\r\n"
            + "주소 : 서울 도봉구 해등로 3길 48-11 (초안산근린공원)\r\n" + "연락처 : 02-2091-4474\r\n" + "입장조건 : 동물 등록 필수, 맹견 입장 불가\r\n"
            + "놀이터 분리여부 : 소형견, 대형견 분리        |        주차 가능\r\n" + "\r\n" + "", 18, 42);
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
            new Frame_Walk_Food_Dobong();
         }
      });

      pf.add(Pclose);
      // =======================================================

   }

}