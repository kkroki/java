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
		JLabel laId = new JLabel("���̵� : ");
		JTextField txtId = new JTextField(10);
		JLabel laPass = new JLabel("�н����� : ");
		JTextField txtPass = new JTextField(10);
		JButton btnLogin = new JButton("�α���");

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

		setVisible(true); // ������ ���̰�
		setSize(600, 400); // ������
		setResizable(false); // ������ ����
		setLocationRelativeTo(null); // ȭ�� ���߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ����

	}

	public static void main(String[] args) {
		Login frame = new Login();

	}

}
