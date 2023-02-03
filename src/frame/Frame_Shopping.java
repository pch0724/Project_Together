package frame;

import java.awt.Button;
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
import customDAO.MyInfo;
import customDAO.SellDAO;
import frame.Frame_Base;

public class Frame_Shopping extends JPanel {

	public Frame_Shopping() {
	}
	
	public Frame_Shopping(MyInfo m, CartDAO cart, SellDAO history) {
		setLayout(null);
		setSize(500, 730);
		setBackground(Color.WHITE);

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

		ImageIcon ms= new ImageIcon("img\\메인.gif");
		JLabel cateBtn = new JLabel(ms);
		cateBtn.setBackground(Color.WHITE);
		cateBtn.setSize(500, 480);
		cateBtn.setLocation(0, 80);
		add(cateBtn);

		
		ImageIcon cart1 = new ImageIcon("img\\장바구니1.png");
		ImageIcon cart2 = new ImageIcon("img\\장바구니2.png");
		JButton cartBtn = new JButton(cart1);
		cartBtn.setContentAreaFilled(false);
		cartBtn.setBorderPainted(false);
		cartBtn.setRolloverIcon(cart2);// 버튼의 외곽선 없에
		cartBtn.setSize(80, 80);
		cartBtn.setLocation(410, 0);
		add(cartBtn);

		

		ImageIcon snack = new ImageIcon("img\\간식1.png");
		ImageIcon scnak2 = new ImageIcon("img\\간식2.png");
		JButton product1Btn = new JButton(snack);
		product1Btn.setContentAreaFilled(false);
		product1Btn.setBorderPainted(false); // 버튼의 외곽선 없에
		product1Btn.setRolloverIcon(scnak2);
		product1Btn.setSize(100, 100);
		product1Btn.setLocation(50, 550);
		add(product1Btn);
		product1Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Snack(m, cart, history));

			}// snack으로 연결
		});
		
		
		ImageIcon toy = new ImageIcon("img\\놀이1.png");
		ImageIcon toy2 = new ImageIcon("img\\놀이2.png");
		JButton product2Btn = new JButton(toy);
		product2Btn.setContentAreaFilled(false);
		product2Btn.setBorderPainted(false); // 버튼의 외곽선 없에기
		product2Btn.setRolloverIcon(toy2);
		product2Btn.setSize(100, 100);
		product2Btn.setLocation(product1Btn.getX() + 100, product1Btn.getY());
		add(product2Btn);
		product2Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new  Frame_Shopping_Toy(m, cart, history));

			}// toy로 연결
		});

		ImageIcon poo = new ImageIcon("img\\배변1.png");
		ImageIcon poo2 = new ImageIcon("img\\배변2.png");
		JButton product3Btn = new JButton(poo);
		product3Btn.setContentAreaFilled(false);
		product3Btn.setBorderPainted(false); // 버튼의 외곽선 없에기
		product3Btn.setRolloverIcon(poo2);
		product3Btn.setSize(100, 100);
		product3Btn.setLocation(product1Btn.getX()+200, product1Btn.getY());
		add(product3Btn);
		product3Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Clean(m, cart, history));

			}// clean으로 연결
		});
		
		
		ImageIcon walk = new ImageIcon("img\\산책1.png");
		ImageIcon walk2 = new ImageIcon("img\\산책2.png");
		JButton product4Btn = new JButton(walk);
		product4Btn.setContentAreaFilled(false);
		product4Btn.setBorderPainted(false); // 버튼의 외곽선 없에기
		product4Btn.setRolloverIcon(walk2);
		product4Btn.setSize(100, 100);
		product4Btn.setLocation(product1Btn.getX() + 300, product1Btn.getY());
		add(product4Btn);
		product4Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_Shopping_Walk(m, cart, history));

			}// walk로 연결
		});

		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);
	}

}
