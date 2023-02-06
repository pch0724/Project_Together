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

public class Frame_Walk_Road_Dongdaemun extends JFrame {

   public Frame_Walk_Road_Dongdaemun() {

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

      ImageIcon Dongdaemun1 = new ImageIcon("img//동대문1.png");
      Image img1 = Dongdaemun1.getImage();
      Image chanDongdaemun = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Dongdaemun2 = new ImageIcon(chanDongdaemun);

      JButton Proad = new JButton(Dongdaemun2);
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

            ImageIcon Dongdaemun11 = new ImageIcon("img//산 동대문11.png");
            Image img11 = Dongdaemun11.getImage();
            Image chanDongdaemun11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Dongdaemun22 = new ImageIcon(chanDongdaemun11);
            JButton b = new JButton(Dongdaemun22);
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
      ImageIcon Dongdaemun3 = new ImageIcon("img//동대문2.png");
      Image img2 = Dongdaemun3.getImage();
      Image chanDongdaemun1 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Dongdaemun4 = new ImageIcon(chanDongdaemun1);

      JButton Ppic = new JButton(Dongdaemun4);
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

            ImageIcon Dongdaemun11 = new ImageIcon("img//산 지 동대문.png");
            Image img11 = Dongdaemun11.getImage();
            Image chanDongdaemun11 = img11.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Dongdaemun22 = new ImageIcon(chanDongdaemun11);
            JButton b = new JButton(Dongdaemun22);
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

      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 14);
      JTextArea Pdes = new JTextArea("                            [ 동대문구 단풍길(중랑천제방길) ]\r\n" + "\r\n"
            + "산책코스 : 면목유수지공영주차장 – 장안교 – 동대문구 반려견 놀이터 \r\n" + "– 군자방향 가을단풍길(중랑천제방길) – 군자교 하부 – 장안교 \r\n" + "\r\n"
            + "주소 : 서울 동대문구 장안동(장안교 하부)\r\n" + "연락처 : 02-2127-4273\r\n" + "입장조건 : 동물 등록 필수, 맹견 입장 불가\r\n"
            + "놀이터 분리여부 : 분리 없음       \r\n" + " \r\n" + " * 별도의 관리자가 없이 상시 운영되고 있다         |           주차 가능");
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
            new Frame_Walk_Food_Dongdaemun();
         }
      });

      pf.add(Pclose);
      // =======================================================

   }

}