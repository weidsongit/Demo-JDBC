package Application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DB;

public class program {

	public static void main(String[] args) {
		Connection conn=null;
		Statement st =null;
		ResultSet rs =null;
		
		try {
			conn =DB.getConnction();
			st=conn.createStatement();
			rs=st.executeQuery("select *from department");
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+", "+ rs.getString("Name"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DB.closeSatatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
		

	}

}
