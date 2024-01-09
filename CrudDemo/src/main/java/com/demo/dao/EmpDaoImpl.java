package com.demo.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.demo.model.Employee;
import java.util.ArrayList;

public class EmpDaoImpl implements EmpDao {

	static Connection conn;
	static PreparedStatement selemp,addemp;
	static {
	
		try {
			conn=DBUtil.getMyConnection();
			selemp=conn.prepareStatement("select * from Employee");
			addemp=conn.prepareStatement("insert into Employee values(?,?,?)");
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public List<Employee> getAllEmployee(){
			
		List<Employee> list=new ArrayList<>();
		try {
			ResultSet rs=selemp.executeQuery();
			while(rs.next()) {
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				list.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void AddNew(Employee e) {
		
		try {
			addemp.setInt(1, e.getId());
			addemp.setString(2,e.getName());
			addemp.setDouble(3,e.getSal());
			addemp.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
