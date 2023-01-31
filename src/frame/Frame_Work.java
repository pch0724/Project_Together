package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame_Work extends JPanel{
	
	public Frame_Work() {
		setBounds(0, 0, 450, 480);
		setBackground(Color.GREEN);
		setLayout(null);
		
		
		JComboBox<String> jcombx=new JComboBox<String>();
		jcombx.setBounds(350, 30, 70, 30);
		
		add(jcombx);
		
		JLabel wname =new JLabel();
		wname.setBounds(30, 40, 90, 40);
		wname.setOpaque(true);
		wname.setBackground(Color.black);
		
		JLabel wpic=new JLabel();
		wpic.setBounds(wname.getX(), 80, 390, 150);
		wpic.setOpaque(true);
		wpic.setBackground(Color.DARK_GRAY);
		
		JButton wpre= new JButton();
		wpre.setBounds(wname.getX(), 230, 40, 30);
		
		JButton wnxt= new JButton();
		wnxt.setBounds(380, 230, 40, 30);
		
		JLabel cname =new JLabel();
		cname.setBounds(30, wpre.getY()+30,90, 40);
		cname.setOpaque(true);
		cname.setBackground(Color.gray);
		
		JLabel cpic=new JLabel();
		cpic.setBounds(cname.getX(), 300, 390, 150);
		cpic.setOpaque(true);
		cpic.setBackground(Color.cyan);
		
		JButton cpre= new JButton();
		cpre.setBounds(cname.getX(), 450, 40, 30);
		
		JButton cnxt= new JButton();
		cnxt.setBounds(380, 450, 40, 30);
		
		
		
		add(wname);
		add(wpic);
		add(wpre);
		add(wnxt);
		
		add(cname);
		add(cpic);
		add(cpre);
		add(cnxt);
		
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
