/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class DB {
    
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	DB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost/dblibrary";
			
			con=DriverManager.getConnection(url,"root","root");
			
			stmt=con.createStatement();
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		
	}
	public void update(String qry) throws Exception
	{
		stmt.executeUpdate(qry);
	}
	public ResultSet execute(String qry) throws Exception
	{
		rs=stmt.executeQuery(qry);
		return rs;
	}
    
}
