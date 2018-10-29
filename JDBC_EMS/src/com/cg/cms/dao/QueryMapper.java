package com.cg.cms.dao;

public interface QueryMapper {
	public static final String SELECTQRY="SELECT* FROM Table_emp11208";
	public static final String INSERTQRY1="INSERT INTO Table_emp11208 VALUES(3,'Sunil',34000,12-jan-2018)";
	public static final String INSERTQRY2="INSERT INTO Table_emp11208(emp_id,emp_name,emp_sal)" +"VALUES(444,'amit', 6000)";
	public static final String INSERTQRY3="INSERT INTO Table_emp11208(emp_id,emp_name,emp_sal)" +"VALUES(?,?,?)";
	public static final String DELETEQUERY1 = "DELETE FROM Table_emp11208 WHERE emp_id = ?";
	public static final String UPDATEQUERY1 = "UPDATE Table_emp11208 set emp_name=?,emp_sal=? where emp_id=?";

}
