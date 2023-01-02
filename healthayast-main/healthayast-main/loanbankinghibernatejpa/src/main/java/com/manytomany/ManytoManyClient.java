package com.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManytoManyClient {

	EntityManagerFactory emf = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	EntityManager getEntityManager() {
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityManager;
	}

	void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}

	}

	void addStudent() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Student student = new Student();
			student.setName("Priya");
			entityManager.persist(student);
		

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}

			closeEntityManagerFactory();

		}

	}
	
	
	void addStudentAsscoiateDep() {
		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Student student = entityManager.find(Student.class, 7);
			
			//Collection<Student> stus = new ArrayList();
			//stus.add(student);
			
			
			DepartmentMany departmentMany = entityManager.find(DepartmentMany.class, 1);
			DepartmentMany departmentMany1 = entityManager.find(DepartmentMany.class, 3);

			//departmentMany.setStudent(stus);
			
			Collection<DepartmentMany> deps = new ArrayList();
			deps.add(departmentMany);
			deps.add(departmentMany1);

			
			student.getDepartments().addAll(deps);
			
		

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}

			closeEntityManagerFactory();

		}

	}
	
	
	

	void addDepartment() {

		try {
			entityManager = getEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			

			DepartmentMany dept = new DepartmentMany();
			dept.setName("BE Mech");
			entityManager.persist(dept);
			
			

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}

			closeEntityManagerFactory();

		}

	}

	public static void main(String[] args) {

		try {

			ManytoManyClient manytoManyClient = new ManytoManyClient();
			//manytoManyClient.addStudent();
			
			// manytoManyClient.addDepartment();
			
			manytoManyClient.addStudentAsscoiateDep();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
