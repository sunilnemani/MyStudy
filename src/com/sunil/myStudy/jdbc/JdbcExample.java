/**
* @author N Sunil
*
*/

package com.sunil.myStudy.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JdbcExample
{

	public static void main(String[] args)
	{
		Driver driver = null;
		ResultSet res = null;
		Connection con = null;
		try
		{
			driver = new OracleDriver();
			DriverManager.registerDriver(driver);
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.150:1521:orcl", "attendance", "attendance");
			System.out.println("Connection Created");
			
			con.setAutoCommit(false);
			
			Statement statement = con.createStatement();
			res = statement.executeQuery("select ui_user_id,ui_user_name from adm_attemployee_master where ui_user_id='4023'");
			
			while(res.next())
			{
				String userId = res.getString("ui_user_id");
				String userName = res.getString("ui_user_name");
				System.out.println(userId+" - "+userName);
			}
			
		}
		catch (SQLException e)
		{
			System.err.print(e);
		}
		finally 
		{
			try
			{
				con.close();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
