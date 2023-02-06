package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import Button.RoundedButton;

public class Frame_Walk_Food_Dobong extends JFrame {

   public Frame_Walk_Food_Dobong() {

      JFrame ff = new JFrame();
      ff.setVisible(true);
      ff.setSize(1000, 700);
      ff.setLocationRelativeTo(null);
      // pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ff.getContentPane().setLayout(null);
      ff.getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      // 구석강아지들
      ImageIcon dog = new ImageIcon("img//구석강아지1.png");
      Image dog1 = dog.getImage();
      Image dog2 = dog1.getScaledInstance(250, 120, Image.SCALE_SMOOTH);
      ImageIcon dog4 = new ImageIcon(dog2);
      JLabel dog5 = new JLabel(dog4);
      dog5.setBounds(20, 565, 250, 120);
      ff.add(dog5);
      // ======================================================

      ImageIcon Dobong1 = new ImageIcon("img//도봉 카페 부기1.png");
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

            ImageIcon Dobong11 = new ImageIcon("img//카 도봉11.png");
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

      ff.add(Proad);

      // =======================================================
      ImageIcon Dobong3 = new ImageIcon("img//도봉 카페 부기2.png");
      Image img2 = Dobong3.getImage();
      Image chanDobong2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Dobong4 = new ImageIcon(chanDobong2);

      JButton Ppic = new JButton(Dobong4);
      Ppic.setOpaque(true);
      Ppic.setSize(420, 250);
      Ppic.setLocation(50, 320);
      Ppic.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame a = new JFrame();
            a.setVisible(true);
            a.setSize(1100, 800);
            a.setLocationRelativeTo(null);

            ImageIcon Dobong11 = new ImageIcon("img//카 지 도봉.png");
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

      ff.add(Ppic);

      // =======================================================
      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 14);
      JTextArea Pdes1 = new JTextArea("                                           [카페 부기]\r\n" + "\r\n"
            + "서울특별시 도봉구 도봉로114길 29-5, 101호 (창동, 남양캐슬)\r\n" + "문의 0507-1346-8157\r\n" + "\r\n"
            + "알림 애견동반시 지켜주셔야 할 점\r\n" + "1. 실내 배변을 하는 강아지들은 매너 패드 착용\r\n" + "(매장 바닥이 카펫 이라 흡수가 잘됩니다)\r\n"
            + "2. 매너 패드 미착용 시 안고 있어 주세요\r\n" + "3. 의자 위에 앉히실 땐 발을 닦이고 앉혀주세요\r\n"
            + "(의자들이 밝은 톤이라 자국이 생기면 지워지지 않아요)\r\n" + "4. 큰 대형견들 입장 시 목줄 착용과 의자 아래에 앉혀주세요");
      Pdes1.setOpaque(true);
      Pdes1.setBounds(520, 320, 420, 250);
      Pdes1.setEditable(false);
      Pdes1.setFont(font);
      ff.add(Pdes1);


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
            ff.dispose();
         }
      });

      ff.add(Pclose);
      // =======================================================

   }

}