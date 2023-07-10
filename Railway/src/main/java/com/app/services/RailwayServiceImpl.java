package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.app.dto.RailwayDTO;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.exceptions.InvalidData;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {
	
	@Autowired
	private RailwayRepository repo;
	
	@Autowired
	private ModelMapper mapper;
	

	@Override
	public List<Railway> getAllRails() {
		
		return repo.findAll();
		
	}


	@Override
	public Railway addNewRail(RailwayDTO rt) {
		Railway r=mapper.map(rt, Railway.class);
		if(r.getStarttime().isBefore(r.getEndtime())) {
		repo.save(r);
		}
		else {
			throw new InvalidData("invalid data");
		}
		return r;
	}


	@Override
	public List<Railway> getRailByCategory(Category c) {
		
		return repo.getByCategory(c);
	}

}
