package Application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		Department dp = new Department(1,"Comp");
		Seller s = new Seller(2,"weidson","weidson@gmail.com",new Date(),100.0,dp);
		System.out.println(s);
		

	}

}
