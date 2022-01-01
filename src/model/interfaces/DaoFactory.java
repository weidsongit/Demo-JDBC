package model.interfaces;

import SellerDaoJDBC.SellerDaoJDBCImp;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBCImp();
		
	}

}
