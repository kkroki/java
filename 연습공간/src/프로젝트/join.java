package 프로젝트;

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
	private JTextField 아이디;
	private JTextField 이름;
	private JTextField 비밀번호;
	private JTextField 휴대전화;
	private JTextField 생년;
	private JTextField 일;
	private JTextField 이메일;

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
		laJoin.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		laJoin.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(laJoin);
		
		JLabel la1 = new JLabel("\uC544\uC774\uB514");
		la1.setBounds(46, 100, 75, 33);
		la1.setHorizontalAlignment(SwingConstants.CENTER);
		la1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la1);
		
		JLabel la2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		la2.setBounds(46, 150, 75, 33);
		la2.setHorizontalAlignment(SwingConstants.CENTER);
		la2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la2);
		
		JLabel la3 = new JLabel("\uC774\uB984");
		la3.setBounds(46, 200, 75, 33);
		la3.setHorizontalAlignment(SwingConstants.CENTER);
		la3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la3);
		
		JLabel la4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		la4.setBounds(46, 250, 75, 33);
		la4.setHorizontalAlignment(SwingConstants.CENTER);
		la4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la4);
		
		JLabel la5 = new JLabel("\uC131\uBCC4");
		la5.setBounds(46, 300, 75, 33);
		la5.setHorizontalAlignment(SwingConstants.CENTER);
		la5.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la5);
		
		JLabel la6 = new JLabel("\uD734\uB300\uC804\uD654");
		la6.setBounds(46, 350, 75, 33);
		la6.setHorizontalAlignment(SwingConstants.CENTER);
		la6.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la6);		
		
		JLabel la7 = new JLabel("\uC774\uBA54\uC77C");
		la7.setBounds(46, 400, 75, 33);
		la7.setHorizontalAlignment(SwingConstants.CENTER);
		la7.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(la7);
		
		아이디 = new JTextField();
		아이디.setBounds(129, 100, 231, 33);
		아이디.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		panel.add(아이디);
		아이디.setColumns(10);
		
		이름 = new JTextField();
		이름.setBounds(129, 150, 231, 33);
		이름.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		이름.setColumns(10);
		panel.add(이름);
		
		비밀번호 = new JTextField();
		비밀번호.setBounds(129, 200, 231, 33);
		비밀번호.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		비밀번호.setColumns(10);
		panel.add(비밀번호);
		
		생년 = new JTextField();
		생년.setBounds(129, 250, 66, 33);
		생년.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		생년.setColumns(10);
		panel.add(생년);
		
		일 = new JTextField("일");
		일.setBounds(294, 250, 66, 33);
		일.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		일.setColumns(10);
		panel.add(일);
		
		휴대전화 = new JTextField();
		휴대전화.setBounds(129, 350, 231, 33);
		휴대전화.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		휴대전화.setColumns(10);
		panel.add(휴대전화);
		
		이메일 = new JTextField();
		이메일.setBounds(129, 400, 231, 33);
		이메일.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		이메일.setColumns(10);
		panel.add(이메일);
			
		
		JComboBox 월 = new JComboBox(new Object[]{"월",1,2,3,4,5,6,7,8,9,10,11,12});
		월.setBounds(207, 250, 75, 33);
		월.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(월);
	
		String[] combo = {"성별" , "남자" , "여자" };
		JComboBox gender = new JComboBox(combo);
		gender.setBounds(129, 300, 231, 33);
		gender.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel.add(gender);
				
		JButton btnJoin = new JButton("\uAC00\uC785\uD558\uAE30");
		btnJoin.setBounds(129, 480, 231, 50);
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJoin.setForeground(Color.WHITE);
		btnJoin.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnJoin.setBackground(new Color(51, 153, 204));
		panel.add(btnJoin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\image\\112.jpg"));
		lblNewLabel.setBounds(0, 0, 464, 561);
		panel.add(lblNewLabel);
		
	}
}

