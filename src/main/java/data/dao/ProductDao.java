package main.java.data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.domain.business.Product;

public class ProductDao extends GenericDao<Product>{
	
	public ProductDao(){}
	
	private static final String TABLE_NAME = "PRODUCT";

	@Override
	public Product build(ResultSet result) throws SQLException {
		Product p = new Product();
		p.setId(result.getInt("ID"));
		p.setName(result.getString("DESCRIPTION"));
		return p;
	}

	@Override
	public void insert(Product obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
}