package common;

import java.sql.*;

public class JDBCUtil {
	// DataBase 연결 ( Connection ) 객체 : Oracle 
	
	// 기본 생성자 
	public JDBCUtil () {	
		System.out.println("JDBCUtil 호출 성공  ");
	}
	
	// static 메소드 : 객체 생성 없이 클래스 이름으로 호출됨 , 
	public static Connection getConnection () {
		Connection conn = null; 
		
		//오라클 DB : XE , C##HR, 1234,  <== 연결하는 구문 생성 
		String driver = "oracle.jdbc.driver.OracleDriver";  
		String url = "jdbc:oracle:thin:@localhost:1521:XE";  
	
		try { 
			Class.forName(driver);  
			conn = DriverManager.getConnection(url,"C##HR", "1234"); 
//			System.out.println ("DB 연결이 성공 했습니다. "); 
			
		}catch (Exception e) {
			System.out.println ("DB 연결이 실패 했습니다. ");
			e.printStackTrace(); 
		}
		
		
		return conn; 
	}
	
	
	

	
	
	
}