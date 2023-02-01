package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bottom_Button extends JLabel {

   public Bottom_Button() {
      // TODO Auto-generated constructor stub
      // JLabel bbp = new JLabel();

      setOpaque(true);
      setBackground(Color.white);

      setLayout(new FlowLayout());
      setBounds(0, 690, 500, 70);

      ImageIcon Imgbtnone1 = new ImageIcon("img\\home1.png");
      ImageIcon Imgbtnone2 = new ImageIcon("img\\home2.png");
      JButton btn1 = new JButton(Imgbtnone1);
      btn1.setContentAreaFilled(false);// 투명
      btn1.setBorderPainted(false); // 버튼의 외곽선 없에기
      btn1.setRolloverIcon(Imgbtnone2);
      btn1.setPreferredSize(new Dimension(116, 72));
      btn1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            Frame_Base.getInstance(new Frame_Home());

         }
      });

      // 버튼2
      ImageIcon Imgbtntwo1 = new ImageIcon("img\\work1.png");
      ImageIcon Imgbtntwo2 = new ImageIcon("img\\work2.png");
      JButton btn2 = new JButton(Imgbtntwo1);
      btn2.setContentAreaFilled(false);// 투명
      btn2.setBorderPainted(false); // 버튼의 외곽선 없에기
      btn2.setRolloverIcon(Imgbtntwo2);
      btn2.setPreferredSize(new Dimension(116, 72));
      btn2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            Frame_Base.getInstance(new Frame_Walk());

         }
      });

      // 버튼3
      ImageIcon Imgbtnthree1 = new ImageIcon("img\\showping1.png");
      ImageIcon Imgbtnthree2 = new ImageIcon("img\\showping2.png");
      JButton btn3 = new JButton(Imgbtnthree1);
      btn3.setContentAreaFilled(false);// 투명
      btn3.setBorderPainted(false); // 버튼의 외곽선 없에기
      btn3.setRolloverIcon(Imgbtnthree2);
      btn3.setPreferredSize(new Dimension(116, 72));
      btn3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            Frame_Base.getInstance(new Frame_Shopping());

         }
      });

      // 버튼4
      ImageIcon Imgbtnfor1 = new ImageIcon("img\\my1.png");
      ImageIcon Imgbtnfpr2 = new ImageIcon("img\\my2.png");
      JButton btn4 = new JButton(Imgbtnfor1);
      btn4.setContentAreaFilled(false);// 투명
      btn4.setBorderPainted(false); // 버튼의 외곽선 없에기
      btn4.setRolloverIcon(Imgbtnfpr2);
      btn4.setPreferredSize(new Dimension(116, 72));
      btn4.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            Frame_Base.getInstance(new Frame_MyPage());

         }
      });

      add(btn1);
      add(btn2);
      add(btn3);
      add(btn4);
   }
}