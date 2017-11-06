package edu.mum.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Long> {
	public List<Phone> findByAreacodeOrPrefix(String areacode, String prefix);
	public long countByAreacode(String areacode);
}
