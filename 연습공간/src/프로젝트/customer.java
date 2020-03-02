package ������Ʈ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class customer {
	public static void main(String[] args) {
		//getCustomers();
	}
	
	public static void login(String id, String pw) {
		try {
			Connection conn = getConnection(); 
			PreparedStatement statement = conn.prepareStatement(
					"SELECT * FROM customer WHERE id=? AND pw=?");
			statement.setString(1, id);
			statement.setString(2, pw);
			ResultSet results = statement.executeQuery();
			
			if(results.next()) { //
				JOptionPane.showMessageDialog(null, "�α��� ����!");
			} else {
				JOptionPane.showMessageDialog(null, "���̵� �н����尡 Ʋ���ϴ�");
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String[][] getlogin() {
		try {
			Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(
					"SELECT * FROM login");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("id"),
						results.getString("pw"),
						results.getString("name"),
						results.getString("year"),
						results.getString("month"),
						results.getString("day"),
						results.getString("gender"),
						results.getString("phone"),
						results.getString("email")
				});				
			}
			System.out.println("�˻��Ǿ����ϴ�.");
			String [][] arr = new String[list.size()][5];
			return list.toArray(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void createCustomer(String id, String pw, String name, int year, int month, int day, String gender, String phone, String email) {
		try {
			Connection conn = getConnection();
			PreparedStatement insert = conn.prepareStatement(
					"INSERT INTO login(id, pw, name, year, month, day, gender, phone, email) "
					+ "VALUES ('"+id+"','"+pw+"','"+name+"','"+year+"','"+month+"','"+day+"','"+gender+"','"+phone+"','"+email+"')");
			insert.execute();
			System.out.println("�մ��� �������ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void createTable() {
		try {
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement(
				"CREATE TABLE IF NOT EXISTS "
				+"customer(customer_id int NOT NULL AUTO_INCREMENT,"
				+"id varChar(255),"
				+"pw varChar(45),"
				+"name varChar(45),"
				+"year int,"
				+"month int,"
				+"day int,"
				+"gender varChar(45),"
				+"phone varChar(45),"
				+"email varChar(45),"
				+"PRIMARY KEY(customer_id))");
			create.execute();
			System.out.println("���̺��� ��������ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/login?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1224";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
			System.out.println("DB ���� �Ϸ�!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
