package com.EnquiryManagement.service.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.EnquiryManagement.entity.Enquiry;
import com.EnquiryManagement.repository.EnquiryRepository;
import com.EnquiryManagement.service.EnquiryService;

@Service
@Component
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryRepository erepo;

	
	public List<Enquiry> getEnquiryByTitle(String enqTitle) {
		List<Enquiry> e = erepo.getEnquiryByTitle(enqTitle);
		return e;
	}

	
	public List<Enquiry> getEnquiryByToday(Date d) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = formatter.format(java.util.Calendar.getInstance().getTime());
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
			List<Enquiry> e = erepo.getEnquiryByDate(date);
			if (e != null)
				return e;
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	
	public List<Enquiry> getAllEnquiries(Enquiry enq) {
		List<Enquiry> e = erepo.getAllEnquiries(enq);
		return e;
	}


	public Enquiry addEnquiry(Enquiry enq) {
		Enquiry e = new Enquiry();
		e.setEnqType(enq.getEnqType());
		e.setEnqTitle(enq.getEnqTitle());
		e.setEnqDesc(enq.getEnqDesc());
		e.setEnqDate(enq.getEnqDate());
		erepo.addEnquiry(e);
		return e;
	}

	
	public Enquiry editEnquiry(Enquiry enq) {
		erepo.editEnquiry(enq);
		return null;
	}

	
	public Enquiry deleteById(int id) {
		erepo.deleteById(id);
		return null;
	}

	
	public Enquiry editEnquiry(Enquiry enq, int id) {

		Enquiry e = enq;
		if (e.getId() == id) {
			e.setEnqType(enq.getEnqType());
			e.setEnqTitle(enq.getEnqTitle());
			e.setEnqDesc(enq.getEnqDesc());
			erepo.editEnquiry(e);
		}
		return e;
	}

}
