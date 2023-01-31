package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame_UpdateDog extends JPanel{

	public Frame_UpdateDog() {
		setLayout(null);
		// ==============================================

		JLabel JJpic1 = new JLabel("사진 : ");
		JJpic1.setBounds(20, 130, 40, 30);
		JJpic1.setOpaque(true);

		JButton Jpicin = new JButton("변경하기");
		Jpicin.setBounds(70, 130, 100, 30);
		Jpicin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		// ==============================================
		// 라벨[이름]
		JLabel JJname1 = new JLabel("이름 : ");
		JJname1.setBounds(20, 180, 40, 30);
		JJname1.setOpaque(true);
		// Jname1.setBackground(Color.red);
		// 텍스트 필드
		JPanel JJname = new JPanel();
		JJname.setBounds(60, 180, 120, 40);
		// Jname.setBackground(Color.blue);

		JTextField JJname2 = new JTextField(null, 10);

		JJname.add(JJname2);
		// ===================================================
		// 라벨[나이]
		JLabel JJage1 = new JLabel("나이 : ");
		JJage1.setBounds(20, 230, 40, 30);
		JJage1.setOpaque(true);
		// Jage1.setBackground(Color.red);
		// 텍스트 필드
		JPanel JJage = new JPanel();
		JJage.setBounds(60, 230, 120, 40);
		// Jage.setBackground(Color.blue);

		JTextField JJage2 = new JTextField(null, 10);

		JJage.add(JJage2);
		// ===================================================

		// 라벨 성별
		JLabel JJgender1 = new JLabel("성별");
		JJgender1.setOpaque(true);
		// Jgender1.setBackground(Color.red);
		JJgender1.setBounds(20, 280, 40, 30);
		// 성별 라디오 버튼
		JPanel JJgender = new JPanel();
		// Jgender.setBackground(Color.BLUE);
		JJgender.setBounds(60, 280, 120, 40);

		JRadioButton JJgenderFemale = new JRadioButton("암컷");
		JRadioButton JJgenderMale = new JRadioButton("수컷");
		ButtonGroup JJJgen = new ButtonGroup();

		JJJgen.add(JJgenderFemale);
		JJJgen.add(JJgenderMale);

		JJgender.add(JJgenderFemale);
		JJgender.add(JJgenderMale);
		// ===================================================
		// 등록 닫기 버튼

		JButton JEnroll = new JButton("수정");
		JEnroll.setBounds(50, 340, 80, 40);
		JEnroll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_MyPage());

			}
		});

		JButton JCancle = new JButton("취소");
		JCancle.setBounds(160, 340, 80, 40);
		JCancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Base.getInstance(new Frame_MyPage());

			}
		});
		/*
		// 프레임=======================
		JFrame jjf = new JFrame("반려견 수정");
		jjf.setVisible(true);

		jjf.setSize(300, 450);
		jjf.setLocationRelativeTo(null);
		jjf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jjf.getContentPane().setLayout(null);
		*/
		JLabel JJpro = new JLabel("=========== 프로젝트 명 ============");
		JJpro.setOpaque(true);
		// Jpro.setBackground(Color.red);
		JJpro.setBounds(20, 10, 250, 60);

		JLabel JJupdate = new JLabel("=====반려견 수정=====");
		JJupdate.setOpaque(true);
		// Jupdate.setBackground(Color.red);
		JJupdate.setBounds(20, 80, 150, 50);

		add(JJpro);// 프로젝트[라벨]
		add(JJupdate);// 반려견 수정[라벨]
		add(JJpic1);
		add(JJname1);// 반려견 이름[라벨]
		add(JJage1);// 반려견 나이[라벨]
		add(JJgender1);// 반려견 성별[라벨]
		add(JJname);// 이름 텍스트 필드
		add(JJage);// 나이 텍스트 필드
		add(JJgender);// 성별 텍스트 버튼
		add(JEnroll);
		add(JCancle);
		add(Jpicin);

	}
	/*
	public static void main(String[] args) {

		new update();
	}
	*/
}
