package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame_Home extends JPanel{
	
	public Frame_Home() {
		
		//JPanel 구조
		setSize(450, 500);
	    setBackground(Color.GREEN);
	    setLayout(null);
		
        //로고 라벨
        JLabel logo = new JLabel("=======로고==========");
        logo.setIcon(new ImageIcon("투개더로고.png"));
        logo.setHorizontalAlignment(SwingConstants.CENTER);//사진정렬-가운데
        logo.setBounds(95,10,250,50);
        logo.setOpaque(true);
        logo.setBackground(Color.WHITE);
        add(logo);
        
        //산책일지 정보
        JLabel a = new JLabel("산책정보: 오늘은 30km만큼 산책했어요");
        a.setHorizontalAlignment(SwingConstants.CENTER);
        a.setBounds(95,65,250,30);
        a.setOpaque(true);
        a.setBackground(Color.PINK);
        add(a);
        
        //반려동물 사진
        JLabel photo = new JLabel("반려동물사진");
        photo.setBounds(50, 100, 100, 100);
        photo.setOpaque(true);
        photo.setBackground(Color.BLUE);
        add(photo);
        
        //내용
        JLabel n = new JLabel("이름: 개솜이"+"\n"+" 나이: 4살 "+"\n"+" 성별: 여");
        n.setHorizontalAlignment(SwingConstants.CENTER);
        n.setBounds(180, 100, 200, 100);
        n.setOpaque(true);
        n.setBackground(Color.WHITE);
        add(n);
        
        
        //버튼
       // frame.setLayout(new FlowLayout());
       Button btnhome = new Button("홈");
       Button btnwork = new Button("산책");
       Button btnshowping = new Button("쇼핑");
       Button btnmy = new Button("마이페이지");
        
       btnhome.setBounds(0,501,450/4,50);
       btnwork.setBounds(450/4,501,450/4,50);
       btnshowping.setBounds(220,501,450/4,50);
       btnmy.setBounds(330,501,450/4,50);
       
       
       add(btnhome);
       add(btnwork);
       add(btnshowping);
       add(btnmy);
       
  }
}
