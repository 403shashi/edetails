package com.sathya.servletex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class BookDao
{
	public int savebook(String isbn,String name,String author,String price)
	{
	int result=0;
	//create the Connection
	Connection connection = DatabaseUtils.createConnection();

	try {
	//store the data into data base
	PreparedStatement preparedStatement = connection.prepareStatement("insert into bookdetails values(?,?,?,?)");
	preparedStatement.setString(1, isbn);
	preparedStatement.setString(2, name);
	preparedStatement.setString(3, author);
	preparedStatement.setString(4, price);
	result = preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{
	e.printStackTrace();
	}
	return result;
}
}
