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

public class Frame_Shopping_Toy extends JPanel {
	public Frame_Shopping_Toy(MyInfo m, CartDAO cart, SellDAO history) {
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

		// 장바구니
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
				Frame_Base.getInstance(new Frame_Shopping_CartPanel(m, cart, history));

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

		ImageIcon toy1 = new ImageIcon("./img/삑삑이공.PNG");
		JButton btnToy1 = new JButton(toy1);
		btnToy1.setName("삑삑이공");

		JLabel aLabel = new JLabel("삑삑이공");
		aLabel.setBounds(105, 315, 185, 20);
		aLabel.setFont(font);
		add(aLabel);

		JLabel aLabel2 = new JLabel("4,300");
		aLabel2.setBounds(115, 330, 185, 20);
		aLabel2.setFont(font);
		add(aLabel2);

		btnToy1.setSize(200, 200);
		btnToy1.setLocation(30, 115);
		add(btnToy1);

		btnToy1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items toy1 = new ItemDAO().searchItem("삑삑이공");
				Frame_Base.getInstance(new Frame_Shopping_ToyInfoPanel(toy1, m, cart, history));
			}
		});

		ImageIcon toy2 = new ImageIcon("./img/우드스틱.PNG");
		JButton btnToy2 = new JButton(toy2);
		btnToy2.setName("우드스틱");

		JLabel bLabel = new JLabel("우드스틱");
		bLabel.setBounds(105 + 215, 315, 185, 20);
		bLabel.setFont(font);
		add(bLabel);

		JLabel bLabel2 = new JLabel("5,000");
		bLabel2.setBounds(115 + 223, 330, 185, 20);
		bLabel2.setFont(font);
		add(bLabel2);

		btnToy2.setSize(200, 200);
		btnToy2.setLocation(30 + 225, 115);
		add(btnToy2);

		// btnToy2.addActionListener

		btnToy2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items toy2 = new ItemDAO().searchItem("우드스틱");
				Frame_Base.getInstance(new Frame_Shopping_ToyInfoPanel(toy2, m, cart, history));
			}
		});

		ImageIcon toy3 = new ImageIcon("./img/터그볼.PNG");
		JButton btnToy3 = new JButton(toy3);
		btnToy3.setName("터그볼");

		JLabel cLabel = new JLabel("터그볼");
		cLabel.setBounds(105, 315 + 250, 185, 20);
		cLabel.setFont(font);
		add(cLabel);

		JLabel cLabel2 = new JLabel("6,900");
		cLabel2.setBounds(100 + 10, 325 + 258, 185, 20);
		cLabel2.setFont(font);
		add(cLabel2);

		btnToy3.setSize(200, 200);
		btnToy3.setLocation(30, 115 + 250);
		add(btnToy3);

		// btnToy3.addActionListener
		btnToy3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items toy3 = new ItemDAO().searchItem("터그볼");
				Frame_Base.getInstance(new Frame_Shopping_ToyInfoPanel(toy3, m, cart, history));
			}
		});

		ImageIcon toy4 = new ImageIcon("./img/당근밭노즈워크.PNG");
		JButton btnToy4 = new JButton(toy4);
		btnToy4.setName("당근밭 노즈워크");

		JLabel dLabel = new JLabel("당근밭 노즈워크");
		dLabel.setBounds(75 + 215, 315 + 250, 185, 20);
		dLabel.setFont(font);
		add(dLabel);

		JLabel dLabel2 = new JLabel("23,900");
		dLabel2.setBounds(115 + 218, 325 + 258, 185, 20);
		dLabel2.setFont(font);
		add(dLabel2);

		btnToy4.setSize(200, 200);
		btnToy4.setLocation(30 + 225, 115 + 250);
		add(btnToy4);

		// btnToy4.addActionListener
		btnToy4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items toy4 = new ItemDAO().searchItem("당근밭 노즈워크");
				Frame_Base.getInstance(new Frame_Shopping_ToyInfoPanel(toy4, m, cart, history));
			}
		});

		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);

	}
}
