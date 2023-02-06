package frame;

import java.awt.Button;
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

public class Frame_Walk_Food_Dongjak extends JFrame {

   public Frame_Walk_Food_Dongjak() {

      JFrame ff = new JFrame();
      ff.setVisible(true);
      ff.setSize(1000, 700);
      ff.setLocationRelativeTo(null);
      // pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ff.getContentPane().setLayout(null);
      ff.getContentPane().setLayout(null);
      ff.getContentPane().setBackground(Color.WHITE);
      // 구석강아지들
      ImageIcon dog = new ImageIcon("img//구석강아지1.png");
      Image dog1 = dog.getImage();
      Image dog2 = dog1.getScaledInstance(250, 120, Image.SCALE_SMOOTH);
      ImageIcon dog4 = new ImageIcon(dog2);
      JLabel dog5 = new JLabel(dog4);
      dog5.setBounds(20, 565, 250, 120);
      ff.add(dog5);
      // ======================================================

      ImageIcon Dongjak11 = new ImageIcon("img//동작카페1.png");
      Image img1 = Dongjak11.getImage();
      Image chanDongjak1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Dongjak22 = new ImageIcon(chanDongjak1);

      JButton Proad = new JButton(Dongjak22);
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
            
            ImageIcon Dongjak11 = new ImageIcon("img//카 동작11.png");
            Image img11 = Dongjak11.getImage();
            Image chanDongjak11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Dongjak22 = new ImageIcon(chanDongjak11);
            JButton b= new JButton(Dongjak22);
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
      ImageIcon Dongjak3 = new ImageIcon("img//동작카페2.png");
      Image img2 = Dongjak3.getImage();
      Image chanDongjak2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Dongjak4 = new ImageIcon(chanDongjak2);

      JButton Ppic = new JButton(Dongjak4);
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

            ImageIcon Dongjak11 = new ImageIcon("img//카 지 동작.png");
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
      ff.add(Ppic);

      // =======================================================
      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 14);
      JTextArea Pdes1 = new JTextArea("                                           [시티스트릿츠]\r\n" + "\r\n" + "\r\n"
            + "서울특별시 관악구 신사로 128-1 대흥빌딩 1층\r\n" + "문의 070-8844-0037\r\n" + "\r\n" + "알림 애견동반시 지켜주셔야 할 점\r\n"
            + "1. 실내 배변을 하는 강아지들은 매너 패드 착용\r\n" + "2. 매너 패드 미착용 시 안고 있어 주세요\r\n" + "3. 의자 위에 앉히실 땐 발을 닦이고 앉혀주세요\r\n"
            + "(의자들이 밝은 톤이라 자국이 생기면 지워지지 않아요)\r\n" + "4. 큰 대형견들 입장 시 목줄 착용과 의자 아래에 앉혀주세요\r\n"
            + "※ 다른 기본적인 페티켓을 지켜 주시기 바랍니다.");
      Pdes1.setOpaque(true);
      Pdes1.setBounds(520, 320, 420, 250);

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