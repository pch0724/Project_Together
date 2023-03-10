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

public class Frame_Shopping_Walk extends JPanel {
	public Frame_Shopping_Walk(MyInfo m, CartDAO cart, SellDAO history) {
		setLayout(null);
		setSize(500, 730);
		setBackground(Color.WHITE);
		Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);

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

		ImageIcon walk1 = new ImageIcon("./img/X자 하네스.PNG");
		JButton btnWalk1 = new JButton(walk1);
		btnWalk1.setName("X자 하네스");

		JLabel aLabel = new JLabel("X자 하네스");
		aLabel.setBounds(95, 315, 185, 20);
		aLabel.setFont(font);
		add(aLabel);

		JLabel aLabel2 = new JLabel("18,900");
		aLabel2.setBounds(115, 330, 185, 20);
		aLabel2.setFont(font);
		add(aLabel2);

		btnWalk1.setSize(200, 200);
		btnWalk1.setLocation(30, 115);
		add(btnWalk1);

		btnWalk1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items walk1 = new ItemDAO().searchItem("X자하네스");
				Frame_Base.getInstance(new Frame_Shopping_WalkInfoPanel(walk1, m, cart, history));

			}
		});

		ImageIcon walk2 = new ImageIcon("./img/리드줄.PNG");
		JButton btnWalk2 = new JButton(walk2);
		btnWalk2.setName("리드줄");

		JLabel bLabel = new JLabel("리드줄");
		bLabel.setBounds(105 + 223, 315, 185, 20);
		bLabel.setFont(font);
		add(bLabel);

		JLabel bLabel2 = new JLabel("9,900");
		bLabel2.setBounds(115 + 223, 330, 185, 20);
		bLabel2.setFont(font);
		add(bLabel2);

		btnWalk2.setSize(200, 200);
		btnWalk2.setLocation(30 + 225, 115);
		add(btnWalk2);

		// btnWalk2.addActionListener
		btnWalk2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items walk2 = new ItemDAO().searchItem("리드줄");
				Frame_Base.getInstance(new Frame_Shopping_WalkInfoPanel(walk2, m, cart, history));

			}
		});

		ImageIcon walk3 = new ImageIcon("./img/LED목걸이.PNG");
		JButton btnWalk3 = new JButton(walk3);
		btnWalk3.setName("LED목걸이");

		JLabel cLabel = new JLabel("LED목걸이");
		cLabel.setBounds(98, 315 + 250, 185, 20);
		cLabel.setFont(font);
		add(cLabel);

		JLabel cLabel2 = new JLabel("12,900");
		cLabel2.setBounds(105 + 10, 325 + 258, 185, 20);
		cLabel2.setFont(font);
		add(cLabel2);

		btnWalk3.setSize(200, 200);
		btnWalk3.setLocation(30, 115 + 250);
		add(btnWalk3);

		// btnWalk3.addActionListener
		btnWalk3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items walk3 = new ItemDAO().searchItem("LED목걸이");
				Frame_Base.getInstance(new Frame_Shopping_WalkInfoPanel(walk3, m, cart, history));

			}
		});

		ImageIcon walk4 = new ImageIcon("./img/휴대용물병.PNG");
		JButton btnWalk4 = new JButton(walk4);
		btnWalk4.setName("휴대용물병");

		JLabel dLabel = new JLabel("휴대용물병");
		dLabel.setBounds(105 + 215, 315 + 250, 185, 20);
		dLabel.setFont(font);
		add(dLabel);

		JLabel dLabel2 = new JLabel("26,000");
		dLabel2.setBounds(115 + 218, 325 + 258, 185, 20);
		dLabel2.setFont(font);
		add(dLabel2);

		btnWalk4.setSize(200, 200);
		btnWalk4.setLocation(30 + 225, 115 + 250);
		add(btnWalk4);

		// btnWalk4.addActionListener
		btnWalk4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Items walk4 = new ItemDAO().searchItem("휴대용물병");
				Frame_Base.getInstance(new Frame_Shopping_WalkInfoPanel(walk4, m, cart, history));

			}
		});

		Bottom_Button bb = new Bottom_Button(m, cart, history);
		add(bb);

	}
}
