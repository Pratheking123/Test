package com.EnquiryManagement.service;

import java.util.Date;
import java.util.List;

import com.EnquiryManagement.entity.Enquiry;

public interface EnquiryService {

	public List<Enquiry> getEnquiryByTitle(String enqTitle);

	public List<Enquiry> getEnquiryByToday(Date d);

	public List<Enquiry> getAllEnquiries(Enquiry enq);

	public Enquiry addEnquiry(Enquiry enq);

	public Enquiry editEnquiry(Enquiry enq);

	public Enquiry deleteById(int id);

	public Enquiry editEnquiry(Enquiry enq, int id);

}
