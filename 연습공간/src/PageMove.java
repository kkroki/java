import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageMove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageMove window = new PageMove();
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
	public PageMove() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel FirstPage = new JPanel();
		FirstPage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(FirstPage);
		FirstPage.setLayout(null);

		JLabel la1 = new JLabel("\uCCAB\uBC88\uC9F8 \uD398\uC774\uC9C0");
		la1.setFont(new Font("±¼¸²", Font.BOLD, 17));
		la1.setHorizontalAlignment(SwingConstants.CENTER);
		la1.setBounds(39, 27, 358, 54);
		FirstPage.add(la1);

		JButton btn1 = new JButton("\uB2E4\uC74C\uD398\uC774\uC9C0\uB85C");

		btn1.setBounds(12, 91, 109, 140);
		FirstPage.add(btn1);

		JPanel SecondPage = new JPanel();
		SecondPage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(SecondPage);
		SecondPage.setLayout(null);

		JLabel la2 = new JLabel("\uB450\uBC88\uC9F8 \uD398\uC774\uC9C0");
		la2.setHorizontalAlignment(SwingConstants.CENTER);
		la2.setFont(new Font("±¼¸²", Font.BOLD, 17));
		la2.setBounds(43, 10, 345, 87);
		SecondPage.add(la2);

		JButton btn2 = new JButton("\uC774\uC804\uD398\uC774\uC9C0\uB85C");
		btn2.setBounds(285, 107, 109, 144);
		SecondPage.add(btn2);

		SecondPage.setVisible(false);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.setVisible(false);
				SecondPage.setVisible(true);

				SecondPage.setLayout(null);
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.setVisible(true);
				SecondPage.setVisible(false);
			}
		});
	}
}
