package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Button.RoundedButton;
import customDAO.CartDAO;
import customDAO.ItemDAO;
import customDAO.Items;
import customDAO.MyInfo;
import customDAO.SellDAO;

public class Frame_Shopping_WalkInfoPanel extends JPanel {
	
	int payMoney;
	MyInfo m;
	CartDAO c;
	Items item;
	int itemId;
	JTextField countField;
	List<ImageIcon> itemImg;
	
	Font font = new Font("에스코어 드림 5 Medium", Font.PLAIN, 15);
	String str;
	
	public Frame_Shopping_WalkInfoPanel(Items item, MyInfo m, CartDAO c, SellDAO history) {
		this.m = m;
		this.c = c;
		this.item = item;
		
		setLayout(null);
		setSize(500, 730);
		setBackground(Color.WHITE);
		
		itemImg = new ArrayList<>();
		
		for (int i = 0; i < ItemDAO.itemList.size(); i++) {

			itemImg.add(new ImageIcon(ItemDAO.itemList.get(i).getItemUrl()));
			if (item.getName().equals(ItemDAO.itemList.get(i).getName())) {
				itemId = ItemDAO.itemList.get(i).getId();

			}
		}
		
		// 로고 라벨
		ImageIcon logophoto = new ImageIcon("img\\투개더로고2.png");
		Image img5 = logophoto.getImage();
		Image changelogophoto = img5.getScaledInstance(250, 80, Image.SCALE_SMOOTH);
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
				Frame_Base.getInstance(new Frame_Shopping_CartPanel(m,c,history));
				
			}
		});
		
		// 이미지를 JLabel에 붙여서 출력
		
		Image image = itemImg.get(itemId).getImage();
		Image newImg = image.getScaledInstance(285, 280, java.awt.Image.SCALE_SMOOTH);

		ImageIcon newIcon = new ImageIcon(newImg);
		JLabel img = new JLabel(newIcon);
		img.setBounds(50, 83, 285, 350);
		add(img);
		
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
				Frame_Base.getInstance(new Frame_Shopping_Walk(m, c, history));
			}
		});		
		//하단버튼
		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(5, 660, 475, 75);
		bottomSet.setLayout(new GridLayout(1, 3, 5, 0));
		bottomSet.setBackground(Color.WHITE);
		
		JLabel countLabel = new JLabel("수량");
		countLabel.setSize(80, 20);
		countLabel.setLocation(350, 310);
		add(countLabel);

		countField = new JTextField(20);
		countField.setSize(80, 20);
		countField.setLocation(400, 310);
		add(countField);
		
		TextArea info = new TextArea("\n  ★상품명" + "\n" + "   " + item.getName() + "\n\n" + "  ★상품가격" + "\n" + "   "
				+ item.getPrice() + "원" + "\n\n  ★상품설명" + "\n" + "   " + item.getItemInfo(), 0, 0,
				TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		info.setFont(font);
		info.setSize(480, 200);
		info.setLocation(0, 455);
		info.setBackground(new Color(255, 255, 255));
		info.setEditable(false);
		info.setFont(font);
		add(info);
		
		RoundedButton sellBtn = new RoundedButton("바로 구매");
		Color c1 = new Color(255,108,0);
		sellBtn.setBackground(c1);
		sellBtn.setFont(font);
		
		sellBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!countField.getText().equals("")) {
					payMoney = Integer.parseInt(countField.getText()) * ItemDAO.itemList.get(itemId).getPrice();
					
					int result = JOptionPane.showConfirmDialog(null,
							"총 " + payMoney + "원을 결제 하시겠습니까?", "결제",
							JOptionPane.YES_NO_CANCEL_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION) {
						JOptionPane.showMessageDialog(null, "결제를 취소하셨습니다.");
					} else if(result == JOptionPane.YES_OPTION) {
						SellDAO.historyMap.get(m.getId()).add(new Items(ItemDAO.itemList.get(itemId).getId(),
								ItemDAO.itemList.get(itemId).getName(), ItemDAO.itemList.get(itemId).getPrice(),
								ItemDAO.itemList.get(itemId).getItemUrl(), Integer.parseInt(countField.getText()),
								ItemDAO.itemList.get(itemId).getItemInfo(), ItemDAO.itemList.get(itemId).getKind()));
						
						JOptionPane.showMessageDialog(null, payMoney + "원을 결제하셨습니다.");
						
					} else {
						JOptionPane.showMessageDialog(null, "결제를 취소하셨습니다.");
					}
					
					
				} else {
					JOptionPane.showMessageDialog(null, "수량을 적으세요.");
				}
				
			}
		});
		bottomSet.add(sellBtn);
		
		RoundedButton cartBnt = new RoundedButton("장바구니 담기");
		
		cartBnt.setBackground(c1);
		cartBnt.setFont(font);
		bottomSet.add(cartBnt);
		
		cartBnt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!countField.getText().equals("")) {
					if(c.registCart(m.getId(),
							new Items(ItemDAO.itemList.get(itemId).getId(), ItemDAO.itemList.get(itemId).getName(),
									ItemDAO.itemList.get(itemId).getPrice(), ItemDAO.itemList.get(itemId).getItemUrl(),
									ItemDAO.itemList.get(itemId).getItemInfo(),
									ItemDAO.itemList.get(itemId).getKind()))){
										
						CartDAO.cartMap.get(m.getId()).add(new Items(ItemDAO.itemList.get(itemId).getId(),
								ItemDAO.itemList.get(itemId).getName(), ItemDAO.itemList.get(itemId).getPrice(),
								ItemDAO.itemList.get(itemId).getItemUrl(), Integer.parseInt(countField.getText()),
								ItemDAO.itemList.get(itemId).getItemInfo(), ItemDAO.itemList.get(itemId).getKind()));
					
					}else {
						for (int i = 0; i < CartDAO.cartMap.get(m.getId()).size(); i++) {

							CartDAO.cartMap.get(m.getId()).get(i).setCnt(CartDAO.cartMap.get(m.getId()).get(i).getCnt()
									+ Integer.parseInt(countField.getText()));
						}
					}
					JOptionPane.showMessageDialog(null, "장바구니 담기");
				}else {
					JOptionPane.showMessageDialog(null, "수량을 입력하시오");
				}
				
				
			}
		});
		add(bottomSet);
		
		
	}
	
	
	
	
}
