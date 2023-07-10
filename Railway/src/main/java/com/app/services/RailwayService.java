package com.app.services;

import java.util.List;

import com.app.dto.RailwayDTO;
import com.app.entities.Category;
import com.app.entities.Railway;

public interface RailwayService {
	
	List<Railway> getAllRails();
	
	Railway addNewRail(RailwayDTO rt);
	
	List<Railway> getRailByCategory(Category c);

}
