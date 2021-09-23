package com.lti.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.layer2.model.Dept;

@Repository
public interface DeptRepository { //DAO is known as Repository framework
	void insertDept(Dept dRef);
	Dept selectDeptByDeptNo(int dno);
	List<Dept> selectAllDepts();
	void updateDept(Dept dRef);
	void deleteDept(Dept dRef);
}
//interface DeptRepository cannot be instantiated
//but the child of this interface can be innstantiated
