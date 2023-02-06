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

public class Frame_Walk_Road_Joong extends JFrame {

   public Frame_Walk_Road_Joong() {

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

      ImageIcon Joong1 = new ImageIcon("img//중구1.png");
      Image img1 = Joong1.getImage();
      Image chanJoong1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Joong2 = new ImageIcon(chanJoong1);

      JButton Proad = new JButton(Joong2);
      Proad.setOpaque(true);
      Proad.setSize(870, 260);
      Proad.setLocation(60, 40);
      Proad.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame a= new JFrame();
            a.setVisible(true);
            a.setSize(1200,800);
            a.setLocationRelativeTo(null);
            
            ImageIcon Gwangjin11 = new ImageIcon("img//산 중구11.png");
            Image img11 = Gwangjin11.getImage();
            Image chanGwangjin11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Gwangjin22 = new ImageIcon(chanGwangjin11);
            JButton b= new JButton(Gwangjin22);
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
      ImageIcon Joong3 = new ImageIcon("img//중구2.png");
      Image img2 = Joong3.getImage();
      Image chanJoong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Joong4 = new ImageIcon(chanJoong2);

      JButton Ppic = new JButton(Joong4);
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

            ImageIcon Joong11 = new ImageIcon("img//산 지 중구.png");
            Image img11 = Joong11.getImage();
            Image chanJoong11 = img11.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Joong22 = new ImageIcon(chanJoong11);
            JButton b = new JButton(Joong22);
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
      

      ImageIcon dog = new ImageIcon("img//구석강아지2.png");
      Image dog1 = dog.getImage();
      Image dog2 = dog1.getScaledInstance(230, 100, Image.SCALE_SMOOTH);
      ImageIcon dog4 = new ImageIcon(dog2);
      JLabel dog5 = new JLabel(dog4);
      dog5.setBounds(20, 565, 250, 120);
      pf.add(dog5);

      // =======================================================

      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 16);
      JTextArea Pdes = new JTextArea(
            "                          [ 남산 둘레길 ]\r\n" + "\r\n" + "산책코스 : 남산 야외 식물원\r\n"
                  + "                 – 자연생태길 둘레길\r\n" + "                 – 벚꽃길\r\n"
                  + "                 – 역사문화 둘레길\r\n" + "\r\n" + "주소 : 서울 중구 회현동1가\r\n" + "연락처 : 02-3783-5900\r\n"
                  + "입장조건 : 동물 등록 필수, 맹견 입장 불가\r\n" + "차량 통제 및 무장애 길 | 소형견, 대형견 분리 | 주차 가능\r\n" + "\r\n" + "",
            18, 42);
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
            new Frame_Walk_Food_Joong();
         }
      });

      pf.add(Pclose);
      // =======================================================

   }

}