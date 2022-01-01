package model.interfaces;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert (Department dp);
	void update (Department dp);
	void DeleteById(Integer id);
	Integer FindById(Integer id);
	List<Department> Find();
	
}
