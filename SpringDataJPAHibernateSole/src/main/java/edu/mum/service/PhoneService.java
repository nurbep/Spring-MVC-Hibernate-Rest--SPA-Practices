package edu.mum.service;

import java.util.List;

import edu.mum.domain.Phone;

public interface PhoneService {

	public List<Phone> getAll();

	public Phone save(Phone phone);

}
