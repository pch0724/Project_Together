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

public class register {

	public register() {
// ==============================================
		
		JLabel Jpic1 = new JLabel("����  : ");
		Jpic1.setBounds(20, 130, 40, 30);
		Jpic1.setOpaque(true);
		
		JButton picin=new JButton("�߰��ϱ�");
		picin.setBounds(70, 130, 100, 30);
		picin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
// ==============================================
		// ��[�̸�]
		JLabel Jname1 = new JLabel("�̸�  : ");
		Jname1.setBounds(20, 180, 40, 30);
		Jname1.setOpaque(true);
		//Jname1.setBackground(Color.red);

		// �ؽ�Ʈ �ʵ�
		JPanel Jname = new JPanel();
		Jname.setBounds(60, 180, 120, 40);
		//Jname.setBackground(Color.blue);

		JTextField Jname2 = new JTextField(null, 10);
		
		Jname.add(Jname2);
// ===================================================

		// ��[����]
		JLabel Jage1 = new JLabel("����  : ");
		Jage1.setBounds(20, 230, 40, 30);
		Jage1.setOpaque(true);
		//Jage1.setBackground(Color.red);

		// �ؽ�Ʈ �ʵ�
		JPanel Jage = new JPanel();
		Jage.setBounds(60, 230, 120, 40);
		//Jage.setBackground(Color.blue);

		JTextField Jage2 = new JTextField(null, 10);
		
		Jage.add(Jage2);
// ===================================================

		// �� ����
		JLabel Jgender1 = new JLabel("����  :");
		Jgender1.setOpaque(true);
		//Jgender1.setBackground(Color.red);
		Jgender1.setBounds(20, 280, 40, 30);

		// ���� ���� ��ư
		JPanel Jgender = new JPanel();
		//Jgender.setBackground(Color.BLUE);
		Jgender.setBounds(60, 280, 120, 40);

		JRadioButton JgenderFemale = new JRadioButton("����");
		JRadioButton JgenderMale = new JRadioButton("����");
		ButtonGroup JJgen = new ButtonGroup();

		JJgen.add(JgenderFemale);
		JJgen.add(JgenderMale);

		Jgender.add(JgenderFemale);
		Jgender.add(JgenderMale);
// ===================================================
		//��� �ݱ� ��ư
		
		JButton Enroll=new JButton("���");
		Enroll.setBounds(50, 340, 80, 40);
		Enroll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton Cancle=new JButton("���");
		Cancle.setBounds(160, 340, 80, 40);
		Cancle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		

		// ������=======================
		JFrame jf = new JFrame("�ݷ��� ���");
		jf.setVisible(true);

		jf.setSize(300, 450);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);

		JLabel Jpro = new JLabel("=========== ������Ʈ �� ============");
		Jpro.setOpaque(true);
		//Jpro.setBackground(Color.red);
		Jpro.setBounds(20, 10, 250, 60);

		JLabel Jupdate = new JLabel("=====�ݷ��� ���=====");
		Jupdate.setOpaque(true);
		//Jupdate.setBackground(Color.red);
		Jupdate.setBounds(20, 80, 150, 50);

		jf.add(Jpro);// ������Ʈ[��]
		jf.add(Jupdate);// �ݷ��� ���[��]
		jf.add(Jpic1);
		jf.add(Jname1);// �ݷ��� �̸�[��]
		jf.add(Jage1);// �ݷ��� ����[��]
		jf.add(Jgender1);// �ݷ��� ����[��]
		jf.add(Jname);// �̸� �ؽ�Ʈ �ʵ�
		jf.add(Jage);// ���� �ؽ�Ʈ �ʵ�
		jf.add(Jgender);// ���� �ؽ�Ʈ ��ư
		jf.add(Enroll);
		jf.add(Cancle);
		jf.add(picin);

	}

}
