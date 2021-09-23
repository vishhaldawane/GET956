package com.lti.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.layer2.model.Dept;

@Repository
public class DeptRepositoryImpl extends BaseRepository implements DeptRepository {

	public void insertDept(Dept dRef) {
		super.persist(dRef);
	}

	public Dept selectDeptByDeptNo(int dno) {
		return super.find(Dept.class, dno);
	}

	public List<Dept> selectAllDepts() {
		return super.findAll("Dept");
	}

	public void updateDept(Dept dRef) {
		super.merge(dRef);
	}

	public void deleteDept(Dept dRef) {
		super.remove(dRef);
	}

}
