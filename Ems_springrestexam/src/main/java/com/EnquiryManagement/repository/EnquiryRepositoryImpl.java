package com.EnquiryManagement.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.EnquiryManagement.entity.Enquiry;

@Repository
public class EnquiryRepositoryImpl implements EnquiryRepository {
	private EntityManager entityManager;

	@Autowired
	public EnquiryRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public List<Enquiry> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from enquiry", Enquiry.class);
		List<Enquiry> info = query.getResultList();
		return info;
	}

	@Override
	public List<Enquiry> getEnquiryByTitle(String enqTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enquiry> getEnquiryByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enquiry> getAllEnquiries(Enquiry enq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEnquiry(Enquiry user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editEnquiry(Enquiry user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("delete Teams where id=:teamId");
		query.setParameter("teamId", id);
		query.executeUpdate();

	}

}
