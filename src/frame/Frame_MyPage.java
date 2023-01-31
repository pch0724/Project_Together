package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame_MyPage extends JPanel{

	   public Frame_MyPage() {
	      // 프레임 기본 설정
	     //JFrame frame = new JFrame("마이페이지");
	      //frame.setVisible(true);
	      //frame.setSize(450, 600); // width, height
	      //frame.setLocationRelativeTo(null); // 화면 가운데 위치
	      //frame.setResizable(false); // 크기조절 X
	      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫으면 종료
	      //frame.getContentPane().setLayout(null); // 컴포넌트패인 추가

	      //기본 패널 설정
		   setLayout(null);
	      //JPanel nav = new JPanel();
	        //nav.setBounds(0, 0, 450, 480);
		   setSize(450,480);
	        //nav.setBackground(Color.GREEN);
		   setBackground(Color.green);
	      // 반려견 정보 라벨
	      
		   
	      JLabel Dinfo = new JLabel("반려견 정보");
	      Dinfo.setVerticalAlignment(SwingConstants.TOP);
	      Dinfo.setHorizontalAlignment(SwingConstants.CENTER);
	      Dinfo.setBounds(250, 50, 190, 130);
	      add(Dinfo);
	      
	      Dinfo.setOpaque(true);
          Dinfo.setBackground(Color.black);

	      
	      // 사진 label
	      JLabel dogpic = new JLabel("");
	      dogpic.setIcon(new ImageIcon("images.jpg"));
	      dogpic.setHorizontalAlignment(SwingConstants.CENTER); // 사진 정렬 - 가운데
	      dogpic.setBounds(40, 40, 180, 160); // 사진 위치 조절 x,y,w,h
	      add(dogpic);
	      
	      // 수정버튼
	      JButton DregiBtn = new JButton("등록");
	      DregiBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_RegisterDog());
			}
		});
	      DregiBtn.setBounds(60, 230, 90, 40);
	      add(DregiBtn);
	      
	      // 삭제버튼
	      JButton DmodifyBtn = new JButton("수정");
	      DmodifyBtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 Frame_Base.getInstance(new Frame_UpdateDog());
	         }
	      });
	      DmodifyBtn.setBounds(200, 230, 90, 40);
	      add(DmodifyBtn);
	      
	      // 일지작성
	      JButton writediary = new JButton("일지작성");
	      writediary.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         }
	      });
	      writediary.setBounds(340, 230, 90, 40);
	      add(writediary);

	      // diarylist 라벨
	      JLabel diarylistL = new JLabel("diarylist");
	      diarylistL.setHorizontalAlignment(SwingConstants.CENTER); // 라벨 정렬 | 가운데
	      diarylistL.setBounds(70, 310, 350, 220);
	      add(diarylistL); // 패널에 라벨 추가

	      JButton PmodifyBtn = new JButton("정보수정");
	      PmodifyBtn.addActionListener(new ActionListener() { // 버튼 수행동작
	         public void actionPerformed(ActionEvent e) {
	         }
	      });
	      PmodifyBtn.setBounds(50, 580, 100, 50);
	      add(PmodifyBtn);

	      JButton logoutBtn = new JButton("로그아웃");
	      logoutBtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            JFrame logout=new JFrame("로그아웃");
	            
	             logout.setVisible(true);
	               logout.setSize(300, 200); // width, height
	               logout.setLocationRelativeTo(null); // 화면 가운데 위치
	               logout.setResizable(false); // 크기조절 X
	               logout.getContentPane().setLayout(null);
	               
	               JLabel LOlb=new JLabel("로그아웃하시겠습니까?");
	               LOlb.setSize(300, 120);
	              LOlb.setHorizontalAlignment(SwingConstants.CENTER);
	               JButton LOb1 = new JButton("네");
	               JButton LOb2 = new JButton("아니오");
	               LOb1.setBounds(40,120,90,30);
	               LOb2.setBounds(150, 120, 90, 30);
	               logout.getContentPane().add(LOlb);
	               logout.getContentPane().add(LOb1);
	               logout.getContentPane().add(LOb2);
	            
	               
	            
	         }
	      });
	      logoutBtn.setBounds(200, 580, 100, 50);
	      add(logoutBtn);

	      JButton withdrawalBtn = new JButton("탈퇴");
	      withdrawalBtn.addActionListener(new ActionListener() {
			
			 @Override
	         public void actionPerformed(ActionEvent e) {
	            JFrame Pwithdrwal=new JFrame("탈퇴");
	            
	            Pwithdrwal.setVisible(true);
	            Pwithdrwal.setSize(300, 200); // width, height
	            Pwithdrwal.setLocationRelativeTo(null); // 화면 가운데 위치
	            Pwithdrwal.setResizable(false); // 크기조절 X
	            Pwithdrwal.getContentPane().setLayout(null);
	               
	               JLabel WDlb=new JLabel("정말로 탈퇴하시겠습니까?");
	               WDlb.setSize(300, 120);
	               WDlb.setHorizontalAlignment(SwingConstants.CENTER);
	               JButton WDb1 = new JButton("네");
	               JButton WDb2 = new JButton("아니오");
	               WDb1.setBounds(40,120,90,30);
	               WDb2.setBounds(150, 120, 90, 30);
	               Pwithdrwal.getContentPane().add(WDlb);
	               Pwithdrwal.getContentPane().add(WDb1);
	               Pwithdrwal.getContentPane().add(WDb2);
	            
	         }
	      });
	      withdrawalBtn.setBounds(340, 580, 100, 50);
	      add(withdrawalBtn);
	      
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
	       
	       btnhome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Home());
			}
		});
	       
	       btnwork.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Work());
			}
		});
	       
	       btnshowping.addActionListener(new ActionListener() {
	    	   
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   //Frame_Base.getInstance(new);
	    	   }
	       });
	       
	       btnmy.addActionListener(new ActionListener() {
	    	   
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   Frame_Base.getInstance(new Frame_MyPage());
	    	   }
	       });
	   }
}