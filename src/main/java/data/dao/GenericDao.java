package main.java.data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.data.util.Database;


public abstract class GenericDao<T> {
	
	public List<T> getList(){
		ResultSet result;
		try {
			result = Database.get().executeQuery(selectAllQuery());
			List<T> list = new ArrayList<>();
			while(result.next()){
				list.add(build(result));
			}
			return list;
		} catch (SQLException e) {
			System.err.println("Error");
			return null;
		}		
	}
	
	public abstract T build(ResultSet result) throws SQLException ;
	public abstract String selectAllQuery();
	public abstract void insert(T obj);
	public abstract void update(T obj);
	public abstract void delete(int id);


}