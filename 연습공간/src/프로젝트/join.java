package ������Ʈ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class join extends JFrame {

	private JPanel contentPane;
	private JTextField ���̵�;
	private JTextField �̸�;
	private JTextField ��й�ȣ;
	private JTextField �޴���ȭ;
	private JTextField ����;
	private JTextField ��;
	private JTextField �̸���;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					join frame = new join();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public join() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 464, 561);
		contentPane.add(panel);
		panel.setLayout(null);
	
		
		
		JLabel laJoin = new JLabel("\uD68C\uC6D0 \uAC00\uC785 \uD398\uC774\uC9C0");
		laJoin.setBounds(12, 10, 444, 47);
		laJoin.setFont(new Font("���� ���", Font.BOLD, 25));
		laJoin.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(laJoin);
		
		JLabel la1 = new JLabel("\uC544\uC774\uB514");
		la1.setBounds(46, 100, 75, 33);
		la1.setHorizontalAlignment(SwingConstants.CENTER);
		la1.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la1);
		
		JLabel la2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		la2.setBounds(46, 150, 75, 33);
		la2.setHorizontalAlignment(SwingConstants.CENTER);
		la2.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la2);
		
		JLabel la3 = new JLabel("\uC774\uB984");
		la3.setBounds(46, 200, 75, 33);
		la3.setHorizontalAlignment(SwingConstants.CENTER);
		la3.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la3);
		
		JLabel la4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		la4.setBounds(46, 250, 75, 33);
		la4.setHorizontalAlignment(SwingConstants.CENTER);
		la4.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la4);
		
		JLabel la5 = new JLabel("\uC131\uBCC4");
		la5.setBounds(46, 300, 75, 33);
		la5.setHorizontalAlignment(SwingConstants.CENTER);
		la5.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la5);
		
		JLabel la6 = new JLabel("\uD734\uB300\uC804\uD654");
		la6.setBounds(46, 350, 75, 33);
		la6.setHorizontalAlignment(SwingConstants.CENTER);
		la6.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la6);		
		
		JLabel la7 = new JLabel("\uC774\uBA54\uC77C");
		la7.setBounds(46, 400, 75, 33);
		la7.setHorizontalAlignment(SwingConstants.CENTER);
		la7.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(la7);
		
		���̵� = new JTextField();
		���̵�.setBounds(129, 100, 231, 33);
		���̵�.setFont(new Font("���� ���", Font.PLAIN, 18));
		panel.add(���̵�);
		���̵�.setColumns(10);
		
		�̸� = new JTextField();
		�̸�.setBounds(129, 150, 231, 33);
		�̸�.setFont(new Font("���� ���", Font.PLAIN, 18));
		�̸�.setColumns(10);
		panel.add(�̸�);
		
		��й�ȣ = new JTextField();
		��й�ȣ.setBounds(129, 200, 231, 33);
		��й�ȣ.setFont(new Font("���� ���", Font.PLAIN, 18));
		��й�ȣ.setColumns(10);
		panel.add(��й�ȣ);
		
		���� = new JTextField();
		����.setBounds(129, 250, 66, 33);
		����.setFont(new Font("���� ���", Font.PLAIN, 18));
		����.setColumns(10);
		panel.add(����);
		
		�� = new JTextField("��");
		��.setBounds(294, 250, 66, 33);
		��.setFont(new Font("���� ���", Font.PLAIN, 18));
		��.setColumns(10);
		panel.add(��);
		
		�޴���ȭ = new JTextField();
		�޴���ȭ.setBounds(129, 350, 231, 33);
		�޴���ȭ.setFont(new Font("���� ���", Font.PLAIN, 18));
		�޴���ȭ.setColumns(10);
		panel.add(�޴���ȭ);
		
		�̸��� = new JTextField();
		�̸���.setBounds(129, 400, 231, 33);
		�̸���.setFont(new Font("���� ���", Font.PLAIN, 18));
		�̸���.setColumns(10);
		panel.add(�̸���);
			
		
		JComboBox �� = new JComboBox(new Object[]{"��",1,2,3,4,5,6,7,8,9,10,11,12});
		��.setBounds(207, 250, 75, 33);
		��.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(��);
	
		String[] combo = {"����" , "����" , "����" };
		JComboBox gender = new JComboBox(combo);
		gender.setBounds(129, 300, 231, 33);
		gender.setFont(new Font("���� ���", Font.BOLD, 18));
		panel.add(gender);
				
		JButton btnJoin = new JButton("\uAC00\uC785\uD558\uAE30");
		btnJoin.setBounds(129, 480, 231, 50);
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJoin.setForeground(Color.WHITE);
		btnJoin.setFont(new Font("���� ���", Font.BOLD, 17));
		btnJoin.setBackground(new Color(51, 153, 204));
		panel.add(btnJoin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\image\\112.jpg"));
		lblNewLabel.setBounds(0, 0, 464, 561);
		panel.add(lblNewLabel);
		
	}
}

