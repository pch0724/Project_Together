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

public class Frame_Walk_Food_Gwangjin extends JFrame {

   public Frame_Walk_Food_Gwangjin() {

      JFrame ff = new JFrame();
      ff.setVisible(true);
      ff.setSize(1000, 700);
      ff.setLocationRelativeTo(null);
      // pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ff.getContentPane().setLayout(null);
      ff.getContentPane().setBackground(Color.WHITE);
        //구석강아지들
       ImageIcon dog = new ImageIcon("img//구석강아지1.png");
      Image dog1 = dog.getImage();
      Image dog2 = dog1.getScaledInstance(250, 120, Image.SCALE_SMOOTH);
      ImageIcon dog4 = new ImageIcon(dog2);
      JLabel dog5 = new JLabel(dog4);
      dog5.setBounds(20,565, 250, 120);
      ff.add(dog5);
      // ======================================================

      ImageIcon Gwangjin1 = new ImageIcon("img//광진 카페 후문1.png");
      Image img1 = Gwangjin1.getImage();
      Image chanGwangjin1 = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Gwangjin2 = new ImageIcon(chanGwangjin1);
      
      JButton Proad = new JButton(Gwangjin2);
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
            
            ImageIcon Gwangjin11 = new ImageIcon("img//카 광진11.png");
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
      ff.add(Proad);
      
        //=======================================================
      ImageIcon Gwangjin3 = new ImageIcon("img//광진 카페 후문2.png");
      Image img2 = Gwangjin3.getImage();
      Image chanGwangjin2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Gwangjin4 = new ImageIcon(chanGwangjin2);
      
      JButton Ppic = new JButton(Gwangjin4);
      Ppic.setOpaque(true);
      Ppic.setSize(420, 250);
      Ppic.setLocation(50, 320);
      Ppic.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame c = new JFrame();
            c.setVisible(true);
            c.setSize(1100, 800);
            c.setLocationRelativeTo(null);

            ImageIcon Gwangjin111 = new ImageIcon("img//카 지 광진.png");
            Image img111 = Gwangjin111.getImage();
            Image chanGwangjin111 = img111.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Gwangjin222 = new ImageIcon(chanGwangjin111);
            JButton d = new JButton(Gwangjin222);
            d.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                  c.dispose();

               }
            });
            c.add(d);
            
         }
      });
      ff.add(Ppic);



      //=======================================================
      Font font=new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);
      JTextArea Pdes1=new JTextArea("                                      [카페 Who...문]\r\n"
            + "\r\n"
            + "서울특별시 광진구 능동로36길 183 (어린이대공원 후문)\r\n"
            + "문의 02-455-2789\r\n"
            + "\r\n"
            + "아차산역 5번 출구에서 어린이대공원 후문 쪽으로 \r\n"
            + "1분 정도 걸어오시면 빨간 벽돌 입구로 된 큰 집이 있습니다.\r\n"
            + "자차로 오실 경우 매장에 주차 공간이 있습니다. \r\n"
            + "만차일 경우 가게 앞에 위치한 어린이대공원 후문 주차장을 \r\n"
            + "이용하시면 됩니다.");
      Pdes1.setOpaque(true);
      Pdes1.setBounds(520, 320, 420, 250);
      
      Pdes1.setFont(font);
       ff.add(Pdes1);

      //=======================================================
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
      //=======================================================

   }

}