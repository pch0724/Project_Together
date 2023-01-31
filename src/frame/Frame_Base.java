package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame_Base extends JFrame{
		
	private static Frame_Base instance;
		
	private Frame_Base(JPanel e) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//기본 프레임 구조
		setTitle("Together");
		setLayout(null);
		setBounds((int)tk.getScreenSize().getWidth() / 2 - 225,
				(int)tk.getScreenSize().getHeight() / 2 -300,
				450, 600);
		
		JButton btnhome = new JButton("홈");
		JButton btnwork = new JButton("산책");
		JButton btnshop = new JButton("쇼핑");
		JButton btnmy = new JButton("마이페이지");
		
		setLayout(null);
		btnhome.setBounds(0,520,20,20);
		btnwork.setBounds(450/4,520, 20,20);
		btnshop.setBounds(220,520,20,20);
		btnmy.setBounds(330,520,20,20);
		
		
		add(btnhome);
		add(btnwork);
		add(btnshop);
		add(btnmy);
		
		
		// 패널 추가
		add(e);
		
		
		//버튼(외부에서 따로 만들어서 패널처럼 불러오기)
		JLabel nav = new JLabel("a");
		nav.setSize(450, 100);
		nav.setLocation(0, 500);
		nav.setLayout(new FlowLayout());
		
        JButton home = new JButton("홈");
        JButton work = new JButton("산책");
        JButton shop = new JButton("쇼핑");
        JButton my = new JButton("마이페이지");
        
        //home.setBounds(0,501,450/4,50);
        home.setSize(80, 30);
        //home.setLocation(0, 501);
        work.setSize(80, 30);
        //work.setLocation(EXIT_ON_CLOSE, ABORT);
        shop.setSize(80, 30);
        //shop.setLocation(EXIT_ON_CLOSE, ABORT);        
        my.setSize(80, 30);
        //my.setLocation(EXIT_ON_CLOSE, ABORT);
        
        //work.setBounds(450/4,501,450/4,50);
        //shop.setBounds(220,501,450/4,50);
        //my.setBounds(330,501,450/4,50);
	        
	    add(nav);    
        nav.add(home);
        nav.add(work);
        nav.add(shop);
        nav.add(my);
		
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void getInstance (JPanel e) {
		instance = new Frame_Base(e);
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
		
	}
	
}

