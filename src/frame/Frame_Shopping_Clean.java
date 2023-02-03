package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import customDAO.CartDAO;
import customDAO.ItemDAO;
import customDAO.Items;
import customDAO.MyInfo;
import customDAO.SellDAO;


public class Frame_Shopping_Clean extends JPanel{
	public Frame_Shopping_Clean(MyInfo m, CartDAO cart, SellDAO history) {
		setLayout(null);
		setSize(500, 730);
		setBackground(Color.WHITE);	
		Font font=new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);
		
		
		// 로고 라벨
		ImageIcon logophoto = new ImageIcon("img\\투개더로고2.png");
		Image img = logophoto.getImage();
		Image changelogophoto = img.getScaledInstance(250, 80, Image.SCALE_SMOOTH);
		ImageIcon logophoto2 = new ImageIcon(changelogophoto);

		JLabel logo = new JLabel(logophoto2);
		logo.setHorizontalAlignment(SwingConstants.CENTER);// 사진정렬-가운데
		logo.setBounds(115, 20, 250, 80);
		logo.setOpaque(true);
		logo.setBackground(Color.GRAY);
		add(logo);
		//장바구니
		ImageIcon cart1 = new ImageIcon("img\\장바구니1.png");
		ImageIcon cart2 = new ImageIcon("img\\장바구니2.png");
		JButton cartBtn = new JButton(cart1);
		cartBtn.setContentAreaFilled(false);
		cartBtn.setBorderPainted(false);
		cartBtn.setRolloverIcon(cart2);// 버튼의 외곽선 없에
		cartBtn.setSize(80, 80);
		cartBtn.setLocation(410, 0);
		add(cartBtn);
		cartBtn.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_CartPanel(m,cart,history));
				
			}
		});
		
		ImageIcon back = new ImageIcon("img\\뒤1.png");
		ImageIcon back2 = new ImageIcon("img\\뒤2.png");
		JButton backBtn = new JButton(back);
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		backBtn.setRolloverIcon(back2);// 버튼의 외곽선 없에
		backBtn.setSize(60, 60);
		backBtn.setLocation(5, 0);
		add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping(m, cart, history));
			}
		});
		
		ImageIcon clean1 = new ImageIcon("./img/눈물자국시트30매.PNG");
		JButton btnClean1 = new JButton(clean1);
		btnClean1.setName("눈물자국시트30매");
		
		JLabel aLabel = new JLabel("눈물자국시트30매");
		aLabel.setBounds(75, 315, 185, 20);
		aLabel.setFont(font);
		add(aLabel);
		
		JLabel aLabel2 = new JLabel("3,000");
		aLabel2.setBounds(115, 330, 185, 20);
		aLabel2.setFont(font);
		add(aLabel2);

		btnClean1.setSize(200, 200);
		btnClean1.setLocation(30, 115);
		add(btnClean1);
		
		btnClean1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items clean1 = new ItemDAO().searchItem("눈물자국시트30매");
				Frame_Base.getInstance(new Frame_Shopping_CleanInfoPanel(clean1, m, cart, history));
				
			}
		});
		
		ImageIcon clean2 = new ImageIcon("./img/배변봉투(리필)120매.PNG");
		JButton btnClean2 = new JButton(clean2);
		btnClean2.setName("배변봉투(리필)120매");
		
		JLabel bLabel = new JLabel("배변봉투(리필)120매");
		bLabel.setBounds(75+215, 315, 185, 20);
		bLabel.setFont(font);
		add(bLabel);
		
		JLabel bLabel2 = new JLabel("7,800");
		bLabel2.setBounds(115+223, 330, 185, 20);
		bLabel2.setFont(font);
		add(bLabel2);
		
		btnClean2.setSize(200, 200);
		btnClean2.setLocation(30+225, 115);
		add(btnClean2);
		
		//btnClean2.addActionListener
		btnClean2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items clean2 = new ItemDAO().searchItem("배변봉투(리필)120매");
				Frame_Base.getInstance(new Frame_Shopping_CleanInfoPanel(clean2, m, cart, history));
				
			}
		});
		
		ImageIcon clean3 = new ImageIcon("./img/한장쓱패드400매.PNG");
		JButton btnClean3 = new JButton(clean3);
		btnClean3.setName("한장쓱패드400매");
		
		JLabel cLabel = new JLabel("한장쓱패드400매");
		cLabel.setBounds(78, 315+250, 185, 20);
		cLabel.setFont(font);
		add(cLabel);
		
		JLabel cLabel2 = new JLabel("28,650");
		cLabel2.setBounds(105+10, 325+258, 185, 20);
		cLabel2.setFont(font);
		add(cLabel2);
		
		btnClean3.setSize(200, 200);
		btnClean3.setLocation(30, 115+250);
		add(btnClean3);
		
		//btnClean3.addActionListener
		
		btnClean3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items clean3 = new ItemDAO().searchItem("한장쓱패드400매");
				Frame_Base.getInstance(new Frame_Shopping_CleanInfoPanel(clean3, m, cart, history));
				
			}
		});
		
		ImageIcon clean4 = new ImageIcon("./img/명품패드300매.PNG");
		JButton btnClean4 = new JButton(clean4);
		btnClean4.setName("명품패드300매");
		
		JLabel dLabel = new JLabel("명품패드300매");
		dLabel.setBounds(85+215, 315+250, 185, 20);
		dLabel.setFont(font);
		add(dLabel);
		
		JLabel dLabel2 = new JLabel("46,200");
		dLabel2.setBounds(115+218, 325+258, 185, 20);
		dLabel2.setFont(font);
		add(dLabel2);
		
		btnClean4.setSize(200, 200);
		btnClean4.setLocation(30+225, 115+250);
		add(btnClean4);
		
		//btnClean4.addActionListener
		btnClean4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items clean4 = new ItemDAO().searchItem("명품패드300매");
				Frame_Base.getInstance(new Frame_Shopping_CleanInfoPanel(clean4, m, cart, history));
				
			}
		});
		
		
		
		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
		
	}
}
