import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LoginWindow {

	private JFrame frame;
	private JTextField txtKim;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
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
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBackground(Color.GRAY);
//		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("¿©µµøÏ ∫Ù¥ı Ω√¿€");
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel LogInpanel = new JPanel();
		LogInpanel.setBackground(Color.PINK);
		LogInpanel.setBounds(12, 10, 560, 341);
		frame.getContentPane().add(LogInpanel);
		LogInpanel.setLayout(null);
		
		JLabel lblnewLabel_ = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		lblnewLabel_.setBounds(230, 48, 98, 17);
		lblnewLabel_.setVerticalAlignment(SwingConstants.TOP);
		lblnewLabel_.setFont(new Font("±º∏≤√º", Font.BOLD, 14));
		LogInpanel.add(lblnewLabel_);
		
		JLabel laId = new JLabel("\uC544\uC774\uB514 :");
		laId.setFont(new Font("±º∏≤", Font.BOLD, 14));
		laId.setBounds(134, 129, 78, 17);
		LogInpanel.add(laId);
		
		txtKim = new JTextField();
		txtKim.setText("Kim");
		txtKim.setBounds(212, 128, 116, 21);
		LogInpanel.add(txtKim);
		txtKim.setColumns(10);
		
		JLabel laPass = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		laPass.setFont(new Font("±º∏≤", Font.BOLD, 14));
		laPass.setBounds(134, 166, 78, 17);
		LogInpanel.add(laPass);
		
		textField_1 = new JTextField();
		textField_1.setText("1234");
		textField_1.setColumns(10);
		textField_1.setBounds(212, 165, 116, 21);
		LogInpanel.add(textField_1);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setFont(new Font("±º∏≤", Font.BOLD, 14));
		btnNewButton.setBounds(369, 127, 98, 56);
		LogInpanel.add(btnNewButton);
	}
}
