package «¡∑Œ¡ß∆Æ;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImgPanel panel = new ImgPanel(new ImageIcon("C:\\Users\\admin\\Desktop\\image\\1122.jpg").getImage());
		frame.getContentPane().setLayout(null);
		
		JPanel Panel = new JPanel();
		panel.setBounds(0, 0, 434, 296);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		lblNewLabel.setBounds(119, 10, 186, 55);
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lblNewLabel_1_1.setFont(new Font("±º∏≤", Font.BOLD, 16));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(37, 153, 98, 32);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(147, 113, 139, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("\uB85C\uADF8\uC778");
		btn1.setBackground(new Color(51, 153, 204));
		btn1.setBounds(136, 215, 169, 32);
		panel.add(btn1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 160, 139, 32);
		panel.add(textField_1);
		
		JButton btn2 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new join().setVisible(true);;
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(new Color(51, 153, 204));
		btn2.setBounds(136, 257, 169, 32);
		panel.add(btn2);
		  btn2.setBorderPainted(false);
	      btn2.setFocusPainted(false);
	      btn2.setContentAreaFilled(false);
		
		

		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("±º∏≤", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(37, 111, 98, 32);
		panel.add(lblNewLabel_1_1_1);
	}
}

class ImgPanel extends JPanel{
	private Image img;
	
	public ImgPanel(Image img){
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, null);
	}
}