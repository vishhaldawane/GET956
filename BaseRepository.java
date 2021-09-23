package com.lti.layer3;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public abstract class BaseRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public BaseRepository() {
		System.out.println("BaseRepository()....");
	}
	
	@Transactional
	public void persist(Object obj) { //persist is a dummy/userdefined name
		EntityManager entityManager = null;
		try {
				entityManager.persist(obj);			
		} finally { entityManager.close(); }

	}
	
	@Transactional
	public <AnyClass> AnyClass find(Class<AnyClass> theClass, Serializable pk ) {
		AnyClass foundSavingsAccObj = null;
		try {			
			foundSavingsAccObj = entityManager.find(theClass, pk);	
		} finally { entityManager.close(); }
			return foundSavingsAccObj;
	}
	
	@Transactional
	public <E> List  findAll(String pojoName) {
		try {			
			Query query = entityManager.createQuery(" from "+ pojoName);
			return query.getResultList();
		} finally { entityManager.close(); }
	}
	
	@Transactional
	public void merge(Object obj) {
		EntityManager entityManager = null;
		try {
			entityManager.merge(obj);		
		} finally { entityManager.close(); }
		
	}
	@Transactional
	public void remove(Object obj) {
		EntityManager entityManager = null;
		try {
			entityManager.remove(obj);	
		} finally { entityManager.close(); }
	}
}
