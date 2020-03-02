package 프로젝트;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class customertable extends JFrame {

	private JPanel contentPane;
	private JTextField search;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customertable frame = new customertable();
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
	public customertable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null); //화면 중앙
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//String[][] data = Customer.getCustomers();	
		String[][] data = { { "1", "2", "3", "4", "5", "6","7","8","9" },	
							{ "1", "2", "3", "4", "5", "6","7","8","9" },
							{ "1", "2", "3", "4", "5", "6","7","8","9" } };
		String[] headers = { "ID" , "PW", "NAME", "YEAR", "MONTH", "DAY", "GENDER", "PHONE", "EMAIL" }; 		
		DefaultTableModel model = new DefaultTableModel(data, headers);		
		JTable table = new JTable(model);
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		table.setRowHeight(30); // 테이블 높이
		JScrollPane scrollPane = new JScrollPane(table);
		
		scrollPane.setLocation(5,128);
		scrollPane.setSize(774, 428);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("\uB9AC\uD504\uB808\uC26C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				model.setRowCount(0); //테이블 데이터 모두 삭제
				String[][] data = customer.getCustomers();
				for (int i = 0; i < data.length; i++) {
					model.addRow(data[i]);
				}
	
			}
		});
		btnNewButton.setBounds(567, 33, 133, 50);
		contentPane.add(btnNewButton);
		
		search = new JTextField();
		search.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String val = search.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<TableModel>(table.getModel());
				table.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(val));
			}
		});
		search.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		search.setBounds(57, 34, 351, 50);
		contentPane.add(search);
		search.setColumns(10);
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());
				String[] headers = { "id" , "pw","name", "year", "month", "day", "gender", "phone", "email" };
				if(row >= 0 && col >= 0) {
					//JOptionPane.showMessageDialog(null, row+","+col);
//					new Modal(row,headers[col]).setVisible(true);
				}
			}
		});
	}
}

