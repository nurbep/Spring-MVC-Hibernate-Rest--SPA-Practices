package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.domain.Phone;
import edu.mum.repository.PhoneRepository;
import edu.mum.service.PhoneService;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {
	
	@Autowired
	PhoneRepository phoneRepository;
	
  	public List<Phone> getAll() {
		return  (List<Phone>) phoneRepository.findAll();
	}
	
	public Phone save(Phone phone) {
		return phoneRepository.save(phone);
		
	}
	
}
 
