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

public class Frame_Walk_Food_Mapo extends JFrame {

   public Frame_Walk_Food_Mapo() {

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

      ImageIcon Mapo1 = new ImageIcon("img//마포 카페 팔짱커피1.png");
      Image img1 = Mapo1.getImage();
      Image chanMapo = img1.getScaledInstance(870, 260, Image.SCALE_SMOOTH);
      ImageIcon Mapo2 = new ImageIcon(chanMapo);

      JButton Proad = new JButton(Mapo2);
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
            
            ImageIcon Mapo11 = new ImageIcon("img//카 마포11.png");
            Image img11 = Mapo11.getImage();
            Image chanMapo11 = img11.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            ImageIcon Mapo22 = new ImageIcon(chanMapo11);
            JButton b= new JButton(Mapo22);
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
      ImageIcon Mapo3 = new ImageIcon("img//마포 카페 팔짱커피2.PNG");
      Image img2 = Mapo3.getImage();
      Image chanMapo2 = img2.getScaledInstance(420, 250, Image.SCALE_SMOOTH);
      ImageIcon Mapo4 = new ImageIcon(chanMapo2);

      JButton Ppic = new JButton(Mapo4);
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

            ImageIcon Mapo411 = new ImageIcon("img//카 지 마포.png");
            Image img11 = Mapo411.getImage();
            Image chanMapo411 = img11.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
            ImageIcon Mapo422 = new ImageIcon(chanMapo411);
            JButton b = new JButton(Mapo422);
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
      Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);
      JTextArea Pdes1 = new JTextArea("                                          [팔짱 커피]\r\n" + "\r\n"
            + "서울 마포구 월드컵로34길 6 102호 \r\n" + "1번출구 올리브영 앞 건물\r\n" + "문의 0507-1367-7830\r\n" + "\r\n" + "설명\r\n"
            + "1. 예약은4인이상만가능합니다.\r\n" + "(6인이상은 매장으로 유선예약부탁드립니다!)\r\n" + "2. 애견동반 10kg이하 가능합니다.\r\n"
            + "3. 주차시설 없습니다. 근처 공영주차장 또는 \r\n" + "매장앞 유료주차장 이용부탁드려요!");
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