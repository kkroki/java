import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {

	public Login() {
		JPanel panel = new JPanel();
		JLabel laId = new JLabel("아이디 : ");
		JTextField txtId = new JTextField(10);
		JLabel laPass = new JLabel("패스워드 : ");
		JTextField txtPass = new JTextField(10);
		JButton btnLogin = new JButton("로그인");

		panel.add(laId);
		panel.add(txtId);
		panel.add(laPass);
		panel.add(txtPass);
		panel.add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = "Kim";
				String pass = "1234";

				if (id.equals(txtId.getText()) && pass.equals(txtPass.getText()))
					JOptionPane.showMessageDialog(null, "Success");
				else
					JOptionPane.showMessageDialog(null, "fail");
			}
		});

		add(panel);

		setVisible(true); // 프레임 보이게
		setSize(600, 400); // 사이즈
		setResizable(false); // 사이즈 고정
		setLocationRelativeTo(null); // 화면 정중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료

	}

	public static void main(String[] args) {
		Login frame = new Login();

	}

}
