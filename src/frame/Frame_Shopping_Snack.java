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


public class Frame_Shopping_Snack extends JPanel{
	public Frame_Shopping_Snack(MyInfo m, CartDAO cart, SellDAO history) {
		setLayout(null);
		setSize(500, 730);
		setBackground(Color.WHITE);	
		Font font = new Font("맑은고딕", Font.BOLD, 15);
		
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
		
		JButton cartBtn = new JButton("장바구니");
		cartBtn.setBackground(Color.WHITE);
		cartBtn.setSize(60, 60);
		cartBtn.setLocation(420, 0);
		add(cartBtn);
		cartBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_CartPanel(m,cart,history));
				
			}
		});
		
		
		JButton backBtn = new JButton("뒤로가기");
		backBtn.setBackground(Color.WHITE);
		backBtn.setSize(60, 60);
		backBtn.setLocation(5, 0);
		add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping(m, cart, history));
			}
		});
		
		ImageIcon snack1 = new ImageIcon("./img/오리목뼈.PNG");
		JButton btnSnack1 = new JButton(snack1);
		btnSnack1.setName("오리목뼈");
		
		JLabel aLabel = new JLabel("오리목뼈");
		aLabel.setBounds(105, 315, 185, 20);
		aLabel.setFont(font);
		add(aLabel);
		
		JLabel aLabel2 = new JLabel("4,500");
		aLabel2.setBounds(115, 330, 185, 20);
		aLabel2.setFont(font);
		add(aLabel2);

		btnSnack1.setSize(200, 200);
		btnSnack1.setLocation(30, 115);
		add(btnSnack1);
		
		btnSnack1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items snack1 = new ItemDAO().searchItem("오리목뼈");
				Frame_Base.getInstance(new Frame_Shopping_SnackInfoPanel(snack1, m, cart, history));
				
			}
		});
		
		ImageIcon snack2 = new ImageIcon("./img/닭고기육포.PNG");
		JButton btnSnack2 = new JButton(snack2);
		btnSnack2.setName("닭고기육포");
		
		JLabel bLabel = new JLabel("닭고기육포");
		bLabel.setBounds(105+215, 315, 185, 20);
		bLabel.setFont(font);
		add(bLabel);
		
		JLabel bLabel2 = new JLabel("5,500");
		bLabel2.setBounds(115+223, 330, 185, 20);
		bLabel2.setFont(font);
		add(bLabel2);
		
		btnSnack2.setSize(200, 200);
		btnSnack2.setLocation(30+225, 115);
		add(btnSnack2);
		
		//btnSnack2.addActionListener
		btnSnack2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items snack2 = new ItemDAO().searchItem("닭고기육포");
				Frame_Base.getInstance(new Frame_Shopping_SnackInfoPanel(snack2, m, cart, history));
				
			}
		});
		
		ImageIcon snack3 = new ImageIcon("./img/도기넛칩.PNG");
		JButton btnSnack3 = new JButton(snack3);
		btnSnack3.setName("도기넛칩");
		
		JLabel cLabel = new JLabel("도기넛칩");
		cLabel.setBounds(105, 315+250, 185, 20);
		cLabel.setFont(font);
		add(cLabel);
		
		JLabel cLabel2 = new JLabel("7,000");
		cLabel2.setBounds(105+10, 325+258, 185, 20);
		cLabel2.setFont(font);
		add(cLabel2);
		
		btnSnack3.setSize(200, 200);
		btnSnack3.setLocation(30, 115+250);
		add(btnSnack3);
		
		//btnSnack3.addActionListener
		btnSnack3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items snack3 = new ItemDAO().searchItem("도기넛칩");
				Frame_Base.getInstance(new Frame_Shopping_SnackInfoPanel(snack3, m, cart, history));
				
			}
		});		
		
		ImageIcon snack4 = new ImageIcon("./img/소근스틱.PNG");
		JButton btnSnack4 = new JButton(snack4);
		btnSnack4.setName("소근스틱");
		
		JLabel dLabel = new JLabel("소근스틱");
		dLabel.setBounds(105+215, 315+250, 185, 20);
		dLabel.setFont(font);
		add(dLabel);
		
		JLabel dLabel2 = new JLabel("5,300");
		dLabel2.setBounds(115+218, 325+258, 185, 20);
		dLabel2.setFont(font);
		add(dLabel2);
		
		btnSnack4.setSize(200, 200);
		btnSnack4.setLocation(30+225, 115+250);
		add(btnSnack4);
		
		//btnSnack4.addActionListener
		btnSnack4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Items snack4 = new ItemDAO().searchItem("소근스틱");
				Frame_Base.getInstance(new Frame_Shopping_SnackInfoPanel(snack4, m, cart, history));
				
			}
		});		
		
		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
		
		
		
	}
}
